#include"bits/stdc++.h"
using namespace std;
const int N=1e3+10;
int a[N][N];
int pr[N][N];

int main(){
	int n;
	cin>>n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			cin>>a[i][j];
			pr[i][j]=a[i][j]+pr[i-1][j]+pr[i][j-1]-pr[i-1][j-1];
		}
	}
	//	Now the formulae for prefix sum for 2d array is only mathematical inclusion 
	//	ans exclusion principal
	//	pr[i][j]=a[i][j]+pr[i-1][j]+pr[i][j-1]-pr[i-1][j-1]
	for(int i=0;i<=n;i++){
		for(int j=0;j<=n;j++){
			cout<<pr[i][j]<<"  ";
		}
		cout<<endl;
	}
}