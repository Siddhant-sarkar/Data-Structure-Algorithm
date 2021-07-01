#include<iostream>
#include<vector>
using namespace std;

int fibo(int n){
	if(n==0 || n==1) return n;
	int n1=fibo(n-1);
	int n2=fibo(n-2);
	return n1+n2;
}

int fiboOpt(int n,int arr[]){
	if(n==1 || n==0) return n;
	if(arr[n]!=0) return arr[n];
	int n1=fibo(n-1);
	int n2=fibo(n-2);
	arr[n]=n1+n2;
	return arr[n];
}
int main(){
	int n;
	cin>>n;
	int arr[n+1]{0};
	cout<<fiboOpt(n,arr);
}