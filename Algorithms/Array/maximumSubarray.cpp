#include "bits/stdc++.h"
using namespace std;

int findMaxSubarraySum(vector<int> ar){
	int a=0,b=0;
	for(int i=0;i<(int)ar.size();i++){
		a=max(ar[i],a+ar[i]);
		b=max(b,a);	
	}
	return b;
}

int main(){
	vector<int> ar={2,4,-3,5,2};
	cout<<findMaxSubarraySum(ar)<<endl;
}