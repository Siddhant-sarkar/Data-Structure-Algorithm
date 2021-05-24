#include"bits/stdc++.h"
using namespace std;

int friendsPairs(int n){
	if(n==0 || n==1) return 1;
	return friendsPairs(n-1) + (n-1)*friendsPairs(n-2);
}
int main(){
	int i;
	cin>>i;
	cout<<friendsPairs(i);
}