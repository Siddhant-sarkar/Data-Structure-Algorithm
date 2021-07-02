#include<climits>
#include<iostream>
#include<vector>
using namespace std;

int cost(vector<vector<int>>arr,int n,int m){
	vector<vector<int>>dp(n,vector<int>(m));
	dp[n-1][m-1]=arr[n-1][m-1];
	for(int i=arr.size()-1;i>=0;i--){
		for(int j=arr[0].size()-1;j>=0;j--){
			if(i==n-1 && j==m-1) dp[i][j]=arr[i][j];
			else if(i==n-1){
				dp[i][j]=dp[i][j+1]+arr[i][j];
			}else if(j==m-1){
				dp[i][j]=dp[i+1][j]+arr[i][j];
			}else{
				dp[i][j]=arr[i][j]+min(dp[i+1][j],dp[i][j+1]);
			}
		}
	}
	return dp[0][0];
}
int main(){
	int n,m;
	cin>>n>>m;
	vector<vector<int>>arr(n,vector<int>(m));
	for(int i=0;i<n;i++) for(int j=0;j<m;j++) cin>>arr[i][j];
	cout<<cost(arr,n,m)<<endl;
}