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




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
    
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());
        printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(sos > tar){
            return;
        }

        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
            }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }

}


                        