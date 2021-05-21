#include"bits/stdc++.h"
using namespace std;

void towerOfHanoi(int x,char a,char b,char c){
	if(x==0) return ;
		towerOfHanoi(x-1,a,c,b);
		cout<<a<<"==>"<<c<<endl;
		towerOfHanoi(x-1,b,c,a);
}

int main(){
	int a;
	cin>>a;
	towerOfHanoi(a,'a','b','c');
}