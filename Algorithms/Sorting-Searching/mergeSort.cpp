#include"bits/stdc++.h"
using namespace std;

void print(int ar[],int n){
	for(int i=0;i<n;i++)
		cout<<ar[i]<<"	";
	cout<<endl;
}
void merge(int ar[],int l,int m,int r){
	int x=0,y=0,k=0;
	int t1[m-l+1];
	int t2[r-m];
	// two half of the array have been copied
	for(int i=0;i<m-l+1;i++){
		t1[i]=ar[i];
	}
	for(int i=0;i<r-m;i++){
		t2[i]=ar[m+1+i];
	}
	while(x<m-l+1 && y<r-m){
		if(t1[x]<=t2[y]){
			ar[k]=t1[x];
			x++;
		}else{
			ar[k]=t2[y];
			y++;
		}
		k++;
	}
	while(x<m-l+1){
		ar[k]=t1[x];
		x++;
		k++;
	}
	while(y<m-r){
		ar[k]=t2[y];
		y++;
		k++;
	}

}
void mergeSort(int ar[],int l,int r){
	int m=(l+r)/2;
	if(l<r){
		mergeSort(ar,l,m);
		mergeSort(ar,m+1,r);
		merge(ar,l,m,r);
	}
}
int main(){
	int ar[6]={4,3,2,5,2,4};
	mergeSort(ar,0,6);
	print(ar,6);
}