#include<iostream>
#include<stack>
#include<string>
using namespace std;
//we are using stack to reverse a string;
string reverse(string &a,int n){
   stack<char> s;
   for(int i=0;i<n;i++){
      s.push(a[i]);
   }
   for(int i=0;i<n;i++){
      a[i]=s.top();
      s.pop();
   }
   return a;
}
int main(){
    string a;
    cin>>a;
    cout<<reverse(a,4);
    return 0;
}
