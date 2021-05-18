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
void merge(int ar[],int l,int m,int r){
	int n1=m-l+1,n2=r-m;

	int a[n1],b[n2];
	for(int i=0;i<n1;i++){
		a[i]=ar[i+l];
	}
	for(int j=0;j<n2;j++){
		b[j]=ar[j+1+m];
	}
	int i=0,j=0,k=l;

	while(i<n1&&j<n2){
		if(a[i]<=b[j]){
			ar[k]==a[i];
			i++;
		}else{
			ar[k]=b[j];
			j++;
		}
		k++;
	}

	while(i<n1){
		ar[k]=a[i];
		i++;
		k++;
	}
	while(j<n2){
		ar[k]=b[j];
		j++;
		k++;
	}
}
void mergeSort(int ar[],int l,int r){
	if(l<r){
	int m=(l+r)/2;
	mergeSort(ar,l,m);
	mergeSort(ar,m+1,r);
	merge(ar,l,m,r);
}
}
void solve() {
  int i, j, k;
  int a ,b ,c ,d ,m ,n;
  int ar[5]={5,4,3,2,1};

  mergeSort(ar,0,4);
  fo(i,5) cout<<ar[i]<<"   ";
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
