import java.io.*;
import java.util.*;

public class swapgame {

	static String max="-1";
	public static void findMaximum(String str, int k) {
		if(k==0){
			if(Integer.parseInt(max)<Integer.parseInt(str)){
				max=str;
			}
			return;
		}
		for(int i=0;i<str.length();i++)	{
			for(int j=i;j<str.length();j++){
				String sw= swap(str,i,j);
				findMaximum(sw,k-1);
			}
		}
	}
	public static String swap(String str,int i,int j){
		StringBuilder sb= new StringBuilder(str);
		char c= sb.charAt(i);
		char cc= sb.charAt(j);
		sb.setCharAt(i,cc);
		sb.setCharAt(j,c);
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		 max = str;
		 swap(str,3,1);
		findMaximum(str, k);
		System.out.println(max);
	}

}