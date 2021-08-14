import java.io.*;
import java.util.*;

public class tugOfWar {
	static int mindiff = Integer.MAX_VALUE;
	static String ans="";
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
		System.out.println(ans);
	}
	public static void solve(int[] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int soset1, int soset2) {
		if(vidx==arr.length){
			if(Math.abs(soset1-soset2)<mindiff){
				mindiff=Math.abs(soset1-soset2);
				ans+="[";
				for(int a : set1){
					ans+=a+",";
				}
				ans+="]";
				ans+="[";
				for(int a : set2){
					ans+=a+",";
				}
				ans+="]";
			}
			return;
		}
		set1.add(arr[vidx]);
		solve(arr,vidx+1,set1,set2,soset1+arr[vidx],soset2);
		set1.remove(set1.size()-1);
		set2.add(arr[vidx]);
		solve(arr,vidx+1,set1,set2,soset1,soset2+arr[vidx]);
		set2.add(set2.size()-1);
	}

}