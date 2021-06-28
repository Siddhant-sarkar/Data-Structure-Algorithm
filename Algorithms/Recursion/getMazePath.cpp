#include<iostream>
#include<vector>

using namespace std;

// sr - source row
// sc - source column
// dr - destination row
// dc - destination column
vector <string> getMazePaths(int sr, int sc, int dr, int dc) {
   if(sr==dr && sc==dr){
    vector<string>ans;
    ans.push_back("");
    return ans;
   }
   vector<string> h;
   vector<string> v;
   if(sc+1<=dc) h=getMazePaths(sr, 1+sc,dr,dc);
   if(sr+1<=dr) v=getMazePaths(1+sr,sc,dr,dc);
   vector<string>ans;
   for(auto it:h) ans.push_back("h"+it);
   for(auto it:v) ans.push_back("v"+it);
   return ans;
}

void display(vector<string>& arr){
    cout << "[";
    for(int i = 0;i < arr.size();i++){
        cout << arr[i];
        if(i < arr.size() -1) cout << ", ";
    }
    
    cout << "]"<<endl;
}


int main() {
    int n,m; cin >> n >> m;
    vector<string> ans = getMazePaths(0,0,n-1,m-1);
    display(ans);

    return 0;
}