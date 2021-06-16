#include"iostream"
using namespace std;
typedef long long ll;

void solve(){
	ll a,b,c,d,sum;
	cin>>a>>b>>c>>d;
	ll n=a/b,left=a%b;
	// cout<<"n : "<<n<<" left : "<<left<<"\n";
	if(n%2==0)
		sum=(n/2)*(2*c+(n-1)*d);
	else
		sum=(n)*(c+((n-1)/2)*d);
	sum*=b;
	sum+=left*(c+n*d);
	cout<<sum<<"\n";
}
	
int main(){
	int t;
	cin>>t;
	while(t--){
		solve();
	}
	return 0;
}