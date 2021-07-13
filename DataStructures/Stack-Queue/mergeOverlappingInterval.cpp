#include"bits/stdc++.h"
using namespace std;
  
void mergeTheTime(vector<pair<int,int>>tm){
  sort(tm.begin(),tm.end());
  stack<pair<int,int>>st;
  vector<pair<int,int>>ans;
  st.push(tm[0]);
  for(int i=1;i<tm.size();i++){
    if(st.top().second>=tm[i].first){
      st.top().second=max(tm[i].second,st.top().second); //<== This was the line where i was making the mistake
                                                        // i had to take the maximum of the end time of the st.top()'s and the new tm[i] end time..
    }else{
      ans.push_back(st.top());
      st.push(tm[i]);
    }
  }
  ans.push_back(st.top());
  for(auto it:ans){
    cout<<it.first<<" "<<it.second<<endl;
  }
}


int main(){
  int n;cin>>n;
  vector<pair<int,int>> tm(n);
  for(auto &it:tm){
    cin>>it.first>>it.second;
  }
  mergeTheTime(tm);
  return 0;
}