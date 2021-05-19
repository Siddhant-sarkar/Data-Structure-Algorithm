#include "bits/stdc++.h"
using namespace std;

int findUnique(vector<int>ar){
	int res=0;
	for(int i=0;i<64;i++){
		int sum=0;
		for(int j=0;j<ar.size();j++){
			if(ar[j]&1<<i) sum++;
		}
		if(sum%3!=0)
			res|=1<<i;
	}
	return res;
}

int main(){
	vector<int>ar={4,4,4,1,1,1,5};
	// cout<<findUnique(ar)<<endl;
	cout<<findUnique(ar)<<endl;
}