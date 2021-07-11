#include<iostream>
#include<vector>
#include<stack>
using namespace std;


void nglt(vector<int> &arr){
	vector<int> ans(arr.size(),1);
	stack<pair<int,int>> st;
	st.push(make_pair(arr[0],0));
	for(int i=1;i<arr.size();i++){
		while(!st.empty()&&arr[i]>st.top().first){
			st.pop();
		}
		if(st.empty()){
			ans[i]=i+1;
		}else{
			ans[i]=i-st.top().second;
		}
		st.push(make_pair(arr[i],i));
	}
	arr=ans;
}
int main(){
	int n;cin>>n;
	vector<int>arr(n); for(auto &it:arr ) cin>>it;
	nglt(arr);
	for(auto it:arr) cout<<it<<endl;


}