import java.util.*;
public class rotate{

	static int digit(int num){
		int counter=0;
		while(num>0){
			num/=10;
			counter++;
		}
		return counter;
	}
	static int reverse(int n ){
		int ans=0;
		while(n>0){
			ans+=n%10;
			ans*=10;
			n/=10;
		}
		return ans/10;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int r=scanner.nextInt();
		int d=digit(n);

		if(r>0){
			for(int i=1;i<=r%d;i++){
				n+=(n%10)*Math.pow(10,d);
				n/=10;
			}
		}else{
			r=-r;
			for(int i=1;i<=r%d;i++){
				n=((n%(int)Math.pow(10,d-1))*10)+(n/(int)Math.pow(10,d-1));
			}
		}
		System.out.println(n);
		scanner.close();
	}
}