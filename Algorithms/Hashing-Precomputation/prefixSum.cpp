#include"bits/stdc++.h"
using namespace std;
const int N=10e5+10;
int a[N];
int pr[N];

int main(){
    int n;
    cin>>n;
    for (size_t i = 1; i <= n; i++){
        cin>>a[i];
        pr[i]=pr[i-1]+a[i];
    }
    int l,r;
    int q;
    cin>>q;
    while(q--){
    	cin>>l>>r;
    	cout<<pr[r]-pr[l-1]<<endl;
    }
    return 0;

}