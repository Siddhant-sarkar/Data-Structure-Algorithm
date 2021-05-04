#include"bits/stdc++.h"

using namespace std;
#define fo(i, n) for (i = 0; i < n; i++)
#define Fo(i, k, n) for (i = k; k < n ? i < n : i > n; k < n ? i += 1 : i -= 1)
#define ll long long

#define si(x) scanf("%d", & x)
#define sl(x) scanf("%lld", & x)
#define ss(s) scanf("%s", s)
#define pi(x) printf("%d\n", x)
#define pl(x) printf("%lld\n", x)
#define ps(s) printf("%s\n", s)

#define deb(x) cout << #x << "=" << x << endl
#define deb2(x, y) cout << #x << "=" k<< x << "," << #y << "=" << y << endl

#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define tr(it, a) for (auto it = a.begin(); it != a.end(); it++)

#define PI 3.1415926535897932384626
typedef vector < int > vi;
typedef vector <string> vs;

const int mod = 1'000'000'007;

int convertBinary(int n){
	int a=1,b=0;
	if(n==1) return 1;
	if(n==2) return 10;
	while(a<n) a*=2;
	a/=2;
	while(a){
		int c=n/a;
		b+=c;
		b*=10;
		n-=c*a;
		a/=2;
	}
	return b/10;
}
ll divide(ll m,ll n){
	ll i,q=0,t=0;
	Fo(i,31,-1){
		if((t+(n<<i))<m){
			t+=n<<i;
			q|=1<<i;
		}
	}
	return q;
}
void solve() {
  ll i, j, n, m;
  pl(divide(10LL,3LL));
  

}

int main() {
  #ifndef ONLINE_JUDGE
    freopen("inp.txt","r",stdin);
    freopen("out.txt","w",stdout);
  #endif
    
  ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
  int t = 1;
  cin >> t;
  while (t--) {
    solve();
  }
  return 0;
}

