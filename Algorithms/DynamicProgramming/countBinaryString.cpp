#include<iostream>
#include<vector>
#include<cmath>
using namespace std;


int findString(int n){
	vector<int>z(n+1);
	z[1]=1;
	vector<int>o(n+1);
	o[1]=1;
	vector<int>a(n+1);
	for(int i=2;i<=n;i++){
		z[i]=o[i-1];
		o[i]=(z[i-1]+o[i-1]);
		a[i]=z[i]+o[i];
	}
	return (*a.rbegin());

}
int main(){
	int n;
	cin>>n;
	cout<<findString(n)<<endl;
	return 0;
}