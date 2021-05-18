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


void spiralTraversal(vector<vector<int>>ar){
	int row=0,col=0;
	int row_max=ar.size()-1,col_max=ar[0].size()-1;
	while(row<=row_max && col_max>=0){
		for(int i = col;i<=col_max;i++ )
			cout<<ar[row][i]<<"  ";
		row++;
		for(int i=row;i<=row_max;i++){
			cout<<ar[i][col_max]<<"  ";
		}
		col_max--;
		for(int i=col_max;i>0;i--){
			cout<<ar[row_max][i]<<"  ";
		}
		row_max--;
		for(int i=row_max;i>0;i--){
			cout<<ar[i][col]<<"  ";
		}
		col++;
	}
}
int main(){
	vector<vector<int>> ar={{1,2,3},{4,5,6},{7,8,9}};
	spiralTraversal(ar);
}