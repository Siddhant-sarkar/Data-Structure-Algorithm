#include<iostream>
#include<string>
using namespace std;
void solve(){
   string s;
   cin>>s;
   // cout<<s<<endl;
   int c=0;
   for (size_t i = 0; i < s.length(); i++)
   {
      if(s[i]=='1'&&s[i+1]=='0'){
         c++;
      }else if (s[i]=='1'&&i==s.length()-1)
      {
         c++;
      }
      
   }
   printf("%d\n",c);
}
int main(){
   // freopen("inp.txt","r",stdin);
   int a=4;
   scanf("%d",&a);
   while (a--)
   {
      solve();
   }
   
}