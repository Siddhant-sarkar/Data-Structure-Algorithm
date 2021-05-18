#include"bits/stdc++.h"
using namespace std;

int findGcd(int a,int b){
	if(!b)
		return a;
	return findGcd(b,a%b);
}

int findGcdRec(int a,int b){
	while(b){
		a%=b;
		swap(a,b);
	}
	return a;
}
int main(){
	cout<<findGcdRec(4,10)<<endl;
}