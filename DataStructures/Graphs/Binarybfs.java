import java.io.*;
import java.util.*;

public class Binarybfs {
	public static class Pair{
		int idx;
		int wt;
		Pair(int idx,int wt){
			this.idx=idx;
			this.wt=wt;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String [] arr ;
		arr= sc.nextLine().split(" ");
		int n= Integer.parseInt(arr[0]);
		int m= Integer.parseInt(arr[1]);

		ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
		for(int i=0;i<n;i++) graph.add(new ArrayList<>());
		for(int i=0;i<m;i++){
			arr= sc.nextLine().split(" ");
			int a= Integer.parseInt(arr[0])-1;
			int b= Integer.parseInt(arr[1])-1;
			graph.get(a).add(new Pair(b,0));
			graph.get(b).add(new Pair(a,1));
		}
		LinkedList<Pair> qu = new LinkedList<>();
		boolean vis[] = new boolean[n];
		qu.addLast(new Pair(0,0));
		while(qu.size()>0){
			Pair p = qu.removeFirst();
			if(p.idx==n-1) {System.out.println(p.wt);return;}
			vis[p.idx]=true;
			for(Pair nx : graph.get(p.idx)){
				if(vis[nx.idx]) continue;
				if(nx.wt==0) qu.addFirst(new Pair(nx.idx,p.wt+0));
				else qu.addLast( new Pair(nx.idx,p.wt+1));
			}

		}
		System.out.println("-1");
	}

}
