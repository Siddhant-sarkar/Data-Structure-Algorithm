/********************************************************************************************************************************
********************************************************************************************************************************
d8b  888    d8b                 Y88b   d88P                               .d8888b.                   888                       
Y8P  888    88P                  Y88b d88P                               d88P  Y88b                  888                       
     888    8P                    Y88o88P                                Y88b.                       888                       
888  888888 "  .d8888b             Y888P  .d88b.  888  888 888d888        "Y888b.    8888b.  888d888 888  888  8888b.  888d888 
888  888       88K                  888  d88""88b 888  888 888P"             "Y88b.     "88b 888P"   888 .88P     "88b 888P"   
888  888       "Y8888b.             888  888  888 888  888 888                 "888 .d888888 888     888888K  .d888888 888     
888  Y88b.          X88             888  Y88..88P Y88b 888 888           Y88b  d88P 888  888 888     888 "88b 888  888 888     
888   "Y888     88888P' 88888888    888   "Y88P"   "Y88888 888   88888888 "Y8888P"  "Y888888 888     888  888 "Y888888 888    
********************************************************************************************************************************
********************************************************************************************************************************/
#include<bits/stdc++.h>
using namespace std;
#define fo(i,n) for(i=0;i<n;i++)
#define Fo(i,k,n) for(i=k;k<n?i<n:i>n;k<n?i+=1:i-=1)
#define ll long long
#define si(x)	scanf("%d",&x)
#define sl(x)	scanf("%lld",&x)
#define ss(s)	scanf("%s",s)
#define pi(x)	printf("%d\n",x)
#define pl(x)	printf("%lld\n",x)
#define ps(s)	printf("%s\n",s)
#define deb(x) cout << #x << "=" << x << endl
#define deb2(x, y) cout << #x << "=" << x << "," << #y << "=" << y << endl
#define pb push_back
#define mp make_pair
#define F first
#define S second
#define all(x) x.begin(), x.end()
#define clr(x) memset(x, 0, sizeof(x))
#define sortall(x) sort(all(x))
#define tr(it, a) for(auto it = a.begin(); it != a.end(); it++)
#define PI 3.1415926535897932384626
typedef pair<int, int>	pii;
typedef pair<ll, ll>	pl;
typedef vector<int>		vi;
typedef vector<ll>		vl;
typedef vector<pii>		vpii;
typedef vector<pl>		vpl;
typedef vector<vi>		vvi;
typedef vector<vl>		vvl;
int mpow(int base, int exp); 

const int mod = 1'000'000'007;
const int N = 3e5, M = N;
//=======================

vi g[N];
int a[N];

void solve() {
  int i, j, n, m;
  fo(i,10){
     ps("HEllo bruh\n");
  }
}

int main() {
    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    int t = 1;
    cin >> t;
    while(t--) {
      solve();
    }

    return 0;
}

int mpow(int base, int exp) {
  base %= mod;
  int result = 1;
  while (exp > 0) {
    if (exp & 1) result = ((ll)result * base) % mod;
    base = ((ll)base * base) % mod;
    exp >>= 1;
  }
  return result;
}

