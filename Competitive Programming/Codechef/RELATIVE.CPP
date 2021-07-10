#include<iostream>
#include<vector>
using namespace std;

int main(){
	int n;cin>>n;
	while(n--){
		long long g,c;
		cin>>g>>c;	
		cout<<(long long)(c*c)/(2*g)<<endl;	
	}
}