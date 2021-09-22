import java.io.*;
import java.util.*;

public class cherryPickup {
	public static int max=Integer.MIN_VALUE;
	public static int Solution(int r1, int c1, int r2, int[][] arr, int[][][] dp) {
		return 0;
	}
	public static void down(int i,int j ,int[][]arr,int csf){
		if(i<0|| i>=arr.length || j>=arr[0].length || j<0 || arr[i][j]==-1) return;
		if(i==arr.length-1 && j==arr[0].length-1){
			up(i,j,arr,csf);
			return;
		}
		int ch=arr[i][j];
		arr[i][j]=0;
		down(i+1,j,arr,csf+ch);
		down(i,j+1,arr,csf+ch);
		arr[i][j]=ch;
	}
	public static void up(int i,int j,int[][]arr,int csf){
		if(i<0|| i>=arr.length || j>=arr[0].length || j<0 || arr[i][j]==-1) return;
		if(i==0 && j==0){
			max=Math.max(max,csf);
		}
		int ch=arr[i][j];
		arr[i][j]=0;
		up(i-1,j,arr,csf+ch);
		up(i,j-1,arr,csf+ch);
		arr[i][j]=ch;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0 ; j < n; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		down(0,0,arr,0);
		// int ans = Math.max(0,Solution(0, 0, 0, arr, new int[n][n][n]));
		System.out.println(max);
	}

}