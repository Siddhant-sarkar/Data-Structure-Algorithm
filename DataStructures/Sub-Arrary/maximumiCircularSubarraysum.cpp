#include"bits/stdc++.h"
using namespace std;


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

/*We find the maximum sub-array Sum of 
as we would do in case of non circular sub-array
the we compute another sum with all the elements of the sub-array
with their sign reversed and then
declare an nonWrapSum as =TotalSum-reverse
then return max of wrap and nonwrap sum
*/
int findSumOfSubarrary(vector<int>ar){
	int wrap=kadanes(ar);
	int sum=accumulate(ar.begin(),ar.end(),0);
	for(int i=0;i<(int)ar.size();i++){
		ar[i]*=-1;
	}
	int noWrap=sum+kadanes(ar);
	return max(wrap,noWrap);
}


int main(){
	vector<int> ar={4,-4,6,-6,10,-11,12};
	cout<<findSumOfSubarrary(ar);
}