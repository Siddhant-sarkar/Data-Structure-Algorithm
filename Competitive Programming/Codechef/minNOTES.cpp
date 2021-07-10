#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void solve(){
	int n;cin>>n;	
	vector<int>arr(n);
	for(auto &it:arr) cin>>it;
	int min=*min_element(arr.begin(),arr.end());
	int max=*max_element(arr.begin(),arr.end());
	
}
int main(){
	int t;cin>>t;
	while(t--){
		solve();
	}
}