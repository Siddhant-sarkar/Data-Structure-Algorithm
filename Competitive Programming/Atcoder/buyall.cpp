#include<iostream>
#include<vector>
using namespace std;
int main(){
	int n,x;	cin>>n>>x;
	vector<int>arr(n+1);
	for(int i=1;i<arr.size();i++) cin>>arr[i];
	for(int i=1;i<arr.size();i++){
		(i%2==0)?x-=(arr[i]-1):x-=arr[i];
	}
	(x>=0)?cout<<"Yes\n":cout<<"No\n";
}