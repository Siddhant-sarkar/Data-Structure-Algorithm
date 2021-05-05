#include"bits/stdc++.h"
using namespace std;
typedef long long ll;

ll factorial (ll a){
	if(a==1)
		return 1;
	return a*factorial(a-1);
}
int main(){
	ll a,b=0;
	int s=0;
	scanf("%lld",&a);
	ll c=factorial(a);
	do{
		b=c%10;
		c/=10;
		s++;
	}while(b==0);
	s--;

	cout<<s<<endl;

}