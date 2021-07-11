#include<bits/stdc++.h>
using namespace std;
bool ans=false;
void solve(){
   
   int a,b,c,d,e;
   cin>>a>>b>>c>>d>>e;
   if((b-a<=d*e)&&(b-a>=c*e)){
      ans=true;
      cout<<"1\n";
   }else{
      cout<<"0\n";
   }

}
int main(){
   int x;
   cin>>x;
   while (x--)
   {
      solve();
      
   }
   
}