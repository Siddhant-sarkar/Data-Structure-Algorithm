#include <iostream>
using namespace std;

void printSS(string ques, string ans){
    if(ques.length()==0){
        cout<<ans<<endl;
        return;
    }
    char c=ques[0];
    string s=ques.substr(1);
    printSS(s,ans+c);
    printSS(s,ans);
}

int main(){
    string str;
    cin >> str;
    printSS(str, "");
}