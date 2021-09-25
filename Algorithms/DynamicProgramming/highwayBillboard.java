import java.util.Scanner;
import java.util.*;
public class highwayBillboard{
    public static void print(int[]arr){for(int i:arr){System.out.print(i+" ");}System.out.println();}
    public static int solution(int m , int[] board, int[] rev, int t) {
        int dp[]= new int[board.length];
        dp[0]=board[0];
        int ans=0;
        for(int i=0;i<board.length;i++){
            int max=0;            
            for(int j=0;j<i;j++){
                int dist=board[i]-board[j];
                if(dist>t){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+rev[i];
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
    public static int solutionMiles(int m , int[] board, int[] rev, int t) {
        int dp[] = new int[m+1];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<board.length;i++) mp.put(board[i],rev[i]);
        for(int i=1;i<dp.length;i++){
            if(mp.containsKey(i)==false){
                dp[i]=dp[i-1];
            }else{
                int bn=dp[i-1];
                int bi=dp[i-t-1]+mp.get(i)+0;
                dp[i]=Math.max(bn,bi);
            }
        }
        return dp[m];
    }
    public static void input(int []arr,Scanner scn){
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
    }
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);   
        int m = scn.nextInt();
        int n = scn.nextInt();
        
        int x[] = new int[n];
        input(x, scn);

        int revenue[] = new int[n];
        input(revenue,scn);

        int t = scn.nextInt();

        System.out.println(solutionMiles(m, x, revenue, t));
        scn.close();
    }
}