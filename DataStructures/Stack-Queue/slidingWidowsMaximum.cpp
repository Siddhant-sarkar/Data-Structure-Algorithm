#include<iostream>
#include<stack>
#include<vector>
using namespace std;

void print(vetor<int>&arr) {
	for(auto it:arr) cout<<it<<endl;
	cout<<endl;
}
void slideIt(vector<int>&arr,int k){
	
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(auto &it:arr) cin>>it;
	cin>>n;
	slideIt(arr,n);
	print(arr);


	return 0;
}