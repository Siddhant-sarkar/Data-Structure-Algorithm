import java.util.*;
public class TwoNonOverlappingSubarray{
	public static int solve(int[]arr,int x,int y){
		int n=arr.length;
		int psum[]=new int[n+1];
		for(int i=1;i<=n;i++) psum[i]=psum[i-1]+arr[i-1];
		int xmax=psum[x],ymax=psum[y],ans=psum[x+y];
		for(int i=x+y;i<=n;i++){
			xmax=Math.max(xmax,psum[i-y]-psum[i-x-y]);
			ymax=Math.max(ymax,psum[i-x]-psum[i-x-y]);
			ans=Math.max(ans,Math.max(xmax+psum[i]-psum[i-y],ymax+psum[i]-psum[i-x]));
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(solve(arr,x,y));
	}
}