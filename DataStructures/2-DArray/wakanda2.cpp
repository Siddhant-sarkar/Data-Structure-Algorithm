#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int ar[n][n];
	for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin>>ar[i][j];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++)
			cout<<ar[i][j]<<"	";
		cout<<endl;
	}
	//code starts here
	for(int i=0;i<n;i++){
		for(int r=0,c=i;r<n && c<n;r++,c++) cout<<ar[r][c]<<endl;
	}
	return 0;
}