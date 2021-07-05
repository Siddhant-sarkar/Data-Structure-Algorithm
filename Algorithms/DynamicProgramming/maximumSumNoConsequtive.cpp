#include<iostream>
#include<vector>
using namespace std;

int countMaxSum(vector<int>arr){
	vector<int>in(arr.size());
	in[0]=arr[0];
	vector<int>ex(arr.size());
	for(int i=1;i<arr.size();i++){
		in[i]=ex[i-1]+arr[i];
		ex[i]=max(in[i-1],ex[i-1]);
	}
	return max(*in.rbegin(),*ex.rbegin());
}
int main(){
	int n;cin>>n;
	vector<int> arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	cout<<countMaxSum(arr)<<endl;
	return 0;
}