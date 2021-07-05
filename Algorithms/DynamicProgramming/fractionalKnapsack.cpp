#include<iostream>
#include<map>
#include<climits>
#include<vector>
#include<iomanip>
using namespace std;

double maxvalue(int cap,vector<int>&val,vector<int>&sz,vector<double>&ppu){
	vector<vector<double>>dp(val.size()+1,vector<double>(cap+1,0));
	for(int i=1;i<dp.size();i++){
		for (int j=1;j<dp[0].size();j++){
			double ma=INT_MIN;
			for(int k=0;k<=min(j,sz[i-1]);k++){
				ma=max(ma,dp[i-1][j-k]+(ppu[i-1]*k));
			}
			dp[i][j]=ma;
		}
	}
	
	return *(*dp.rbegin()).rbegin();
}
int main(){
	int n; cin>>n;
	vector<int>val(n);
	vector<int>sz(n);
	vector<double>ppu(n);
	for(int i=0;i<n;i++) cin>>val[i]; 
	for(int i=0;i<n;i++) cin>>sz[i];
	for(int i=0;i<n;i++) ppu[i]=(double)val[i]/sz[i];
	int cap;cin>>cap;
	
	cout<<fixed<<setprecision(1)<<maxvalue(cap,val,sz,ppu)<<endl;
	return 0;
}