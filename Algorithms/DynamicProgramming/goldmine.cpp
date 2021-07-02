#include<iostream>
#include<vector>
#include<climits>
using namespace std;


void maxGold(vector<vector<int>>arr,int n,int m){
	for(int j=m-1;j>=0;j--){
		for(int i=n-1;i>=0;i--){
			cout<<arr[i][j]<<"	";
		}
		cout<<endl;
	}
}
int main(){
	int n,m;	
	cin>>n>>m;
	vector<vector<int>>arr(n,vector<int>(m));
	for(int i =0;i<n;i++) for (int j=0;j<n;j++) cin>>arr[i][j];
	int dp[n][m];
	// cout<<maxGold(arr,dp,n,m)<<endl;
	maxGold(arr,n,m);
	return 0;
}


