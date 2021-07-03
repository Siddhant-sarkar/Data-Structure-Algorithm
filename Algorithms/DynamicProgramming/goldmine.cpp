#include<iostream>
#include<vector>
#include<climits>
using namespace std;


int maxGold(vector<vector<int>>arr,int n,int m){
	vector<vector<int>>dp(n,vector<int>(m,0));
	for(int j=m-1;j>=0;j--){
		for(int i=n-1;i>=0;i--){
			if(j==m-1){dp[i][j]=arr[i][j];}
			else{
				if(i==n-1){
					dp[i][j]=arr[i][j]+max(dp[i][j+1],dp[i-1][j+1]);
				}else if(i==0){
					dp[i][j]=arr[i][j]+max(dp[i][j+1],dp[i+1][j+1]);
				}else{
					dp[i][j]=arr[i][j]+max(max(dp[i][j+1],dp[i+1][j+1]),dp[i-1][j+1]);
				}
			}
		}
	}
	int ans=INT_MIN;
	for(int i=0,j=0;i<n;i++){
		ans=max(ans,dp[i][j]);
	}
	return ans;
}
int goldMin(vector<vector<int>>arr,int n,int m){
	vector<vector<int>>dp(n,vector<int>(m,0));
	for(int j=arr[0].size()-1;j>=0;j--){
		for(int i=0;i<arr.size();i++){
			if(j==m-1){
				dp[i][j]=arr[i][j];
			}else if(i==0){
				dp[i][j]=arr[i][j]+max(dp[i+1][j+1],dp[i][j+1]);
			}else if(i==n-1){
				dp[i][j]=arr[i][j]+max(dp[i-1][j+1],dp[i][j+1]);
			}else{
				dp[i][j]=arr[i][j]+max(dp[i][j+1],max(dp[i-1][j+1],dp[i+1][j+1]));
			
		}
	}
	int ans=INT_MIN;
	for(int i=0;i<n;i++){
		ans=max(ans,dp[i][0]);
	}
	return ans;
}

int main(){
	int n,m;	
	cin>>n>>m;
	vector<vector<int>>arr(n,vector<int>(m));
	for(int i =0;i<n;i++) for (int j=0;j<n;j++) cin>>arr[i][j];
	try{
		cout<<goldMin(arr,n,m)<<endl;
	}catch(...){
		cout<<"something wrong with the test case\n"<<endl;
	}
	return 0;
}


