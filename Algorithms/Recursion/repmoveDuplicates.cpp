#include"bits/stdc++.h"
using namespace std;

string removeDuplicates(string s){
	if(s.length()==0) return "";
	char c=s[0];
	string ss=removeDuplicates(s.substr(1));
	if(ss[0]!=c)
		return c+ss;
	return c+ss.substr(1);
}
int main(){
	string s;
	cin>>s;
	cout<<removeDuplicates(s);
}