#include"bits/stdc++.h"
using namespace std;

void generatePermutation(string s,string ans){
	if(s.length()==0){
		cout<<ans<<endl;
		return;
	}
	for(int i=0;i<s.length();i++){
		generatePermutation(s.substr(0,i)+s.substr(i+1),ans+s[i]);
	}
}
int main(){
	string s;
	cin>>s;
	// cout<<s.substr(0,4)+s.substr(5);
	generatePermutation(s,"");
}