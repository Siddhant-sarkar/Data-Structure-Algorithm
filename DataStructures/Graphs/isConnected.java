import java.io.*;
import java.util.*;

public class isConnected {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
      // NOTE : this question could also had been done with the fact that number of connected components will be always be 1 
      //        the case of singly connected graphs.
      //        the size of ArrayList<ArrayList<Integer>> comps must be == 1
      boolean [] vis= new boolean[vtces];
      boolean fi=true;
      for(int i=0;i<vtces;i++){
        if(vis[i]==false){
         boolean is=getPaths(graph,i,vtces-1,vis);
         if(!is) fi= false;
        }
      }
      System.out.println(fi);
   }
   public static boolean getPaths(ArrayList<Edge>[] graph,int src,int des,boolean[]vis){
      if(src==des) return true;
      vis[src]=true;
      for(Edge e:graph[src]){
         if(vis[e.nbr]==false){
            return getPaths(graph,e.nbr,des,vis);
         }
      }
      return false;
   }
}