#include<iostream>
#include<cmath>
#include<vector>
using namespace std;

long long findProfit(vector<long long>arr,long long fee ){
	long long bs=-arr[0],ss=0;
	for(int i=1;i<arr.size();i++){
		cout<<bs<<"	"<<ss<<endl;
		int nbs,nss;
		if(ss-arr[i]>bs) nbs=ss-arr[i];
		else nbs=bs;

		if(bs+arr[i]-fee>ss) nss=bs+arr[i]-fee;
		else nss=ss;

		ss=nss;
		bs=nbs;

	}
		cout<<bs<<"	"<<ss<<endl;
	return ss ;
}
int main(){
	int n;
	cin>>n;	
	vector<long long>arr(n);
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cin>>n;
	cout<<findProfit(arr,n)<<endl;

}
