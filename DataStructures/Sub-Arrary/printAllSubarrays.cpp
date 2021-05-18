#include "bits/stdc++.h"
using namespace std;

void printAllSubarray(vector<int> ar){
	for(int i=0;i<(int)ar.size();i++){
		for(int j=0;j<(int)ar.size();j++){
			for(int k=i;k<=j;k++){
				cout<<ar[k]<<"  ";
			}
			cout<<endl;
		}
	}
}
int main(){
	vector<int> ar={1,2,3,4,5,6,7};
	printAllSubarray(ar);
}