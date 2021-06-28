#include<iostream>
#include<string>
#include<iterator>
#include<set>
using namespace std;
//This is so good to be true;

bool is_palindrome(string s){
	int l=0,h=s.length()-1;
	while(l<=h){
		if(s[l]!=s[h]) return false;
		l++,h--;
	}
	return true;
}
set<string> generate(string s){
	set<string>st;
	for(int i=0;i<(int)s.length();i++){
		for(int j=0;j<(int)s.length()-i;j++){
			string t=s.substr(i,j+1);
			if(t=="") continue;
			// cout<<t<<endl;
			if(is_palindrome(t)) cout<<t<<endl;
		}
	}
	return st;
}
int main(){
	string s;	
	cin>>s;
	if(s.length()==1){
		cout<<s<<endl;
		return 0;
	}
	set<string> st=generate(s);
	for(auto s:st){
		cout<<s<<endl;
	}
	return 0;
}