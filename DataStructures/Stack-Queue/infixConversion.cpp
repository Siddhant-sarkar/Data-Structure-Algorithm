#include<iostream>
#include<stack>
#include<string>
using namespace std;

int prec(char a){
	if (a=='+') return 1;
	else if (a=='-') return 1;
	else if (a=='*') return 2;
	else return 2;
}

int doShit(int val1,int val2,char c){
	if(c=='+') return val1+val2;
	if(c=='-') return val1-val2;
	if(c=='*') return val1*val2;
	else return val1/val2;
}
void convert(string s){
	stack<string>pre;
	stack<string>post;
	stack<char>op;
	for(int i=0;i<s.length();i++){
		if(s[i]>='0' && s[i]<='9' || s[i]>='a' && s[i]<='z' || s[i]>='A' && s[i]<='Z'){
			string tmep="";
			tmep+=s[i];
			pre.push(tmep);
			post.push(tmep);
		}else if(s[i]=='('){
			op.push('(');
		}else if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/'){
			while(!op.empty() && op.top()!='(' && prec(s[i])<=prec(op.top())){
				string s2=pre.top();pre.pop();
				string s1=pre.top();pre.pop();
				string oper="";
				oper+=op.top();op.pop();
				pre.push(oper+s1+s2);
				s2=post.top();post.pop();
				s1=post.top();post.pop();
				post.push(s1+s2+oper);
			}
			op.push(s[i]);
		}else if(s[i]==')'){
			while(!op.empty() && op.top()!='('){
				string s2=pre.top();pre.pop();
				string s1=pre.top();pre.pop();
				string oper="";
				oper+=op.top();op.pop();
				pre.push(oper+s1+s2);
				s2=post.top();post.pop();
				s1=post.top();post.pop();
				post.push(s1+s2+oper);
			}
			op.pop();
		}
	}
	while(!op.empty()){
		string s2=pre.top();pre.pop();
		string s1=pre.top();pre.pop();
		string oper="";
		oper+=op.top();op.pop();
		pre.push(oper+s1+s2);
		s2=post.top();post.pop();
		s1=post.top();post.pop();
		post.push(s1+s2+oper);
	}
	cout<<post.top()<<endl;
	cout<<pre.top()<<endl;
}
int main(){
	string s;
	getline(cin,s);
	// cout<<s<<endl;
	convert(s);

}