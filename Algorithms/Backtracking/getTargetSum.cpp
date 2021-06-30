#include<iostream>
#include<vector>
using namespace std;

void print(vector<int>arr,int idx,int sub,int req,string ans){
    if(arr.size()==0){
        cout<<ans<<endl;
    }
    print(arr,idx+1,0,req,ans+to_string(arr[idx]));
    print(arr,idx+1,0,req,ans);
}
int main(){
    int n;
    cin>>n;
    vector<int> arr;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        arr.push_back(a);
    }
    cin>>n;
    print(arr,0,0,n,"");
    return 0;
}
