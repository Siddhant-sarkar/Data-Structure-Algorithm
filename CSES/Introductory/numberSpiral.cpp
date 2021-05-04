#include"bits/stdc++.h"
using namespace std;
typedef long long ll;

ll foundNumber(ll a,ll b){
	if(a==1 && b==1) return 1;
	else if(a==b) return ((a*(a-1))+1);
	else if(b>a){
		if(b%2==1){
			ll c=b*b;
			return c-a+1;	
		}else{
			ll c=(b-1)*(b-1) +1;
			return c+a-1;	
		}
	}else{
		if(a%2==0){
			ll c=a*a;
			return c-b+1;	
		}else{
			ll c=(a-1)*(a-1) +1;
			return c+b-1;	
		}
	}

}


void solve(){
	ll a,b;
	cin>>a>>b;
	cout<<foundNumber(a,b)<<"\n";
}

int main(){
	ll a=1;
	cin>>a;
	while(a--){
		solve();
	}
	return 0;
}