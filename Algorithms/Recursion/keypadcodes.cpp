#include<iostream>
#include<vector>
using namespace std;
vector<string>keypad{ ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
vector<string> getKCode(string s1){
	if(s1.length()==0){
		vector<string>my{""};
		return my;
	}
	int pos=(int)s1[0]-48;
	string append=keypad[pos];
	vector<string> s= getKCode(s1.substr(1));
	vector<string>my;
	for(char c : append){
		for (string st : s){
			my.push_back(c+st);
		}
	}
	return my;
}
int main(){
	string a,b;
	cin>>a;
	vector<string>s=getKCode(a);
	string ans="[";
	for(auto it:s) ans+=it+',';
	ans.erase(ans.end()-1);
	ans+="]";
	cout<<ans<<endl;
	return 0;
}