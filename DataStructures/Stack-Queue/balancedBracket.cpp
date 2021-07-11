#include<iostream>
#include<stack>
using namespace std;

bool isBlanced(string s){
	stack<char>st;
	int op=0,cl=0;
	for(auto &it:s){
		if(it==')' || it=='}' || it==']'){
			cl++;
		}else if(it=='(' || it=='{' || it=='['){
			op++;
		}
	}
	if(op!=cl) return false;
	for(auto &it:s){
		if(it==')' || it=='}' || it==']'){
			char k=(it==')')?'(':(it=='}')?'{':'[';
			if(st.top()==k) st.pop();
		}else if(it=='(' || it=='{' || it=='['){
			st.push(it);
		}
	}
	return st.empty();
}
int main(){
	string s;getline(cin,s);
	cout<<boolalpha<<isBlanced(s)<<endl;
}