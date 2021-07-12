#include<iostream>
#include<stack>
#include<climits>
#include<vector>
using namespace std;

void print(vector<int>&arr) {
	for(auto it:arr) cout<<it<<endl;
	cout<<endl;
}
vector<int> ngrt(vector<int>&arr){
	vector<int>ngrt(arr.size());
	ngrt[arr.size()-1]=arr.size();
	stack<int>st;
	st.push(arr.size()-1);
	for(int i=arr.size()-2;i>=0;i--){
		while(!st.empty() && arr[i]>=arr[st.top()]){ st.pop(); }
		(st.empty())?ngrt[i]=arr.size():ngrt[i]=st.top();
		st.push(i);
	}
	// for(auto it:ngrt) cout<<it<<endl;
	return ngrt;
}
void slideIt(vector<int>&arr,int k){
	vector<int>nr=ngrt(arr);
	vector<int>maxInWindow;
	for(int i=0;i<=arr.size()-k;i++){
		int j=i;
		while(nr[j]<i+k){
			j=nr[j];
		}
		cout<<arr[j]<<endl;
	}
}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(auto &it:arr) cin>>it;
	cin>>n;
	slideIt(arr,n);
	// print(arr);


	return 0;
}