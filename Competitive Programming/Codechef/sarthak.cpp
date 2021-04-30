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
#define deb2(x, y) cout << #x << "=" << x << "," << #y << "=" << y << endl

#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define tr(it, a) for (auto it = a.begin(); it != a.end(); it++)

#define PI 3.1415926535897932384626
typedef vector < int > vi;
typedef vector <string> vs;

const int mod = 1'000'000'007;

void solve() {
  ll i, j,k,l ,n=0, m=0;
  cin>>i>>j>>k;
  string s;
  while(i--){
  	cin>>s;
  	if(s[0]=='E'||s[0]=='Q'||s[0]=='U'||s[0]=='I'||s[0]=='N'||s[0]=='O'||s[0]=='X'){
  		m+=j;
  	}else n+=k;
  }
  	// deb2(m,n);

  	if(m>n) ps("SARTHAK");
  	else if(n>m) ps("ANURADHA");
  	else ps("DRAW");


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

