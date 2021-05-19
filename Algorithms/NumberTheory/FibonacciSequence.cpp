#include"bits/stdc++.h"
using namespace std;
vector<int> ar;

int generateFibonacci(int n){
	if(n<=1) return n;
	int a=generateFibonacci(n-1)+generateFibonacci(n-2);
	ar.push_back(a);
	return a;
}

int main(){
	int n=4;
	for(auto it:ar)
		cout<<it<<endl;
}