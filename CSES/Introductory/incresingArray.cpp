#include"bits/stdc++.h"
using namespace std;


int main(){
  long long int i;
  cin>>i;
 long long int  ar[i];
  if(i==1){
    cout<<0<<endl;
    return 0;
  }
  long long int a,b=0ll;

  // cout<<b;
  for (long long int j = 0; j < i; j++)
  {
    cin>>a;
    ar[j]=a;
  }

  for (long long int j = 0; j < i; j++)
  {
    if(ar[j]>ar[j+1]){
      b+=ar[j]-ar[j+1];
      ar[j+1]=ar[j];
    }
  }
  

  cout<<b<<"\n";
  
  

}