#include<iostream>
#include<stack>
#include<vector>
using namespace std;
bool isvalid(string s){
	stack<char>st;
	for(auto &it:s){
		if(it==')'){
			if(st.top()=='(') return true;
			while(st.top()!='(') st.pop();
			st.pop();
			// cout<<st.top()<<endl;
		}else st.push(it);
	}
	return false;
}
int main(){
	string s;
	getline(cin,s);
	// cout<<s<<endl;
	cout<<boolalpha<<isvalid(s)<<endl;
}