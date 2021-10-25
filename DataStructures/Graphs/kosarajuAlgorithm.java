import java.io.*;
import java.util.*;

public class kosarajuAlgorithm {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in)	;
		int n=sc.nextInt(); int m= sc.nextInt();
		ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
		for(int i=0;i<n;i++) graph.add(new ArrayList<>());
		for(int i=0;i<m;i++){
			int u=sc.nextInt();int v= sc.nextInt();
			graph.get(u-1).add(v-1);
		}
		//
		Stack<Integer> st = new Stack<>();
		boolean visited[]=new boolean[n];
		//
		for(int i=0;i<n;i++){
			if(!visited[i]){
				dfs1(graph,i,visited,st);
			}
		}
		// System.out.println(st);


		ArrayList<ArrayList<Integer>> rgraph= new ArrayList<>();
		for(int i=0;i<n;i++) rgraph.add(new ArrayList<>());
		for(int i=0;i<n;i++){
			ArrayList<Integer> nbrs=graph.get(i);
			for(int nbr: nbrs){
				rgraph.get(nbr).add(i);
			}
		}

		visited= new boolean[n];
		int ans=0;
		while(st.size()>0){
			int i= st.pop();
			if(!visited[i]){
				dfs2(rgraph,i,visited);
				ans++;
			}
		}
		System.out.println(ans);
	}
	public static void dfs1(ArrayList<ArrayList<Integer>> graph,int src,boolean[] visited,Stack<Integer> st){
		visited[src]=true;
		ArrayList<Integer> nbrs= graph.get(src) ;
		for(int nbr : nbrs){
			if(!visited[nbr]){
				dfs1(graph,nbr,visited,st);
			}
		}
		st.push(src);
	}
	public static void dfs2(ArrayList<ArrayList<Integer>> rgraph,int src,boolean[] visited){
		visited[src]=true;
		ArrayList<Integer> nbrs= rgraph.get(src) ;
		for(int nbr : nbrs){
			if(!visited[nbr]){
				dfs2(rgraph,nbr,visited);
			}
		}
	}

}
