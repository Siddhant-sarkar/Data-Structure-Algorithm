#include"bits/stdc++.h"
using namespace std;
void pattern(string s){
  // its a beautiful algorithm to wowk with 
  int n=1;
  string ans="";
  stack<int>st;
  for(int i=0;i<s.length();i++){
    if(s[i]=='d'){
      st.push(n);
      n++;
    }else{
      st.push(n);
      n++;
      while(!st.empty()){
        ans+=to_string(st.top());
        st.pop();
      }
    }
  }
  st.push(n);
  // n++;
  while(!st.empty()){
    ans+=to_string(st.top());
    st.pop();
  }
  cout<<ans<<endl;
}

int main(){
  string s; cin>>s;
  pattern(s);
}