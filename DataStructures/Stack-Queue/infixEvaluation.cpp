#include<iostream>
#include<stack>
#include<string>
#include<algorithm>
using namespace std;

int pre(char a){
	if(a=='+') return 1;
	else if(a=='-') return 1;
	else if(a=='*') return 2;
	else return 2;
}
int doshit(int val1,int val2,char c){
	if(c=='+') return val1+val2;
	else if(c=='-') return val1-val2;
	else if(c=='*') return val1*val2;
	else return val1/val2;
}
int infixEvaluation(string s){
	stack<int>n;
	stack<char> op;
	for(int i=0;i<s.length();i++){
		if(s[i]>='0' && s[i]<='9') n.push(s[i]-'0');
		else if(s[i]==')'){
			while(!op.empty() && op.top()!='('){
				int v2=n.top();n.pop();
				int v1=n.top();n.pop();
				n.push(doshit(v1,v2,op.top()));
				op.pop();
			}
			op.pop();
		}else if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/'){
			while(!op.empty() && op.top()!='(' && pre(s[i])<=pre(op.top())){
				int v2=n.top();n.pop();
				int v1=n.top();n.pop();
				n.push(doshit(v1,v2,op.top()));
				op.pop();
			}
			op.push(s[i]);
		}else if(s[i]=='(') op.push('(');
	}
	while(!op.empty()){
		int v2=n.top();n.pop();
		int v1=n.top();n.pop();
		n.push(doshit(v1,v2,op.top()));
		op.pop();
	}
	return n.top();
}
int main(){
	string s;
	getline(cin,s);
	cout<<infixEvaluation(s)<<endl;
	return 0;
}