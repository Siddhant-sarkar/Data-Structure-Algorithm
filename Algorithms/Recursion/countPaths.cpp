#include"bits/stdc++.h"
using namespace std;

int findPaths(int s,int e){
	if(s==e) return 1;
	if(s>e) return 0;

	int count=0;
	for(int i=1;i<7;i++){
		count+=findPaths(s+i,e);
	}
	return count;
}

int main(){
	int n;
	cin>>n;
	cout<<findPaths(0,n);
	return 0;
}