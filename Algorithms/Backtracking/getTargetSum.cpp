#include<iostream>
#include<vector>
using namespace std;

void print(vector<int>arr,int idx,int sub,int req,string ans){
    if(idx==arr.size()){
        if(sub==req){
            ans.append(".");
            cout<<ans<<endl;
        }
        return;
    }
    print(arr,idx+1,sub+arr[idx],req,ans+to_string(arr[idx])+", ");
    print(arr,idx+1,sub,req,ans);
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
    int a;
    cin>>a;
    print(arr,0,0,a,"");
    return 0;
}






                        