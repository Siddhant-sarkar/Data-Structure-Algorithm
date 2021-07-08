#include<iostream>
#include<vector>
#include<climits>
using namespace std;

int findProfit(vector<int>arr){
	vector<int> dp(arr.size());
	dp[0]=arr[0];
	int res=-69;
	for(int i=1;i<arr.size();i++){
		dp[i]=min(dp[i-1],arr[i]);
		res=max(res,arr[i]-dp[i-1]);
	}
	return res;
}
int findPrice(vector<int>arr){
	int res=-99;
	int min=INT_MAX;
	for(auto it:arr){
		if(it<min){
			min=it;
		}
		res=max(res,it-min);
	}
	return res;
}
int main(){
	int n;cin>>n;
	vector<int> arr(n);
	for(int i=0;i<=n;i++) cin>>arr[i];
	cout<<findPrice(arr)<<endl;
}