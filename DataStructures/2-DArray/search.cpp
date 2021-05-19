#include"bits/stdc++.h"
using namespace std;

bool isThere(vector<vector<int>>ar,int s){
	for(auto it:ar){
		for(auto iit :it){
			if(iit==s)
				return true;
		}
	}
	return false;
}
bool isThereNew(vector<vector<int>>ar,int s){
	int n=ar[0].size();
	int c=ar[0].size()-1,r=0;
	while(r<n && c>=0){
		if(s>ar[r][c]) r++;
		else if (s<ar[r][c]) c--;
		else return true;
	}
	return false;
}
int main(){
	vector<vector<int>> ar={{1,2,3},{4,5,6},{7,8,9}};
	for(auto it: ar){
		for(auto iit:it)
			cout<<iit<<" ";
		cout<<endl;
	}
	cout<<isThereNew(ar,8);
	return 0;
}