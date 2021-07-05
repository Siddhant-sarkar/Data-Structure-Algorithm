#include<iostream>
#include<vector>
#include<climits>
using namespace std;

long long minCost(vector<vector<long long>>arr){
	vector<vector<long long>>dp(arr.size(),vector<long long>(arr[0].size()));
	for(int i=0;i<dp[0].size();i++){
		dp[0][i]=arr[0][i];
	}
	for(int i=1;i<dp.size();i++){
		for(int j=0;j<dp[0].size();j++){
			long long mi=INT_MAX;
			for(int k=0;k<dp[0].size();k++){
				if(k!=j){
					mi=min(mi,dp[i-1][k]);
				}
				else{continue;}
			}
			dp[i][j]=arr[i][j]+mi;
		}
	}
	long long mi=INT_MAX;
	for(int i=0;i<dp[0].size();i++) mi=min(mi,dp[dp.size()-1][i]);
	return mi;
}
int main(){
	long long n;cin>>n;
	long long k;cin>>k;
	vector<vector<long long>>arr(n,vector<long long>(k));
	for(int i=0;i<n;i++){
		for(int j=0;j<k;j++){
			cin>>arr[i][j];
		}
	}
	
	// minCost(r,b,g);
	cout<<minCost(arr)<<endl;
	return 0;
}