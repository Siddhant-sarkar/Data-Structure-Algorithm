#include"bits/stdc++.h"
using namespace std;

int findMinimumPositiveNumber(vector<int> ar){
	vector<bool>ck(100,0);
	for(int i=0;i<(int)ar.size();i++){
		if(ar[i]<0)
			continue;
		ck[ar[i]]=true;
	}
	for(int i=0;i<(int)ck.size();i++){
		if(ck[i]==false){
			return i;
		}
	}
	return -1;
}
int main(){
	vector<int> ar={0,-9,1,3,-4,5};
	cout<<findMinimumPositiveNumber(ar)<<endl;
	return 0;
}