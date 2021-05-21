#include"bits/stdc++.h"
using namespace std;
const int N=10e5+5;
int ar[N];


void solve(){
		int l,r;
		cin>>l>>r;
		int gc=0;
		for(int i=1;i<=l-1;i++){
			gc=__gcd(gc,ar[i]);
		}
		for(int i=r+1;i<=N;i++){
			gc=__gcd(gc,ar[i]);
		}
		cout<<gc<<"\n";
}

int main(){
	int n,q;
	cin>>n>>q;
	for(int i=1;i<=n;i++){
		cin>>ar[i];
	}
	while(q--){
		solve();
	}

	return 0;
}