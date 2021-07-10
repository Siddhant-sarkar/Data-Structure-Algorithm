#include<iostream>
#include<vector>
using namespace std;

void solve(){
	long long n,k;cin>>n>>k;
	vector<int>pcount(31,0);
	while(n--){
		int m;cin>>m;
		for(int j=0;j<=30;j++){
			if(m&1<<j) pcount[j]++;

		}
	}
	long long ans=0;
	for(auto it:pcount){
		cout<<it<<"	";
		ans+=(it/k+it%k);
	} 
	cout<<endl;
	cout<<ans<<endl;
}
int main(){
	int n;cin>>n;	
	while(n--){
		solve();
	}
	return 0;
}  
