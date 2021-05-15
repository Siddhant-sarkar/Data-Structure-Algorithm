#include "bits/stdc++.h"
using namespace std;

vector<pair<int,int>> fuck;
void solve(int n,int a,int b,int c){
  if(n>0){
    solve(n-1,a,c,b);
    fuck.push_back(make_pair(a,c));
    cerr<<a<<" "<<c<<"\n";
    solve(n-1,b,a,c);
  }
}
int main(){
  #ifndef ONLINE_JUDGE
  freopen("inputf.in", "r", stdin);
  freopen("outputf.in", "w", stdout);
  freopen("errorf.in", "w", stderr);
  #endif 

  int n;
  cin>>n;
  solve(n,1,2,3);
  cout<<fuck.size()<<endl;
  for(auto it:fuck){
    cout<<it.first<<" "<<it.second<<"\n";
  }
}