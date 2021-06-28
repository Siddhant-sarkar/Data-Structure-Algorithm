#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

vector<string> gss(string s){
    if(s.length()==0){
        vector<string> s{""};
        return s;
    }
    char c= s[0];
    vector<string>st=gss(s.substr(1));
    vector<string>mst;
    for(auto ss:st){
        mst.push_back(ss);
        mst.push_back(ss+c);
    }
    return mst;
}

int main(){
    string s;
    cin >> s;
    reverse(s.begin(),s.end());
    vector<string> ans = gss(s);
    // sort(ans.begin(),ans.end());
    int cnt = 0;

    cout << '[';
    for (string str : ans){
        if (cnt != ans.size() - 1)
            cout << str << ", ";
        else
            cout << str;
        cnt++;
    }
    cout << ']';
}