#include"bits/stdc++.h"
using namespace std;

class DSU{
private:
	vector<int> par,sz;
public:
	DSU(int n){
		par.resize(n);sz.resize(n);
		for(int i=0;i<n;i++){
			par[i] = i;
			sz[i] = 1;
		}
	}
	int find(int x){
		if(par[x]==x) return x;
		return par[x] = find(par[x]);
	}
	bool unite(int x,int y){
		x = find(x); y = find(y);
		if(x==y ) return false;
		if(sz[x]<sz[y]) swap(x,y);
		par[y] =x;
		sz[x]+=sz[y];
		return true;
	}
};
void findLastCommon(int n,vector<vector<int>> graph);
int main(){
	int n; cin>>n;
	vector<vector<int>> graph(n);
	for(int i=0;i<n;i++){
		int a,b; cin>>a;cin>>b;
		graph[i].push_back(a);
		graph[i].push_back(b);
	}
	findLastCommon(n,graph);
}
void findLastCommon(int n,vector<vector<int>> graph){
	DSU dsu = DSU(n);
	int a = -1 , b = -1;
	for(int i=0;i<n;i++){
		if(!dsu.unite(graph[i][0],graph[i][1])){
			a = graph[i][0];
			b = graph[i][1];
		}
	}
	cout<<a<<" "<<b<<endl;
}