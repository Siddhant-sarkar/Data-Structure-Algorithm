#include<iostream>
#include<stack>
#include<string>
using namespace std;

int doShit(int val1 ,int val2,char c){
	if(c=='+') return val1+val2;
	else if(c=='-') return val1-val2;
	else if(c=='*') return val1*val2;
	else return val1/val2;
}
void convert(string s){
	stack<int>val;
	stack<string>in;
	stack<string>pre;
	for(int i=0;i<s.length();i++){
		if(s[i]>='0' && s[i]<='9') {
			val.push(s[i]-'0');
			string temp="";
			temp+=s[i];
			pre.push(temp);
			in.push(temp);
		}
		else{
			int v2=val.top();val.pop();
			int v1=val.top();val.pop();
			val.push(doShit(v1,v2,s[i]));
			string s2=in.top();in.pop();
			string s1=in.top();in.pop();
			string temp="("+s1+s[i]+s2+")";
			in.push(temp);
			s2=pre.top();pre.pop();
			s1=pre.top();pre.pop();
			temp=s[i]+s1+s2;
			pre.push(temp);
		}
	}

	cout<<val.top()<<endl;
	cout<<in.top()<<endl;
	cout<<pre.top()<<endl;
}
int main(){
	string s;
	getline(cin,s);
	convert(s);
	return 0;
}