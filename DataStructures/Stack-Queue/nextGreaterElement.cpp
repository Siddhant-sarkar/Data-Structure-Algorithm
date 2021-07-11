#include<iostream>
#include<stack>
#include<vector>
using namespace std;


vector<int> ngrt(vector<int>&arr){
	vector<int> ans(arr.size(),-1);
	stack<int>st;
	st.push(*arr.rbegin());
	for(int i=arr.size()-2;i>=0;i--){
		while(!st.empty()&& arr[i]>=st.top() ) st.pop();
		if(st.empty()) ans[i]=-1;
		else ans[i]=st.top();
		st.push(arr[i]);
	}
	return ans;
}
int main(){
	int n;cin>>n;
	vector<int>arr(n); for(int i=0;i<n;i++) cin>>arr[i];
	vector<int>ans=ngrt(arr);
	for(auto it:ans) cout<<it<<endl;

}