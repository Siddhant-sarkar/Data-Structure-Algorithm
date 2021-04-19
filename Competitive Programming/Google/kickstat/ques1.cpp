#include<iostream>
using namespace std;
void solve(int c){
  string s="ABBA";
  int a=4;
   cin>>a;
   cin>>s;
  cout<<"Case #"<<c<<" :";
  for(int i=0;i<a;i++){
    int b=1,c=i;
    while(c>=0){
      if(s[c]>s[c-1]&&(c-1>=0)){
         b++; 
         c--;
      }else{
          break;
      }
    }
    cout<<b<<" ";
    b=1;

  }
}
int main(){
  int a,b=0;
  cin>>a;
  while (a--)
  {
    solve(++b);
   cout<<endl;
  }
  return 0;
}
