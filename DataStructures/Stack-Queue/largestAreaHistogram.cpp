#include<iostream>
#include<stack>
#include<climits>
#include<vector>

using namespace std;

int largestArea(vector<int>&arr){
	vector<int>rb(arr.size(),0);
	vector<int>lb(arr.size(),0);
	rb[arr.size()-1]=arr.size();
	lb[0]=-1;
	stack<int>st;
	st.push(arr.size()-1);
	for(int i=arr.size()-2;i>=0;i--){
		while(!st.empty() && arr[i]<=arr[st.top()]) st.pop();
		if(st.empty()) rb[i]=arr.size();
		else rb[i]=st.top();
		st.push(i);
	}
	while(!st.empty()) st.pop();
	st.push(0);
	for(int i=1;i<arr.size();i++){
		while(!st.empty() && arr[i]<=arr[st.top()]) st.pop();
		if(st.empty()) lb[i]=-1;
		else lb[i]=st.top();
		st.push(i);
	}

	int ans=INT_MIN;
	for(int i=0;i<arr.size();i++){
		int width=rb[i]-(lb[i])-1;
		int area=arr[i]*width;
		// cout<<width<<"\t"<<arr[i]<<endl;
		if(area>ans) ans=area;
	}
	return ans;
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);for(auto &it:arr) cin>>it;
	cout<<largestArea(arr)<<endl;
}

