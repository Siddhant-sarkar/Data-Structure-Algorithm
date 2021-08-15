import java.io.*;
import java.util.*;

public class tugOfWar {
	static int mindiff = Integer.MAX_VALUE;
	static String ans="";
	static ArrayList<ArrayList<Integer>> ls= new ArrayList<>();
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
			if(Math.abs(soset1-soset2)<mindiff && (set1.size()==set2.size() || Math.abs(set1.size()-set2.size())==1)){
				mindiff=Math.abs(soset1-soset2);
				// System.out.println(mindiff);
				ans="";
				ans+=set1;
				ans+=" ";
				ans+=set2;
			}
			// System.out.println(set1 +"||"+set2);
			return;
		}
		if(set1.size()<(arr.length+1)/2){
			set1.add(arr[vidx]);
			solve(arr,vidx+1,set1,set2,soset1+arr[vidx],soset2);
			set1.remove(set1.size()-1);
			// if(set1.size()==0) return;
		}
		if(set2.size()<(arr.length+1)/2){
			set2.add(arr[vidx]);
			solve(arr,vidx+1,set1,set2,soset1,soset2+arr[vidx]);
			set2.remove(set2.size()-1);
			// if(set2.size()==0) return;
		}
	}

}