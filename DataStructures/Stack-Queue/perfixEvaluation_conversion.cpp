#include<iostream>
#include<stack>
using namespace std;

int prec(char x){
	if(x=='+'|| x=='-')	 return 1;
	else return 2;
}
int doShit(int val1,int val2,char c){
	if(c=='+') return val1+val2;
	else if(c=='-') return val1-val2;
	else if(c=='*')	 return val1*val2;
	else return val1/val2;
}

void convert(string s){
	stack<string> post;
	stack<string> in;
	stack<int>val;
	for(int i=s.length()-1;i>=0;i--){
		if(s[i]>='0' && s[i]<='9'){
			string temp="";
			temp+=s[i];
			post.push(temp);
			in.push(temp);
			val.push(s[i]-'0');
		}else{
				int val2=val.top();val.pop();
				int val1=val.top();val.pop();
				val.push(doShit(val2,val1,s[i]));

				string s2=post.top();post.pop();
				string s1=post.top();post.pop();
				string temp="";
				temp=s2+s1+s[i];
				post.push(temp);

				s2=in.top();in.pop();
				s1=in.top();in.pop();
				temp="";
				temp="("+s2+s[i]+s1+")";
				in.push(temp);
		}
	}
	cout<<val.top()<<endl;
	cout<<in.top()<<endl;
	cout<<post.top()<<endl;
}
int main(){
	string s;getline(cin,s);
	convert(s);
}