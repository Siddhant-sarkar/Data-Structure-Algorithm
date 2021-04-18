#include<bits/stdc++.h>
using namespace std;

void isBalanced(string s){
  stack <char>S;
   for(int i=0;i<s.length();i++){
      if(s[i]=='{') S.push(s[i]);
      else if(s[i]=='}') S.pop();
   }
   if(S.empty()){
      cout<<"The paranthesis are balanced"<<endl;
   }else{
      cout<<"the Paranthesis are not balanced"<<endl;
   }
}

int main(){
    string s;
    cin>>s;
    isBalanced(s);
}
