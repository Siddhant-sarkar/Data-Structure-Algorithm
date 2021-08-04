#include"bits/stdc++.h"
using namespace std;

int main(){

	#ifndef ONLINE_JUDGE
    freopen("inputf.in","r",stdin);
    freopen("outputf.in","w",stdout);
    freopen("errorf.in","w",stderr);
    #endif

    int n,m;
    cin>>n>>m;

    vector<int> adj[n+1]; // when the graphs are not edge weighted
    for(int i=0;i<m;i++){
    	int u,v;
    	cin>>u>>v;
    	adj[u].push_back(v);
    	adj[v].push_back(u);
    }
    vector<pair<int,int>> adjWt[n+1]; // when the graphs are edge weighted
    for(int i=0;i<m;i++){
    	int u,v,wt;
    	cin>>u>>v>>wt;
    	adj[u].push_back(make_pair(v,wt));
    	adj[v].push_back(make_pair(u,wt));
    }
	return 0;

}