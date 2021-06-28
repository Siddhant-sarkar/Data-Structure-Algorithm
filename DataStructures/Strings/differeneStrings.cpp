#include<iostream>
using namespace std;

int main(){
	string s,ans="";	
	cin>>s;
	for(int i=0;i<s.length()-1;i++){
		ans+=s[i];
		ans+=to_string(s[i+1]-s[i]);
	}
	ans+=s.back();
	cout<<ans<<endl;
}