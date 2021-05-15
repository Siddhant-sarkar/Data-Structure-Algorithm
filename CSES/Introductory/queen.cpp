#include "bits/stdc++.h"
using namespace std;
int c=0;
vector<bool>col(8,0),d1(20,0),d2(20,0);
vector<vector<char>>b(8,vector<char>(8,'.'));
void print(vector<vector<char>>b){
	cerr<<"***********\n";
	for(auto it:b){
		for(auto iit:it)
			cerr<<iit<<" ";
		cerr<<"\n";
	}
	cerr<<"***********\n";
}
void search(int y){
	if(y==8)
		c++;
	for(int x=0;x<8;x++){
		if(col[x]||d1[x+y]||d2[x-y+7]||b[y][x]=='*')
			continue;
		col[x]=d1[x+y]=d2[x-y+7]=1;
		search(y+1);
		col[x]=d1[x+y]=d2[x-y+7]=0;

	}
}
int main(){
	char ch;
	for(int i=0;i<8;i++){
		for(int j=0;j<8;j++){
			cin>>ch;
			if(ch=='*')
				b[i][j]='*';
		}
	}
	print(b);
	search(0);
	cout<<c<<endl;


	return 0;
}