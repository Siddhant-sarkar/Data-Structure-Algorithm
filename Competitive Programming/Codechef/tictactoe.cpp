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
#define deb(x) cerr << #x << "=" << x << endl
#define deb2(x, y) cerr << #x << "=" << x << "," << #y << "=" << y << endl
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
pii checker(vector<char> ch){
	pii a;
	a.F=0;
	a.S=0;
	if(ch[0]==ch[1]&&ch[1]==ch[2]){
		ch[0]=='X'?(a.F)++:(a.S)++;
		if(ch[1]=='_')
			a.S--;
	}
	if(ch[0]==ch[3]&& ch[3]==ch[6]){
		ch[0]=='X'?a.F++:a.S++;
		if(ch[0]=='_')
			a.S--;
	}
	if(ch[2]==ch[5]&& ch[5]==ch[8]){
		ch[8]=='X'?a.F++:a.S++;
		if(ch[8]=='_')
			a.S--;
	}
	if(ch[6]==ch[7]&& ch[7]==ch[8]){
		ch[8]=='X'?a.F++:a.S++;
		if(ch[8]=='_')
			a.S--;
	}
	if(ch[1]==ch[4]&& ch[4]==ch[7]){
		ch[4]=='X'?a.F++:a.S++;
		if(ch[4]=='_')
			a.S--;
	}
	if(ch[3]==ch[4]&& ch[4]==ch[5]){
		ch[4]=='X'?a.F++:a.S++;
		if(ch[4]=='_')
			a.S--;
	}
	if(ch[0]==ch[4]&& ch[4]==ch[8]){
		ch[0]=='X'?a.F++:a.S++;
		if(ch[8]=='_')
			a.S--;
	}
	if(ch[2]==ch[4]&& ch[4]==ch[6]){
		ch[0]=='X'?a.F++:a.S++;
		if(ch[4]=='_')
			a.S--;
	}
	return a;
}
void solve() {
  int i, j=0, k;
  bool reach=true;

  vector<char>ch;
  char t;
  fo(i,9){
  	cin>>t;
  	if(t=='_')
  		j++;
  	ch.pb(t);
  }
  // deb(j);
  pii a=checker(ch);
  deb2(a.F,a.S);

  if(a.F>0 && a.S>0)
  	reach=false;
  // deb(reach);
  if(reach){
  	if(a.F>0 || a.S>0)	{
  		cout<<"1\n";
  	}else{
  		cout<<"2\n";
  	}
  }else{
  	cout<<"3\n";
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
