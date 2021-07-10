#include<iostream>
#include<vector>
#include<climits>
using namespace std;

int partiton(vector<int>&arr,int p){
	int i=0,j=0;
	while(j<arr.size()){
		if(arr[j]<=p){
			swap(arr[i],arr[j]);
			i++,j++;
		}else j++;
	}
	return arr[0];
}
int logn(vector<int>&arr){
	int i=0,j=arr.size()-1;
	int m=INT_MAX;
	while(i<j){
		int mid=(i+j)/2;
		if(arr[mid]<arr[j]){
			j=mid;
		}else{
			i=mid+1;
		}
	}
	return arr[i];
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++)cin>>arr[i];
	cout<<logn(arr)<<endl;
}