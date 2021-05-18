#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool isNumber(char c){
    if(c>='a'&&c<='z'){
        return 1;
    }
    return 0;
}
bool isOperator(char a){
    if(a=='+'||a=='-'||a=='*'||a=='/') return 1;
    return 0;
}
int precedence(char a){
    if(a=='^') return 3;
    else if (a=='*'||a=='/') return 2;
    else if (a=='+'||a=='-') return 1;
    else return -1;
}
string expConverter(string a){
    stack<char> s;
    string c;
    int b=a.length();
    for(int i=0;i<b;i++){
      char d=a[i];
      if(d=='('){
        s.push(d);
      }else if(isNumber(d)){
        c+=d;
      }else if(d==')'){
        while(!s.empty()&&s.top()!='('){
          c+=s.top();
          s.pop();
        }
        if(!s.empty()) s.pop();
      }else if (isOperator(d)){
          if(s.empty()||s.top()=='('){
              s.push(d);   
          }else if(precedence(d)>precedence(s.top())){
              s.push(d);
          }else{
              while(!s.empty()&&precedence(d)<=precedence(s.top())){
                c+=s.top();
                s.pop();
              }s.push(d);
          }
      }
    }
    while(!s.empty()){
        c+=s.top();
        s.pop();
    }
    return c;
}


int main(){
  string a;
  cin>>a;
  a=expConverter(a);
  cout<<a;
  return 0;
}
