#include "bits/stdc++.h"
using namespace std;
typedef long long ll;

void solve();
bool checkIfFloat(float  f);
bool checkIfFloat(float  f){
	if(((f-(int)f)>1e-9))
		return false;
	else 
		return ;
}
void solve(){
	ll a,b,c;
	cin>>a>>b;
	c=a/(float)b;
	if(checkIfFloat(c)==1)
		cout<<"that is true\n"<<endl;
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int i=1;
	cin>>i	;
	while(i--){
		solve();
	}
}