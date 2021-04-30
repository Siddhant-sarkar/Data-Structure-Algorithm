#include "bits/stdc++.h"

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
#define ci(x) cin>>x

#define deb(x) cout << #x << "=" << x << endl
#define deb2(x, y) cout << #x << "=" << x << "," << #y << "=" << y << endl

#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define tr(it, a) for (auto it = a.begin(); it != a.end(); it++)

#define PI 3.1415926535897932384626
typedef vector < int > vi;
typedef vector <string> vs;

const int mod = 1'000'000'007;

int convertBinary(int i){
	int a=1,b=0;
	while(a<i) a*=2;
	a/=2;

	while(i>0){
		if(a>i){
			a/=2;
		}else{
			b+=1;
			i-=a;
			a/=2;
		}
		b*=10;
	}
	return b/10;
}

void solve() {
  int i, j, n, m;
  // pi(convertBinary(15));
  /**
   * TO CHECK
   * 	* if the k th bit is one (x&1<<k==1)
   * 	* if the k th bit is zero (x&1<<k==0)
   * TO SET 
   * 	(here k starts as 0 from the lsb..)
   * 	*K th bit to 1 x|1<<k
   * 	*K th bit to 0 x&{~(1<<k)}
   * 	*K th bit flip x^(1<<k)
   * 	* last bit to 0 x&(x-1)
   * 		----> if x&(x-1)==0 the the number is a exponent of 2
   * 	*
   * SOME STANDARD FUCTION
   * 	*__builtin_clz(x) number of zeros at the beginning of the number
   * 	*__builtin_ctz(x) number of zeros at the end of any decimal number
   * 	*__builtin_popcount(x) number of set bits in x
   * 	*__builtin_parity(x) bool if the set bits can be paired or not
   * 	
   * 	   
   * 	   
   */	  
  i=11|(1<<2);
  // pi(convertBinary(i));
  i=15&~(1<<2);
  // pi(convertBinary(i));
  i=i^(1<<2);
  pi(15&-15);
  pi(15|14);

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

