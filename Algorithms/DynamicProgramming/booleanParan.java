import java.util.*;

public class booleanParan{
	public static void print(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int solve(String s,String op){
		int farray[][] = new int[s.length()][s.length()];
		int tarray[][] = new int[s.length()][s.length()];
		for(int g=0;g<farray[0].length;g++){
			for(int i=0,j=g;j<farray[0].length;j++,i++){
				if(g==0){
					char c= s.charAt(i);
					if(c=='T'){
						tarray[i][j]=1;
						farray[i][j]=0;
					}else{
						farray[i][j]=1;
						tarray[i][j]=0;
					}
				}else{
					for(int k=i;k<j;k++){
						char c=op.charAt(k);
						int lt=tarray[i][k];
						int lf=farray[i][k];
						int rt=tarray[k+1][j];
						int rf=farray[k+1][j];
						if(c=='&'){
							tarray[i][j]+=lt*rt;
							farray[i][j]+=lt*rf+rt*lf+lf*rf;
						}else if(c=='|'){
							farray[i][j]+=lf*rf;
							tarray[i][j]+=lt*rf+rt*lf+lt*rt;
						}else{
							tarray[i][j]+=lt*rf+rt*lf;
							farray[i][j]+=lt*rt+lf*rf;
						}
					}
				}
			}
		}
		return tarray[0][tarray[0].length-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String l= sc.nextLine();
		System.out.println(solve(s,l));
	}
}