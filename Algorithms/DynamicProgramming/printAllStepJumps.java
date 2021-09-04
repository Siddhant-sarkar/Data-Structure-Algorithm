import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class printAllStepJumps{
    static class Pair{
        int idx;
        int jmp;
        int pc;
        String asf;

        Pair(int idx,int jmp,int pc,String asf){
           this.idx=idx;
           this.jmp=jmp;
           this.pc=pc;
           this.asf=asf;
        }
    }
    public static void Solution(int arr[]){
     Integer dp[]= new Integer[arr.length];
     dp[arr.length-1]=0;
     for(int i=arr.length-2;i>=0;i--){
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=arr[i] && i+j<arr.length;j++){
            if(dp[i+j]!=null && dp[i+j]<min){
                min=dp[i+j];
            }
        }
        if(min!=Integer.MAX_VALUE) dp[i]=min+1;
     }
     System.out.println(dp[0]);
     ArrayDeque<Pair> dq= new ArrayDeque<>();
     dq.add(new Pair(0,arr[0],dp[0],"0"));
     while(dq.size()>0){
        Pair np= dq.removeFirst();
        int i=np.idx;
        if(np.pc==0) System.out.println(np.asf+'.');
        for(int j=1;j<=np.jmp && i+j<arr.length;j++){
            if(dp[j+i]!=null &&  dp[j+np.idx]==np.pc-1){
                dq.add(new Pair(i+j,arr[i+j],dp[i+j],np.asf+" -> "+(i+j)));
            }
        }
     }

    }
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scn.nextInt();

        Solution(arr);
        scn.close();
    }
}
