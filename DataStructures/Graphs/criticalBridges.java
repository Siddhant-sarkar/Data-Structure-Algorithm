import java.util.*;
import java.io.*;

class criticalBridges {
  static int parent[];
  static int disc[];
  static int low[];
  static int time;
  static boolean[] vis;
  public static void bridges(ArrayList<ArrayList<Integer>> graph,List<List<Integer>> ls,int u){
    disc[u] = low[u] =time;
    time++;
    vis[u]=true;
    for(int i=0;i<graph.get(u).size();i++){
      int v = graph.get(u).get(i);
      if(v == parent[u]) continue;
      else if(vis[v]==true){
        low[u] = Math.min(low[u],disc[v]);
      }else{
        parent[v] = u;
        bridges(graph,ls,v);
        low[u]=Math.min(low[u],low[v]);
        if(low[v] > disc[u]){
          List<Integer> tm = new ArrayList<>();
          tm.add(u);
          tm.add(v);
          ls.add(tm);
        }
      }
    }
  }
  public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> Edges) {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for(int i=0;i<n;i++) graph.add(new ArrayList<>());
    for(int i=0;i<Edges.size();i++){
      int u=Edges.get(i).get(0);
      int v=Edges.get(i).get(1);
      graph.get(u).add(v);
      graph.get(v).add(u);
    }
    parent = new int[n];
    disc = new int[n];
    low= new int[n];
    vis = new boolean[n];
    time=0;
    List<List<Integer>> ls = new ArrayList<>();
    bridges(graph,ls,0);
    return ls;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);
    int e = Integer.parseInt(st[1]);
    List<List<Integer>> edges = new ArrayList<>();


    for (int i = 0; i < e; i++) {
      edges.add(new ArrayList<>());
      st = br.readLine().split(" ");
      edges.get(i).add(Integer.parseInt(st[0]));
      edges.get(i).add(Integer.parseInt(st[1]));
    }

    System.out.println(criticalConnections(n, edges));

  }

}