import java.io.*;
import java.util.*;

public class goldMines2 {
	static int max = 0;
	public static void dfs(int[][] arr,boolean[][]visited,int i,int j,ArrayList<Integer>bag){
		if(i<0|| j<0 || i>=arr.length || j>=arr[0].length || visited[i][j] || arr[i][j]==0){
			return;
		}
		visited[i][j]=true;
		bag.add(arr[i][j]);
		dfs(arr,visited,i-1,j,bag);
		dfs(arr,visited,i,j+1,bag);
		dfs(arr,visited,i+1,j,bag);
		dfs(arr,visited,i,j-1,bag);
	}
	public static void getMaxGold(int[][] arr){
		boolean [][] visited= new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]!=0 && !visited[i][j]){
					ArrayList<Integer> bag = new ArrayList();
					dfs(arr,visited,i,j,bag);
					int sum=0; for(Integer n: bag) sum+=n;
					if(sum>max) max=sum;
				}
			}
		}

		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		getMaxGold(arr);
		System.out.println(max);
	}
		
}