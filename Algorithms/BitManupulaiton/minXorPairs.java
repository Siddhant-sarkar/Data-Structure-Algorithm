import java.io.*;
import java.util.*;

public class minXorPairs {

    public static void solution(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((arr[i]^arr[j])<min && i!=j) {min=arr[i]^arr[j];}
            }
        }
        System.out.println(min);
    }
    public static void solutionMy(int[]arr){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]^arr[i+1])<min) min=arr[i]^arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]^arr[i+1])==min) System.out.println(arr[i]+", "+arr[i+1]);
        }
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solutionMy(arr);
    }
    
    
}