#include<iostream>
#include<vector>
#include<string>
using namespace std;


int countEncoding(string n){
	vector<int>dp(n.length());
	dp[0]=1;
	for(int i=1;i<n.length();i++){
		if(n[i]=='0'&&n[i-1]=='0'){
			dp[i]=0;
		}
		else if(n[i]=='0'&&n[i-1]!='0'){
			if(n[i-1]=='1' || n[i-1]=='2'){
				dp[i]=(i>=2)?dp[i-2]:1;
			}else{
				dp[i]=0;
			}
		}
		else if(n[i]!='0'&&n[i-1]=='0'){
			dp[i]=dp[i-1];
		}
		else{
			string s=n.substr(i-1,2);
			int temp=stoi(s);
			if(temp<=26){
				dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
			}else{
				dp[i]=dp[i-1];
			}
		}
	}
	return *dp.rbegin();
}
int main(){
	string s;cin>>s;
	cout<<countEncoding(s)<<endl;
	return 0;
}