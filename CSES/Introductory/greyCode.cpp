#include"bits/stdc++.h"
using namespace std;

std::vector< string> generate(int n){
    vector<string> s;
    s.push_back("0");
    s.push_back("1");

    for(int i=2;i<(1<<n);i=i<<1){
        for(int j=i-1;j>=0;j--){
           s.push_back(s[j]);
        }
        for(int j=0;j<i;j++){
            s[j].push_back('0');
        }
        for(int j=i;j<2*i;j++){
            s[j].push_back('1');
        }
    }
    // sort(s.begin(),s.end());
    return s; 
}
int main(){
    int n;
    cin>>n;
    for(auto it: generate(n)){
        cout<<it<<endl;
    }
}