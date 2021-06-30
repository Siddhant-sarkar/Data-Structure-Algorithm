#include <iostream>
using namespace std;

string codes[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

void printKPC(string ques, string asf){
    if(ques.empty()){
        cout<<asf<<endl;
        return;
    }
    int n=(int)ques[0]-48;
    for(auto it:codes[n]){
        printKPC(ques.substr(1),asf+it);
    }
}

int main(){
    string str;
    cin >> str;
    printKPC(str, "");
}