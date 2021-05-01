#include"bits/stdc++.h"
using namespace std;
#define gc getchar_unlocked
#define fo(i,n) for(i=0;i<n;i++)
#define Fo(i,k,n) for(i=k;k<n?i<n:i>n;k<n?i+=1:i-=1)
#define ll long long
#define si(x) scanf("%d",&x)
#define sl(x) scanf("%lld",&x)
#define ss(s) scanf("%s",s)
#define pi(x) printf("%d\n",x)
#define pl(x) printf("%lld\n",x)
#define ps(s) printf("%s\n",s)
#define ci(x) cin>>x
#define ci2(x,y) cin>>x>>y
#define ci3(x,y,z) cin>>x>>y>>z
#define deb(x) cout << #x << "=" << x << endl
#define deb2(x, y) cout << #x << "=" << x << "," << #y << "=" << y << endl
#define pb push_back
#define mp make_pair
#define F first
#define S second
#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define tr(it, a) for(auto it = a.begin(); it != a.end(); it++)
#define PI 3.1415926535897932384626

typedef pair<int, int>  pii;
typedef pair<ll, ll>  pl;
typedef vector<int>   vi;
typedef vector<ll>    vl;
typedef vector<pii>   vpii;
typedef vector<pl>    vpl;
typedef vector<vi>    vvi;
typedef vector<vl>    vvl;



const int mod = 1'000'000'007;
const int N = 3e5, M = N;
//=======================

vi g[N];
int a[N];

void solve() {
  int i, j, k;
  ll a ,b ,c ,d ,m ,n;
  ci3(a,b,c);
  map<ll,ll> rec;
  while(a--){
    ci(d);
    if(rec.find(d)!=rec.end()) ((rec.find(d))->S)++;
    else rec.insert(mp(d,1));
  }
  if(b<c){
    ps("YES");
    return;
}
  else{
    tr(it,rec) if((it->S)%2) (it->S)--;
    d=0;
    tr(it,rec) d+=(it->F)*(it->S);
    // deb(d);
    if(d>=b-c) ps("YES");
    else ps("NO");

  }
  // tr(it,rec) deb2(it->F,it->S);
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
