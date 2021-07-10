#include<iostream>
#include<vector>
using namespace std;

int main(){
	int t;cin>>t;	
	while(t--){
		int d,x,y,z;
		cin>>d>>x>>y>>z;
		cout<<max(x*7,y*d+(7-d)*z)<<endl;
	}
	return 0;
}
