#include<iostream>
#include<vector>
#include<cmath>
using namespace std;

long long findPlots(int n){
	long long sp=1,bl=1,co=0;
	for(long long i=2;i<=n;i++){
		long long nsp=sp+bl;
		long long nbl=sp;
		co=(nsp+nbl)*(nsp+nbl);
		sp=nsp;
		bl=nbl;
	}
	long long t=sp+bl;
	t*=t;
	return   t;
}
int main(){
	int cn;cin>>cn;
	cout<<findPlots(cn)<<endl;
	return 0;
}