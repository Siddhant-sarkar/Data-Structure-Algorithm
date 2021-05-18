#include"bits/stdc++.h"
using namespace std;
//This is the O(n) approach to solve 
// to find the maximum subarray sum
int maximumSubArraySum(vector<int> ar){
	int a=0,b=0;
	for(int i=0;i<(int)ar.size();i++){
		a=max(a,ar[i]+a);
		b=max(a,b);
	}
	return b;
}
//This is the kadanes algorithm to find the maximum subarary 
//sum it uses a continious sum which is set to zero if a 
// negaitve number is countered
//otherwise a sum is updated with a sum

int kadanes(vector<int>ar){
	int sum=0,maxSum=0;
	for(int i=0;i<(int)ar.size();i++){
		sum+=ar[i];
		if(ar[i]<0)
			sum=0;
		maxSum=max(maxSum,sum);
	}
	return maxSum;
}

int main(){
	vector<int> ar={1,1,-1};
	// cout<<"Hello World\n";
	cout<<kadanes(ar);
	return 0;
}