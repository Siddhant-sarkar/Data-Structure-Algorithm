#include "bits/stdc++.h"
using namespace std;

void print(vector<vector<int>>ar){
	for(auto it:ar){
		for(auto iit:it){
			cout<<iit<<"  ";
		}
		cout<<endl;
	}
}
vector<vector<int>> transpose(vector<vector<int>>&ar){
	for(int i=0;i<ar.size();i++){
		for(int j=0;j<i+1;j++){
			swap(ar[i][j],ar[j][i]);
		}
	}
	return ar;
}
int main(){
	vector<vector<int>> ar={{1,2,3},{4,5,6},{7,8,9}};
	transpose(ar);
	print(ar);
	return 0; 
}