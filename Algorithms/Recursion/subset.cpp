#include<iostream>
using namespace std;

void subset(int ar[],int n){
	for(int i=0;i<1<<n;i++){
		for(int j=0;j<n;j++){
			if(i&1<<j) cout<<ar[n-1-j]<<"\t";
			else cout<<"-\t";
		}
		cout<<endl;
	}
}
int main(){
	int n;
	cin>>n;
	int ar[n];
	for(int i=0;i<n;i++) cin>>ar[i];

	subset(ar,n);
}