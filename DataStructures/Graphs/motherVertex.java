import java.io.*;
import java.util.*;


public class motherVertex{
    	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		int n = Integer.parseInt(st[0]);
		int m = Integer.parseInt(st[1]);

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			st = br.readLine().split(" ");
			int u = Integer.parseInt(st[0]) - 1;
			int v = Integer.parseInt(st[1]) - 1;
			graph.get(u).add(v);
		}

		System.out.println(findMotherVertex(n, graph));
	}
    public static int findMotherVertex(int N, ArrayList<ArrayList<Integer>>adj){
    	boolean vis[]= new boolean[N];
    	Stack<Integer> st= new Stack<>();
    	for(int i=0;i<N;i++){
    		if(!vis[i]){
    			dfs1(adj,i,vis,st);
    		}
    	}
    	System.out.println(st);
    	HashSet<Integer> set= new HashSet<>();
    	vis= new boolean[N];
    	dfs(adj,st.peek(),set);
    	if(set.size()==N){
    		return st.peek()+1;
    	}
    	return -1;
    }
    public static void dfs1(ArrayList<ArrayList<Integer>> adj,int s,boolean[] vis,Stack<Integer>st){
    	vis[s]=true;
    	ArrayList<Integer> ar=adj.get(s);
    	for(int i : ar){
    		if(!vis[i]){
    			dfs1(adj,i,vis,st);
    		}
    	}
    	st.push(s);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int s,HashSet<Integer> st){
    	st.add(s);
    	ArrayList<Integer> ar = adj.get(s);
    	for(int k: ar){
    		if(!st.contains(k)){
    			dfs(adj,k,st);
    		}
    	}
    }

}