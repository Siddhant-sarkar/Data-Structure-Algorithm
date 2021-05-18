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

pii minMax(vi b){
	int m=((b.size()))/2;
	pii c;
	if(b.size()==1){
		return mp(b.front(),b.front());
	}else if(b.size()==2){
		return mp(min(b.front(),b.back()),max(b.front(),b.back()));
	}else{
		vi fh (b.begin(),b.begin()+m);
		vi sh (b.begin()+m+1,b.end());
		pii a=minMax(fh);
		pii b=minMax(sh);
		c=mp(min(a.F,b.F),max(a.S,b.S));
	}
	return c;
}
void solve() {
  int i, j, k;
  int a  ,c ,d ,m ,n;
  vi b;
  while(cin>>a) b.pb(a);
  // tr(it,b) cout<<*it<<"  ";
  cout<<"min "<<minMax(b).F<<" max "<<minMax(b).S<<endl;
  // cout<<*min_element(all(b))<<endl;
  // cout<<*max_element(all(b))<<endl;

}

int main() {

 #ifndef ONLINE_JUDGE
    freopen("inp.txt","r",stdin);
    freopen("out.txt","w",stdout);
    freopen("err.txt","w",stderr);
  #endif

    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    int t = 1;
    // cin >> t;
    while(t--) {
      solve();
    }
    cerr<<"time taken : "<<((float)clock()/CLOCKS_PER_SEC)*1000<<" msecs"<<endl;
    return 0;
}
