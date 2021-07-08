#include<iostream>
#include<cmath>
#include<vector>
using namespace std;

long long findProfit(vector<long long>arr,long long fee ){
	int bs=-arr[0],ss=0,cs=0;
	for(int i=1;i<arr.size();i++){
		int nbs=0,nss=0,ncs=0;
		if(cs-arr[i]>bs) nbs=cs-arr[i];
		else nbs=bs;

		if(bs+arr[i]>ss) nss=bs+arr[i];
		else nss=ss;

		if(ss>cs) ncs=ss;
		else ncs=cs;

		ss=nss;bs=nbs;cs=ncs;
	}
	return max(cs,ss);
	
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
