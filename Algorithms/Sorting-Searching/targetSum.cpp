#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;

void printSubsets(vector<int>&arr,int s){
	int i=0,j=arr.size()-1;
	while(i<j){
		int sum=arr[i]+arr[j];
		if(sum>s) j--;
		else if(sum<s) i++;
		else if(sum==s){
			cout<< arr[i]<<", "<<arr[j]<<endl;
			i++,j--;
		}
	}

}
int main(){
	int n;cin>>n;
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	sort(arr.begin(),arr.end());
	cin>>n;
	printSubsets(arr,n);


}