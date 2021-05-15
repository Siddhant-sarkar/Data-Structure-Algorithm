#include "bits/stdc++.h"
using namespace std;

int maximumArithmeitcSubsequence(vector<int> ar){
	int ans=0,b=2,j=1,pd=ar[1]-ar[0];
	while(j<(int)ar.size()){
		if(ar[j]-ar[j-1]==pd){
			b++;
		}
		else{
			pd=ar[j]-ar[j-1];
			b=2;	
		}
		ans=max(b,ans);
		j++;
	}
	return ans;
}
int main(){
	vector<int>ar={10,7,4,6,8,10,11};
	cout<<"Maximum arithmetic subsquence is "<<maximumArithmeitcSubsequence(ar)<<endl;
	return 0;
}