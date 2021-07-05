#include<iostream>
#include<vector>


using namespace std;

int paintFence(int n,int k){
	int ii=k,ij=k*(k-1);
	for(int i=3;i<=n;i++){
		int nii=ij;
		int nij=(ii+ij)*(k-1);
		ii=nii;
		ij=nij;
	}
	return ii+ij;
}
int main(){
	int n,k;cin>>n>>k;
	cout<<paintFence(n,k)<<endl;
}