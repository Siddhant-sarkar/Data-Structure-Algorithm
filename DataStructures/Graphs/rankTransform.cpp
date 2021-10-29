#include "bits/stdc++.h"
using namespace std;
class DSU{
private:
    vector<int> parent;
    vector<int> rank;
public:
    DSU(int n){
        parent.resize(n);
        rank.resize(n);
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }
    }
    bool unite(int x,int y){
        int lx = find(x);
        int ly = find(y);
        if(lx!=ly){
            if(rank[lx]>rank[ly]){
                parent[ly]=lx;
            }else if(rank[lx]<rank[ly]){
                parent[lx]=ly;
            }else{
                parent[lx]=ly;
                rank[ly]++;
            }
            return true;
        }
        return false;
    }
    int find(int x){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }
};
class Solution {
public:
    vector<vector<int>> matrixRankTransform(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<vector<int>>ans(n, vector<int>(m));
        map<int,vector<pair<int,int>>> nValues;
        for(int i=0; i< n;i++){
            for(int j=0;j<m;j++){
                nValues[matrix[i][j]].push_back({i,j});
            }
        }
        vector<int>Rmax(n),Cmax(m);
        for(auto [_,cell] : nValues){
           DSU ds = DSU(n+m);
           for(auto [row,col] : cell){
            ds.unite(row,col+n);
           }
           unordered_map<int,int> rootRank;
           for(auto [row,col]: cell){
            int root = ds.find(row);
            rootRank[root]= max(rootRank[root],max(Rmax[row],Cmax[col])+1);
           }
           for(auto [row,col]: cell){
            int root = ds.find(row);
            int rank = rootRank[root];
            ans[row][col] = Rmax[row] = Cmax[col] = rank;
           }
        }
        return ans;
    }
};
int main(){
    return 0;
}