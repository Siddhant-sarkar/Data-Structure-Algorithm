#include"bits/stdc++.h"
using namespace std;
void solve(){
   int i,c=0;
   cin>>i;
   int arr[i];

   for (size_t j = 0; j < i; j++)
   {
      cin>>arr[j];
   }
   // if(arr[0]!=1){
   //    for (size_t j = 0; j < i; j++)
   //    {
   //       arr[j]-=(arr[0]-1);
   //    }
      
   // }
   // for (size_t j = 0; j < i; j++)
   // {
   //    if(arr[j]!=j+1){
   //       c+=j+1-arr[j];
   //    }
   // }
   // if(c%2!=0){
   //    cout<<"First\n";
   // }else{
   //    cout<<"Second\n";
   // }
   
}

int main(){
   int a;
   cin>>a;
   while(a--){
      solve();
   }
   return 0;
}