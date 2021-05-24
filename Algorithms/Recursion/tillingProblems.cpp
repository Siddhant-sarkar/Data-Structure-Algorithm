#include"bits/stdc++.h"
using namespace std;

int tillingWays(int n){
	return n<=1? n: tillingWays(n-1)+tillingWays(n-2);
}
int main(){
	int n;
	cin>>n;
	cout<<tillingWays(n);
}