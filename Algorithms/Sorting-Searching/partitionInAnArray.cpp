#include<iostream>
#include<string>
#include<vector>
using namespace std;

void partitionAnArray(vector<int>&arr,int p){
	int i=0,j=0;
	while(i<arr.size()){
		if(arr[i]>p) i++;
		else if(arr[i]<=p){
			string s="Swapping "+to_string(arr[i])+" and "+to_string(arr[j]);
			cout<<s<<endl;
			swap(arr[i],arr[j]);
			i++;
			j++;
		}
	}
}
int main(){
	int n;cin>>n;
	vector<int> arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	cin>>n;
	partitionAnArray(arr,n);
	for(auto it:arr){
		cout<<it<<" ";
	}
	cout<<endl;

}