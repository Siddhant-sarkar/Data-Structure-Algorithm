#include"bits/stdc++.h"
using namespace std;
#define gc getchar_unlocked
#define fo(i,n) for(int i=0;i<n;i++)
#define Fo(i,k,n) for(int i=k;k<n?i<n:i>n;k<n?i+=1:i-=1)
#define ll long long
#define ci(x) cin>>x
#define ci2(x,y) cin>>x>>y
#define ci3(x,y,z) cin>>x>>y>>z
#define deb(x) cerr << #x << "=" << x << endl
#define deb2(x, y) cerr << #x << "=" << x << "," << #y << "=" << y << endl
#define pb push_back
#define mp make_pair
#define F first
#define S second
#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define tr(it, a) for(auto it = a.begin(); it != a.end(); it++)
#define trr(it, a) for(auto it = a.rbegin(); it != a.rend(); it--)
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
	int n;cin>>n;
	vi a(n); vi b(n);vi c(n);
	for(auto &it:a) cin>>it;
	for(auto &it:b) cin>>it;
	int temp=0;
	for(int i=0;i<b.size();i++){
		c[i]=a[i]-b[i]; 
		temp+=c[i];
	} 
	if(temp!=0){
		cout<<-1<<"\n";
		return;
	}else{
		
	}
}

int main() {

 #ifndef ONLINE_JUDGE
    freopen("inputf.in","r",stdin);
    freopen("outputf.in","w",stdout);
    freopen("errorf.in","w",stderr);
  #endif

    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    int t = 1;
    cin >> t;
    while(t--) {
      solve();
    }
    cerr<<"time taken : "<<((float)clock()/CLOCKS_PER_SEC)*1000<<" msecs"<<endl;
    return 0;
}