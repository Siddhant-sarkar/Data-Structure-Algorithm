import java.util.*;
public class exit{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt(),b=scanner.nextInt();
		int [][] ar = new int[a][b];
		for(int i=0;i<a;i++) for(int j=0;j<b;j++) ar[i][j]=scanner.nextInt();
		int i=0,j=0,d=0;
		while(i<=a-1 && j<=b-1){
			if(ar[i][j]==0){
				if(d==0) j++;
				else if(d==1) i++;
				else if(d==2) j--;
				else if(d==3) i--;
			} 
			else{
				if(d==0) i++;
				else if(d==1) j--;
				else if(d==2) i--;
				else if(d==3) j++;
				d=(d+1)%4;

			}
		}
		if(j==b){
			System.out.println(i);
			System.out.println(--j);
		}else{
			System.out.println(--i);
			System.out.println(j);
		}
	}
}