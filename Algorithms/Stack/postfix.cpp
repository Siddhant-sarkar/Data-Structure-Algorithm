#include<bits/stdc++.h>
using namespace std;
int resolve(char c,int a, int b){
    switch (c){
        case '+':
          return a+b;
          break;
        case '-':
          return a-b;
          break;
        case '*':
          return a*b;
          break;
        case '/':
          return a/b;
          break;
    }
    return 999999999;
}

int infix(string d){
  stack <char> s;
   for(int i =0;i<d.length();i++){
      char c= d[i];
      if(c>='0'&&c<='9'){
         s.push(c-'0');
      }else if(c=='*'||c=='/'||c=='-'||c=='+'){
          int a=s.top();
          s.pop();
          int b=s.top();
          s.pop();
          s.push(resolve(c,b,a));
        }
      else{
          cout<<"invalid operation performed on the operation  "<<d[i]<<endl;
      }
      }
   return s.top();
   }
int main(){
    cout<<"Write an Expression to be evaluated"<<endl;
    string s;
    cin>>s;
    cout<<infix(s)<<endl;
    return 0;
}
