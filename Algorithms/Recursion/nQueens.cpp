#include "bits/stdc++.h"
using namespace std;

vector<int> col(10,0);
vector<int> diag1(10,0);
vector<int> diag2(10,0);
vector<vector<int>>ar={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

void findNQueen(vector<vector<int>>&ar,int y,int n){
	if(y==n){
		cout<<"****************\n";
		for(auto it: ar){
		for(auto iit :it){
			cout<<iit<<"   ";
		}
		cout<<"\n";
	}
		cout<<"***************\n";
		return ;
	}
	for(int x=0;x<n;x++){
		if(col[x]||diag1[x+y]||diag2[x-y+n-1])
			continue;
		col[x]=diag1[x+y]=diag2[x-y+n-1]=1;
		ar[x][y]=1;
		findNQueen(ar,y+1,n);
		col[x]=diag1[x+y]=diag2[x-y+n-1]=0;
		ar[x][y]=0;
	}
}

int main(){
	#ifndef ONLINE_JUDGE
	freopen("~/Document/Development/DataStructure--Algorithms/inp.txt", "r", stdin);
	freopen("~/Document/Development/DataStructure--Algorithms/out.txt", "w", stdout);
	#endif 

	int i;
	i=4;
	findNQueen(ar,0,4);
	cout<<"yeah\n";
	// for(auto it:col){
	// 	cout<<it<<endl;
	// }
	
}
