#include "bits/stdc++.h"
using namespace std;

const long long int mod=1'000'000'007;

long long findmodulo(long long a,long long b, long long mod){
	long long ans=1;
	a%=mod;
	while(b>0){
		if(b&1) 
			ans=(ans*a)%mod;
		a=(a*a)%mod;
		b>>=1;
	}
	return ans;
}

int main(){
	long long n;
	scanf("%lld",&n);

	cout<<findmodulo(2,n,mod);


	return 0;
}