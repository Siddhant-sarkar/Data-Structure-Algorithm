#include<iostream>
#include<vector>
using namespace std;

int coinchange(vector<int>arr,int sum){
	vector<int>dp(sum+1,0);
	dp[0]=1;
	for(auto it:arr){
		for(int i=it;i<dp.size();i++){
			dp[i]+=dp[i-it];
		}
	}
	return *dp.rbegin();
}
int main(){
	int n;
	cin>>n;	
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	int sum;cin>>sum;
	cout<<coinchange(arr,sum)<<endl;
	return 0;
}