import java.io.*;
import java.util.*;

public class lexicographicalPrint {
	public static void print(int c,int p,int n){
		if(c>n) return;
		if(p!=1)System.out.println(c);
		for(int i=0;i<10;i++){
			// if(i==0) print(c*p*10,p,n);
			 print((c*p)+i,p,n);
		}

	}
		public static void printB(int n){
			for(int i=1;i<10;i++){
				print(i,10,n);
			}
		}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printB(n);
	}
	
}