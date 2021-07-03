#include<iostream>
#include<vector>

using namespace std;


void print(vector<vector<bool>>arr){
	cout<<"*******"<<endl;
	for(auto it:arr){
		for(auto iit:it){

			cout<<iit<<"	";
		}
		cout<<endl;
	}
	cout<<"*******"<<endl;
}
bool isTrue(vector<int>&arr,int sum){
	int n=arr.size()+1;
	vector<vector<bool>>dp(n+1,vector<bool>(sum+1,0));
	for(int i=0;i<=n;i++){
		dp[i][0]=true;
	}
	dp[1][arr[0]]=true;

	for(int i=2;i<=n;i++){
		for(int j=1;j<sum+1;j++){
			if(j<arr[i-1]){
				dp[i][j]=dp[i-1][j] ;
			}
			else if(j==arr[i-1]){
				dp[i][j]=true;
			} else{
				dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
			}	
		}
	}
	return dp[n][sum];
}

int main(){
	int n;
	cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int sum;
	cin>>sum;
	cout<<boolalpha<<isTrue(arr,sum);
	return 0;

}