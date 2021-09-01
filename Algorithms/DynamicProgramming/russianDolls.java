import java.util.*;
import java.io.*;

public class russianDolls{
	public static class Dolls implements Comparable<Dolls>{
		int l;
		int b;

		Dolls(int l,int b){
			this.l=l;
			this.b=b;
		}
		public int compareTo(Dolls o){
			return this.l-o.l;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		Dolls[] dl = new Dolls[n];

		for(int i=0;i<n;i++){
			String line= sc.nextLine();
			String [] arr= line.split(" ");
			dl[i]=new Dolls(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
		}
		Arrays.sort(dl);
		// here goes the longest increasing subsequence part
		int [] dp= new int[n];
		int omax=0;
		for(int i=0;i<dl.length;i++){
			Integer max=null;
			for(int j=0;j<i;j++){
				if(dl[i].b>dl[j].b){
					if(max==null || dp[j]>max)	max=dp[j];
				}
			}
			dp[i]=(max==null)?1:max+1;
			omax=(dp[i]>omax)?dp[i]:omax;
		}
		System.out.println(omax);
	}

}