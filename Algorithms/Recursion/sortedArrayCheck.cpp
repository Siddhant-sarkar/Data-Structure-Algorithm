#include"bits/stdc++.h"
using namespace std;

bool isSorted(int ar[],int n){
	if(n==1) return true;
	return ar[0]<ar[1] && isSorted(ar+1,n-1);
}
int main(){
	int ar[6]={1,2,3,4,10,6};
	cout<<boolalpha<<isSorted(ar,6);
}