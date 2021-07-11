#include<iostream>
#include<vector>
using namespace std;

void solve(){
	long long n,k;cin>>n>>k;
	vector<int> arr(100,0);
	while(n--){
		long long nm;cin>>nm;
		for(int i=0;1<<i<=nm;i++) 
			if(nm&1<<i) arr[i]++;
	}
	long long ans=0;
	for(auto it:arr){
		// cout<<it<<endl;
		ans+=(it/k)+it%k;
	}
	cout<<ans<<endl;
}
int main(){
	int n;cin>>n;	
	while(n--){
		solve();
	}
	return 0;
}  
