#include "bits/stdc++.h"
using namespace std;
vector<int>col(100,0);
vector<int>dia1(100,0);
vector<int>dia2(100,0);
void print(vector<vector<int>>ans){
	cout<<"********\n";
	for(auto it:ans){
		for(auto iit :it){
			cout<<iit<<"	";
		}
		cout<<endl;
	}
	cout<<"********\n";
}
void nqueen(vector<vector<int>>&ans,int y,int n){
	if(y==n){
		print(ans);
		return;	
	}
	for(int x=0;x<n;x++){
		if(col[x] || dia1[x+y]|| dia2[x-y+n-1]) continue;
		col[x]=dia1[x+y]=dia2[x-y+n-1]=1;
		ans[x][y]=1;
		nqueen(ans,y+1,n);
		col[x]=dia1[x+y]=dia2[x-y+n-1]=0;
		ans[x][y]=0;
	}
}
int main(){
	int n;
	cin>>n;
	vector<vector<int>>ans(n,vector<int>(n,0));
	nqueen(ans,0,n);
}