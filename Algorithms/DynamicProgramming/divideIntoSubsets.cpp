#include<iostream>
#include <vector>
using namespace std;


long long findTheWays(long long a,long long b){
	vector<vector<int>>dp(b+1,vector<int>(a+1,0));
	for(int i=1;i<=a;i++) dp[1][i]=1;
	for(int i=1;i<=b;i++){
		for(int j=1;j<=a;j++){
			if(i==j) dp[i][j]=1;
			else if(i>j) dp[i][j]=0;
			else dp[i][j]=(dp[i][j-1]*(i))+dp[i-1][j-1];
		}
	}
	// for(auto it:dp){
	// 	for(auto iit:it){
	// 		cout<<iit<<"	";
	// 	}
	// 	cout<<endl;
	// }
	return *(*dp.rbegin()).rbegin();
}
int main(){
	long long a,b;
	cin>>a>>b;
	cout<<findTheWays(a,b)<<endl;
}
