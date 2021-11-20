#include"bits/stdc++.h"
using namespace std; 

void solve(){
	int n,k;
	cin>>n>>k;
	int arr[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	for(int i=k-1;i<n;i++){
		if(arr[i]!=arr[k-1]){
			cout<<-1<<endl;
			return;
		}
	}
	int c=0;
	for(int i=k-1;i>=0;i--){
		if(arr[i]!=arr[k-1]) break; 
		c++;
	}
	cout<<k-c<<endl;

}
int main(){
	int t =1;
	// cin>>t;
	while(t--){
		solve();
	}
}