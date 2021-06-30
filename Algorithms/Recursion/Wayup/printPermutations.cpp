#include <iostream>
#include<string>
using namespace std;

void printPermutations(string str, string asf){
    if(str.length()==0){
        cout<<asf<<endl;
        return;
    }
    for(int i=0;i<str.length();i++){
        auto l=str.substr(0,i);
        auto r=str.substr(i+1);
        printPermutations(l+r,asf+str[i]);
    }
}

int main(){
    string str;
    cin>>str;
    // cout<<str.substr(0,2);
    printPermutations(str,"");
    
}