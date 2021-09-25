import java.util.*;
public class twoKeyPad{
    public static void print(int[]arr){
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=1;j<i;j++){
            }
        }
        return true;
    }
    public static int Solve(int n){
        int dp[]= new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[1]=0;
        for(int i=2;i<dp.length;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                    dp[i]=Math.min(dp[i],1+dp[j]+((i-j)/j));
                }
            }
        }
        print(dp);
        return dp[dp.length-1];
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(Solve(s));
	}	
} 