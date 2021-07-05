#include<iostream>
#include<vector>

using namespace std;
int countSubsequence(string s){
	int a=0,ab=0,abc=0;
	for(char c:s){
		if(c=='a'){
			a=2*a+1;
		}else if(c=='b'){
			ab=2*ab+a;
		}else{
			abc=2*abc+ab;
		}
	}
	return abc;
}
int main(){
	string s;cin>>s;
	cout<<countSubsequence(s)<<endl;
	return 0;
}