#include<iostream>
#include<cmath>
#include<iterator>
#include<algorithm>
using namespace std;
int ar[20]={1,};
void factorial(){
	for(int i=1;i<16;i++){
		ar[i]=i*ar[i-1];
	}
}
void print(string s){
	int len=s.length();
	// cout<<ar[len]<<endl;
	for(int i=0;i<ar[len];i++){
		string ans="";
		int d=i;
		for(int j=len;j>=1;--j){
			int q=d/j,r=d%j;
			ans+=s[r];
			// cout<<ans<<endl;
			s.erase(s.begin()+r);
			d=q;

		}
		cout<<ans<<endl;
	}
}

int main(){
	factorial();
	string s;
	cin>>s;
	// cout<<0/2<<endl;
	// print(s);
	while(next_permutation(s.begin(),s.end())) cout<<s<<endl;
}