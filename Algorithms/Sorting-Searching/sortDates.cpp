#include<iostream>
#include<climits>
#include<algorithm>
#include<vector>
#include<cmath>
using namespace std;

void print(vector<int> &arr) {
	for(auto it:arr){
		if((int)log10(it)+1==7) cout<<"0"<<it<<endl;
		else cout<<it<<endl;
	}
	cout<<endl;
}
void countSort(vector<int>&arr,int div,int mod,int range){
	int mi=INT_MAX,ma=INT_MIN;
	vector<int>fq(range);
	for(auto it:arr){
		mi=min(mi,(it/div)%mod);
		ma=max(ma,(it/div)%mod);
	}
	for(auto it:arr){
		fq[it/div%mod-mi]++;
	}
	for(int i=1;i<fq.size();i++){
		fq[i]+=fq[i-1];
	}
	for(auto &it:fq) it--;
	vector<int>ans(arr.size());
	for(int i=arr.size()-1;i>=0;i--){
		ans[fq[(arr[i]/div)%mod - mi]]=arr[i];
		fq[(arr[i]/div)%mod - mi]--;
	}
	arr=ans;
}


void sortDates(vector<int>&dates){
	countSort(dates,1000000,100,30);
	countSort(dates,10000,100,13);
	countSort(dates,1,10000,2501);
}
int main(){
	int n;cin>>n;
	vector<int>dates(n);
	for(int i=0;i<n;i++) cin>>dates[i];
	sortDates(dates);
	print(dates);
	
}