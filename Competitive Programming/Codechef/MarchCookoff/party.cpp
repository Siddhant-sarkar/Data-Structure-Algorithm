#include<iostream>
using namespace std;
bool ans=false;
void solve(){
   string a;
   cin>>a;
   for (size_t i = 0; i < a.length(); i++)
   {
     if(a.substr(i,5)=="party"){
        a.replace(i,5,"pawri");
     }
   }
   cout<<a<<endl;
   
}
int main(){
   int x;
   cin>>x;
   while (x--)
   {
      solve();
      
   }
}