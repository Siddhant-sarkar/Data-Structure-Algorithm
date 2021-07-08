#include<iostream>
#include<climits>
#include<vector>
using namespace std;

int findPrice(vector<int>&arr){
	int min=INT_MAX;
	int res=0;
	for(int i=1;i<arr.size();i++){
		if(arr[i]>=arr[i-1]){
			res+=arr[i]-arr[i-1];
		}
	} 
	return res;
}
int main(){
	int n;cin>>n;
	vector<int> arr(n);
	for(int i=0;i<=n;i++) cin>>arr[i];
	cout<<findPrice(arr)<<endl;
}
