import java.util.*;
public class kahnsAlgorithm{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] st=sc.nextLine().split(" ");
		int n=Integer.parseInt(st[0]);
		int m=Integer.parseInt(st[1]);
		ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
		for(int i=0;i<n;i++) graph.add(new ArrayList<>());
		for(int i=0;i<m;i++){
			st=sc.nextLine().split(" ");
			int u=Integer.parseInt(st[0]);
			int v=Integer.parseInt(st[1]);
			graph.get(v).add(u);
		}
		print(graph);
		int [] arr= topo(graph,n);
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void print(ArrayList<ArrayList<Integer>> graph){
		for(int i=0;i<graph.size();i++){
			for(int j:graph.get(i)){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static int[] topo(ArrayList<ArrayList<Integer>> graph,int cr){
		int indegree[]= new int[cr];
		int ans[]= new int[cr];

		for(int i=0;i<graph.size();i++){
			for(int k:graph.get(i)){
				indegree[k]++;
			}
		}
		Queue<Integer> qu = new LinkedList<>();
		for(int i=0;i<cr;i++){
			if(indegree[i]==0){
				qu.add(i);
			}
		}
		int idx=0;
		while(qu.size()>0){
			int rm= qu.remove();
			ans[idx]=rm;
			idx++;
			for(int nbrs: graph.get(rm)){
				indegree[nbrs]--;
				if(indegree[nbrs]==0){
					qu.add(nbrs);
				}
			}
		}
		if(idx==cr){
			return ans;
		}else return new int[]{-1};
	}
}
                        
