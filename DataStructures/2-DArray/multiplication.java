import java.io.*;
import java.util.*;

public class multiplication{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt(),b=sc.nextInt();
    int [][]ar = new int [a][b];
    for (int i=0; i<a; i++) for( int j=0;j<b;j++) ar[i][j]=sc.nextInt();
    int c=sc.nextInt(),d=sc.nextInt();
    int [][]arr = new int [c][d];
    for (int i=0; i<c; i++) for( int j=0;j<d;j++) arr[i][j]=sc.nextInt();
    int [][] ans =new int [a][d];
    if(b!=c){

        System.out.println("Invalid input");
    }else{
        for(int i=0;i<a;i++){
        for(int j=0;j<d;j++){
            for(int k=0;k<b;k++){
                ans[i][j]+= ar[i][k]*arr[k][j];
            }
        }
    }
        for(int i=0;i<a;i++){
            for(int j=0;j<d;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        
        }
    }

 }

}