#include "bits/stdc++.h"
using namespace std;

long long binaryExponentiation(long long a,long long b){
	if(b==0)
		return 1;
	long long c=binaryExponentiation(a,b/2);
	if(b%2)
		return c*c*a;
	else
		return c*c;
}


long long binaryExponentiationFast(long long a,long long b){
	long long r=1;
	while(b>0){
		if(b&1) 
			r*=a;
		a*=a;
		b>>=1;
	}
	return r;
}

int powerModulo(int a,int b,int m){
	a%=m;
	int r=1;
	while(b>0){
		if(b&1)
			r=(r*a)%m;
		a=(a*a)%m;
		b>>=1;
	}
	return r;
}



int main(){
	int n;
	cin>>n;
	cout<<binaryExponentiationFast(5,4)<<"\n";
	cout<<powerModulo(5,5,5);
	// cout<<computeModulo(5,4,6);
}