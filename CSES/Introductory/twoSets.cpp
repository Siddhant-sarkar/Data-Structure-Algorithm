#include "bits/stdc++.h"
using namespace std;

vector<long long int> st;
vector<long long int> st2;
void print(vector<long long> ar){
	for(auto it: ar) cout<<it<<" ";
	cout<<"\n";
}

long long  findPair(int n,long long s){
	 s/=2LL;
	 for(long long int i=n;i>0;i--){
	 	if(s-i>=0){
	 		st.push_back(i);
	 		s-=i;
	 	}else{
	 		st2.push_back(i);
	 	}
	 }
	 return s;
}

int main(){
	long long  n;
	cin>>n;
	long long int  a=(n*(n+1))/2;
	// cout<<a<<endl;
	if(a%2) cout<<"NO\n"<<endl;
	else{
		findPair(n,a);
		cout<<"YES\n";
		cout<<st.size()<<endl;
		print(st);
		cout<<st2.size()<<endl;
		print(st2);
	}
	return 0;
}