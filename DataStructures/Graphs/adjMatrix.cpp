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

    int adj[n+1][n+1]; // this is the adjecency matrix 
    for(int i=0;i<m;i++){
    	int u,v;
    	cin>>u>>v;
    	adj[u][v]=1;
    	adj[v][u]=1;
    }
	return 0;

}