import java.util.*;
 
 public class minCostTickets {
 
 	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
         Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
         int[] days= new int[n];
         for(int i=0;i<n;i++){
             days[i]=scn.nextInt();
         }
         int[] costs = new int[3];
         for(int i=0;i<3;i++){
             costs[i]=scn.nextInt();
 	 	 }
 	 	 Arrays.sort(days);
         System.out.println(mincostTickets(days, costs));
 	 }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input 2 integer arrays
 	 // It should return the required output
     public static void print(int arr[]) {
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
     }
 	 public static int mincostTickets(int[] days, int[] costs) {
        int day=0;
        int dp[] = new int[days[days.length-1]+1];
        for(int i=1;i<dp.length;i++){
            if(i==days[day]) {
                int sDay=dp[i-1]+costs[0];
                int wDay=(i-7<0)?costs[1]:dp[i-7]+costs[1];
                int mDay=(i-30<0)?costs[2]:dp[i-30]+costs[2];
                dp[i]=Math.min(sDay,Math.min(wDay,mDay));
                day++;
            }else{
                dp[i]=dp[i-1];
            }
        }
        // print(dp);
        return dp[dp.length-1];
 	 }
 }