#include"bits/stdc++.h"
using namespace std;
string ss;
void generate(string s,string ans){
	if(s.length()==0){
		cout<<ans<<endl;
		return;
	}
	generate(s.substr(1),ans+s[0]);
	generate(s.substr(1),ans);

}

int main(){
	string s;
	cin>>s;
	generate(s,"");
}