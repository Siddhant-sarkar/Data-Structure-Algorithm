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
#define deb(x) cerr << #x << "=" << x <<"\n" 
#define deb2(x, y) cerr << #x << "=" << x << "," << #y << "=" << y <<"\n" 
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
ll findMin(ll t,int n,vector<ll> ar){
  ll ans=INT_MAX;
  for(ll i=0;i<1<<n;i++){
    ll sum=0;
    for(ll j=0;j<n;j++){
      if(i&1<<j)
        sum+=ar[j];
    }
    ll an=abs((t-sum)-sum);
    ans=min(ans,an);
  }
  return ans;
}
ll findMin(vl ar,ll t,ll c,int n,int l){
  if(l==n)
    return abs(t-2*c);
  return min(findMin(ar,t,c+ar[n],n+1,l),findMin(ar,t,c,n+1,l));
}
void solve() {
  ll i, j, k,a;
  ll total=0;
  cin>>a;
  vl ar(a);
  fo(j,a){
    cin>>k;
    total+=k;
    ar[j]=k;
  }
  deb(total);
  // cout<<findMin(total,a,ar);
  cout<<findMin(ar,total,0,0,a);
}

int main() {

 // #ifndef ONLINE_JUDGE
 //    freopen("inputf.in","r",stdin);
 //    freopen("outputf.in","w",stdout);
 //    freopen("errorf.in","w",stderr);
 //  #endif

    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    int t = 1;
    // cin >> t;
    while(t--) {
      solve();
    }
    cerr<<"time taken : "<<((float)clock()/CLOCKS_PER_SEC)*1000<<" msecs"<<"\n";
    return 0;
}
