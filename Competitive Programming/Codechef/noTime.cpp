#include<bits/stdc++.h>
using namespace std;
void solve(){
    bool ans=false;
   int a,b,l;
   cin>>a;
   cin>>b;
   cin>>l;
   int arr[a];
   for (size_t i = 0; i < a; i++)
   {
      std::cin>>arr[i];
   }
   for (size_t i = 0; i < a; i++)
   {
      if(l+arr[i]>=b){
         printf("YES");
         ans=true;
         return;
      }
   }
   if(!ans){
      printf("NO");
   }
}
int main(){
   // freopen("inp.txt","r",stdin);
  int s=1;
  while(s--){
     solve();
  }
   
   return 0;
}