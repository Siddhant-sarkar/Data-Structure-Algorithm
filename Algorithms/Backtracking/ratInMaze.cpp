#include"bits/stdc++.h"
using namespace std;


bool ratInMaze(vector<vector<int>> maze,vector<vector<int>>&ans,int i,int j ,int n){
	if(i==n-1 && j==n-1){
		ans[i][j]=1;
		return true;
	}
	if(maze[i][j] && i<n && j<n){
		ans[i][j]=1;
		if(ratInMaze(maze,ans,i+1,j,n)) return true;
		if(ratInMaze(maze,ans,i,j+1,n)) return true;
		ans[i][j]=0;
		return false;
	}
	return false;
}
int main(){
	vector<vector<int>> m={{1,0,1,0,1},{1,1,1,1,1},{0,1,0,1,0},{1,0,0,1,1,},{1,1,1,0,1}};
	vector<vector<int>> a(5,vector<int>(5,0));
	ratInMaze(m,a,0,0,5);

	for(auto it: a){
		for(auto iit: it){
			cout<<iit<<"	";
		}
		cout<<endl;
	}
}