#include"bits/stdc++.h"
using namespace std;

string move(string s){
	if(s.length()==0) return "";
	string ss=move(s.substr(1));
	// cout<<ss<<endl;
	if(s[0]!='x')
		return s[0]+ss;
	return ss+'x';
}

int main(){
	string s;
	cin>>s;
	cout<<move(s);
}