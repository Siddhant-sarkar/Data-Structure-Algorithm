#include"bits/stdc++.h"
using namespace std;

void normalTraversal(vector<vector<int>> ar){
	for(auto it:ar){
		for(auto iit : it){
			cout<<iit<<"   ";
		}
		cout<<endl;
	}
}

vector<vector<int>> mulitply(vector<vector<int>>ar,vector<vector<int>>ar1){
	int a=ar.size(),b=ar[0].size(),c=ar1[0].size();
	vector<vector<int>>nas(a,vector<int>(c));
	for(int i=0;i<a;i++){
		for(int j=0;j<c;j++){
			for(int k=0;k<b;k++){
				nas[i][j]+=ar[i][k]+ar1[k][j];
			}
		}
	}
	return nas;
}
int main(){
	vector<vector<int>>ar ={{1,2,3},{1,2,3},{1,2,3}};
	vector<vector<int>>ar1 ={{1,2,3},{1,2,3},{1,2,3}};
	vector<vector<int>>mu = mulitply(ar,ar1);
	normalTraversal(mu);

}