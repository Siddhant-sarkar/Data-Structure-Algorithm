#include"bits/stdc++.h"
using namespace std;

void generatePermutation(string s,string ans){
	if(s.length()==0){
		cout<<ans<<endl;
		return;
	}
	for(int i=0;i<s.length();i++){
		ans=s[i]+ans;
		generatePermutation(s.substr(1),ans);
		ans.pop_back();
	}
}
int main(){
	string s;
	cin>>s;
	generatePermutation(s,"");
}