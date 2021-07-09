#include<iostream>
#include<vector>
using namespace std;


void sortt(vector<int>&arr){
	int j=0,i=0;
	while(j<arr.size()){
		if(arr[j]) j++;
		else{
			cout<<"Swapping index "<<j<<" and "<<"index "<<i<<endl;
			swap(arr[j],arr[i]);
			i++;
			j++;
		}
	}

}
int main(){
	int n;cin>>n;	
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	sortt(arr);
	for(auto it:arr)cout<<it<<endl; 
}