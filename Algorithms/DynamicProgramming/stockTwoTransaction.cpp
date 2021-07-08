#include<climits>
#include<iostream>
#include<vector>
using namespace std;


int findProfit(vector<int>arr){
	int mps=0,mpb=0;	
	int least=arr[0];
	int large=arr[arr.size()-1];
	vector<int>dp(arr.size());
	vector<int>dpr(arr.size());
	for(int i=1;i<arr.size();i++){
		if(arr[i]<least) least=arr[i];
		mps=arr[i]-least;
		if(mps>dp[i-1]) dp[i]=mps;
		else dp[i]=dp[i-1];
	}
	for(int i=arr.size()-2;i>=0;i--){
		if(arr[i]>large) large=arr[i];
		mpb=large-arr[i];
		if(mpb>dpr[i+1]) dpr[i]=mpb;
		else dpr[i]=dpr[i+1];
	}
	int final=INT_MIN;
	for(int i=0;i<dp.size();i++) final=max(final,dp[i]+dpr[i]);
	return final;
}
int main(){
	int n;
	cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	cout<<findProfit(arr)<<endl;
	return 0;
}
