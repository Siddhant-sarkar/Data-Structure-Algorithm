#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int partition(vector<int>&arr,int p,int l,int h){
	int  i=0,j=0;
	while(i<arr.size()){
		if(arr[i]>p){
			i++;
		}else{
			swap(arr[i],arr[j]);
			j++;
			i++;
		}
	}
	return j-1;
}
int quickSelect(vector<int>&arr,int k,int l,int h){
	int pi=partition(arr,arr[h],l,h);
	if(k<pi){
		return quickSelect(arr,k,l,pi-1);
	}else if(k>pi) {
		return quickSelect(arr,k,pi+1,h);
	}else{
		return arr[k];
	}
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	cin>>n;
	cout<<quickSelect(arr,n-1,0,arr.size()-1)<<endl;
	sort(arr.begin(),arr.end());
	for(auto it:arr) cout<<it<<endl;
}
