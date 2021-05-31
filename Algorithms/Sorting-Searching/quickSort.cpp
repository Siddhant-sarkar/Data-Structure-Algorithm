#include"bits/stdc++.h"
using namespace std;

void print(int ar[],int n){
	for(int i=0;i<n;i++)
		cout<<ar[i]<<"	";
	cout<<endl;
}

int partition(int ar[],int l,int r){
	int i=l-1;
	int p=ar[r];
	for(int j=l;j<r;j++)	{
		if(ar[j]<p){
			i++;
			swap(ar[i],ar[j]);
		}
	}
	swap(ar[i+1],ar[r]);
	return i+1;
}

void quicksort(int ar[],int l,int r){
	if(l<r){
		int p=partition(ar,l,r);
		quicksort(ar,l,p-1);
		quicksort(ar,p+1,r);
	}
}
int main(){
	int ar[6]={1,4,5,2,3,6};
	quicksort(ar,0,4);
	print(ar,6);
}