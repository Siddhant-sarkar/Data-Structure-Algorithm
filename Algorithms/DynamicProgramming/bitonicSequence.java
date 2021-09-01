import java.io.*;
import java.util.*;

public class bitonicSequence{

    public static void lbs(int[] arr){
       int inc[] = new int[arr.length];
       int totalSum=Integer.MIN_VALUE;
       int dec[] = new int[arr.length];
       for(int i=0;i<arr.length;i++){
        Integer max= null;
        for(int j=0;j<i;j++){
            if(arr[i]>arr[j]){
                if(max==null|| inc[j]>max) max=inc[j];
            }
        }
        if(max==null) inc[i]=1;
        else inc[i]=max+1;
       }
       for(int i=arr.length-1;i>=0;i--){
        Integer max=null;
        for(int j=arr.length-1;j>i;j--){
            if(arr[j]<=arr[i]) if(max==null || dec[j]>max) max=dec[j];
        }
        if(max==null) dec[i]=1;
        else dec[i]=max+1;
        if(totalSum<dec[i]+inc[i]) totalSum=dec[i]+inc[i];
       }
       System.out.println(totalSum-1);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt() ;
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        lbs(arr);
    }

}