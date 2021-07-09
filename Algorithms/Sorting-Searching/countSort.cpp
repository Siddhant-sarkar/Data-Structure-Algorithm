#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

void print(vector<int>&arr){
	for(auto it:arr) cout<<it<<endl;
	cout<<endl;
}
void countSort(vector<int>&arr){
	int min=*min_element(arr.begin(),arr.end());
	int max=*max_element(arr.begin(),arr.end());
	vector<int> freq(max-min+1,0);
	for(auto it:arr){
		freq[it-min]++;
	}
	for(int i=1;i<freq.size();i++){
		freq[i]+=freq[i-1];
	}
	for(auto &it:freq) it--;
	vector<int>ans(arr.size(),0);
	for(int i=arr.size()-1;i>=0;i--){
		ans[freq[arr[i]-min]]=arr[i];
		freq[arr[i]-min]--;
	}
	arr=ans;
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	countSort(arr);
	print(arr);
}