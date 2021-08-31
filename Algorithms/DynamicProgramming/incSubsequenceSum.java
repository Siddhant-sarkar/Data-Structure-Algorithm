import java.io.*;
import java.util.*;

public class incSubsequenceSum {
    public static void liss(int arr[]){
        int osum=0;
        int[] dp= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            Integer sum=null;
            for(int j=0;j<i;j++){
                if( arr[j]<=arr[i]){
                    if(sum==null || sum<dp[j])sum=dp[j];
                }
            }
            if(sum==null){
                dp[i]=arr[i];
            }else dp[i]=sum+arr[i];
            if(dp[i]>osum) osum=dp[i];
        }
        System.out.println(osum);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++) arr[i]= sc.nextInt();
        liss(arr);
    }
}