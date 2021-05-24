#include"bits/stdc++.h"
using namespace std;

int findPaths(int i,int j,int n){
	if(i==n-1 && j==n-1) return 1;
	else if(i>n-1 || j>n-1) return 0;
	return findPaths(i+1,j,n) + findPaths(i,j+1,n);
}


int main(){
	int n;
	cin>>n;
	cout<<findPaths(0,0,5);
}