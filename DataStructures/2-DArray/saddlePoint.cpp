#include<iostream>
#include<climits>
using namespace std;

int main(){
	int n;
	cin>>n;
	int ar[n][n],f=-9;
	for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin>>ar[i][j];
	for(int i=0;i<n;i++){
		int col=-9,mi=INT_MAX;
		for(int j=0;j<n;j++){
			if(ar[i][j]<mi){
				mi=ar[i][j];
				col=j;
			}
		}
		for(int j=0;j<n;j++){
			if(ar[j][col]>mi){
				f=-1;
				break;
			}
			f=mi;
		}
	}
	(f<0)?cout<<"Invalid input\n":cout<<f<<endl;
}