import java.io.*;
import java.util.*;

public class rotate90 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][] ar= new int[n][n];
        int [][] arr= new int[n][n];
        for (int i=0; i<n; i++) for (int j=0;j<n;j++) ar[i][j]=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                arr[n-1-i][j]=ar[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        display(arr);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}