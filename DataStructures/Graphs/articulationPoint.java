import java.util.*;
import java.io.*;

class articulationPoint {
  static int disc[];
  static int par[];
  static int low[];
  static boolean arti[];
  static boolean vis[];
  static int time;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    int e = sc.nextInt();

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for(int i=0;i<v;i++) graph.add(new ArrayList<>());
    for(int i=0;i<e;i++){
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    disc = new int[v];
    par = new int[v];
    low = new int[v];
    arti = new boolean[v];
    vis = new boolean[v];
    int time=0;
    par[0]=-1;
    dfs(0,graph);
    int cout=0;
    for(boolean lt:arti){
      if(lt){
        cout++;
      }
    }
    System.out.println(cout);
  }
  public static void dfs(int u,ArrayList<ArrayList<Integer>> graph){
    disc[u] = low[u] = time;
    time++;
    vis[u]=true;
    int count=0;
    ArrayList<Integer> nbrs = graph.get(u);
    for(int i=0;i<nbrs.size();i++){
      int v1 = nbrs.get(i);
      if(par[u]==v1) continue;
      else if(vis[v1]==true){
       low[u] = Math.min(low[u],disc[v1]) ;
      }
      else{
        count++;
        par[v1]=u;
        dfs(v1,graph);
        low[u] = Math.min(low[u],low[v1]);
        if(par[u]==-1){
          if(count>=2) arti[u]=true;
        }else{
         if(low[v1] >= disc[u]){
          arti[u] =true;
         }
        }
      }
    }
  }

}