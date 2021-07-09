#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>
using namespace std;

void print(vector<int>arr){
	for(auto it:arr) cout<<it<<" ";
	cout<<endl;
}
void countSort(vector<int>&arr,int exp){
	vector<int>freq(10);
	vector<int>ans(arr.size());
	for(int j=0;j<arr.size();j++){
		int np=arr[j]/exp%10;
		freq[np]++;
	}
	for(int j=1;j<freq.size();j++){
		freq[j]	+=freq[j-1];
	}
	for(int j=arr.size()-1;j>=0;j--){
		int np=arr[j]/exp%10;
		ans[freq[np]-1]=arr[j];
		freq[np]--;
	}
	arr=ans;
}
void radixSort(vector<int>&arr){
	int max=*max_element(arr.begin(),arr.end());
	int e=1;
	while(e<=max){
		cout<<"After sorting on "<<e<<" place -> ";
		countSort(arr,e);
		print(arr);
		e*=10;
	}
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	radixSort(arr)	;
	print(arr);
}