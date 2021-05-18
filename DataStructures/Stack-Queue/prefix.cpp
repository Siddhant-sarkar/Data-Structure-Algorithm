#include<iostream>
#include<stack>
#include<string>

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

int prefix(string a){
  int b=a.length();
  stack<char> c;
  for(int i=b;i>0;i--){
    char ch= a[i];
    if(ch>='0'&&ch<='9'){
        c.push(ch-'0');
    }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
       int d=c.top();
       c.pop();
       int e=c.top();
       c.pop();
       c.push(resolve(ch,e,d));
    }
  }
  return c.top();
}
int main(){
   string s;
   cin>>s;
   cout<<"The prefix evaluation is "<<prefix(s)<<endl;
   return 0;
}
