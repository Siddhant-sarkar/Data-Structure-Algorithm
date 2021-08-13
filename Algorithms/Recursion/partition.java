import java.io.*;
import java.util.*;

public class partition {

	static int counter=1;
	public static void solution(int i, int n, int k, int rssf, ArrayList<ArrayList<Integer>> ans) {
		if(i>n){
			if(rssf==k){
				System.out.print(counter+". ");
				for(ArrayList<Integer> arr: ans) System.out.print(arr+" ");
				System.out.println();
				counter++;
			}
			return;
		}
		for(int ii=0;ii<ans.size();ii++){
			if(ans.get(ii).size()>0){
				ans.get(ii).add(i);
				solution(i+1,n,k,rssf,ans);
				// ans.get(ii).remove(ii);
				ans.get(ii).remove(ans.get(ii).size()-1);
			}else{
				ans.get(ii).add(i);
				solution(i+1,n,k,rssf+1,ans);
				ans.get(ii).remove(ans.get(ii).size()-1);
				break;
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i  = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(1, n, k, 0, ans);

	}

}