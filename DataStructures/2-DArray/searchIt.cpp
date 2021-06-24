#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int ar[n][n];
	for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin>>ar[i][j];
	int f;
	cin>>f;
	int r=0,c=n-1;
	while(r<n && c>=0){
		if(f==ar[r][c]){
			cout<<r<<"\n"<<c<<endl;
			return 0;
		}else if(f<ar[r][c]){
			c--;
		}else{
			r++;
		}
	}
	cout<<"Not Found\n";
	return 0;
}