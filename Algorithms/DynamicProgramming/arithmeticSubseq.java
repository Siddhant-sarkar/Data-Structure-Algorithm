import java.util.*;
public class arithmeticSubseq{
	public static int solve(int arr[]){
		int ans=0;
		int n=arr.length;
		HashMap<Integer ,Integer> mp[]= new HashMap[n];
		for(int i=0;i<n;i++) mp[i]= new HashMap<>();
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				long diff=(long)arr[i]-(long)arr[j];
				if(diff>=Integer.MAX_VALUE|| diff<=Integer.MIN_VALUE){
					continue;	
				}
				int onj=mp[j].getOrDefault((int)diff,0);
				int oni=mp[i].getOrDefault((int)diff,0);
				ans+=onj;
				mp[i].put((int)diff,(onj+oni+1));
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println(solve(arr));
	}
}