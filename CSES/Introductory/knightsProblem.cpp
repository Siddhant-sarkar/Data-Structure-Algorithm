#include "bits/stdc++.h"
using namespace std;

vector<int> b(1000,0);

int c=0;

long long findHorse(long long n){
	if(n==1) return 0LL;
	long long a= ((n*n)*((n*n)-1))/2;
	long long b= 4*(n-1)*(n-2);

	return (long long)a-b;
}

int main(){
	int n;
	cin>>n;
	for (int i = 1; i <= n; ++i)
	{
		cout<<findHorse(i)<<"\n";
	}
	return 0;
}