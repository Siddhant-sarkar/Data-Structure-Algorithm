import java.util.*;
public class pattern15{
	static void print(int sp,int st,int r){
		for(int i=1;i<=sp;i++) System.out.print("\t");
		for(int i=1;i<=st;i++){
			System.out.print(r+"\t");
			if(i<=st/2){
				r++;
			}else r--;

		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sp=a/2,st=1,r=1;
		for(int i =1; i<=a;i++){
			print(sp,st,r);
			if(i<=a/2){
				sp--;
				st+=2;
				r++;
			}else{
				sp++;
				st-=2;
				r--;
			}
		}
	}
}