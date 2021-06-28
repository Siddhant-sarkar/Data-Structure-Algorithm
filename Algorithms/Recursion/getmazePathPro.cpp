#include<iostream>
#include<vector>
using namespace std;

// sr - source row
// sc - source column
// dr - destination row
// dc - destination column
vector <string> getMazePaths(int sr, int sc, int dr, int dc) {
    if(sr==dr && sc==dc){
        vector<string> paths;
        paths.push_back("");
        return paths;
    }
    vector<string>ans;
    for(int i=1;(sc+i<=dc) || (sr+i<=dr )||(sr+i<=dr && sc+i<=dc);i++){
        if(sc+i<=dc){
        vector<string>h=getMazePaths(sr,sc+i,dr,dc);
        for(auto it:h){
            ans.push_back("h"+to_string(i)+it);
        }
        }if(sr+i<=dr){
            vector<string>v=getMazePaths(sr+i,sc,dr,dc);
            for(auto it:v){
                ans.push_back("v"+to_string(i)+it);
            }
        }if(sr+i<=dr && sc+i<=dc){
            vector<string>d=getMazePaths(sr+i,sc+i,dr,dc);
            for(auto it: d){
                ans.push_back("d"+to_string(i)+it);
            }
        }
    }
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
                        
                        
                        