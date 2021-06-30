#include <iostream>
#include<string>
using namespace std;

char alpha(int a){
	char c=a+'a'-1;
	return c;
}
void printEncoding(string str, string asf){
	if(str[0]!='0'){
		if(str.length()==0){
			cout<<asf<<endl;
			return;
		}
		string s=str.substr(0,1);
		string ros=str.substr(1);
		printEncoding(ros,asf+(char)('a'-1+stoi(s)));
		if(str.length()>=2){
			string s2=str.substr(0,2);
			string ros2=str.substr(2);
			if(stoi(s2)<=26 )
				printEncoding(ros2,asf+(char)('a'-1+stoi(s2)));
		}
	}
	return;
}

int main(){
    string str;
    cin>>str;
    // cout<<str.substr(0,1);
    printEncoding(str,"");
    
}