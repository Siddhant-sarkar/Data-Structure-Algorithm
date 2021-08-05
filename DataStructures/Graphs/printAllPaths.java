import java.io.*;
import java.util.*;

public class printAllPaths {
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
   static boolean []vis;
   public static void printPath(ArrayList<Edge> graph[],int src,int dest ,String s){
      if(src==dest){
        System.out.println(s); 
        return;
      }
      vis[src]=true;
      for(Edge edge:graph[src]){
         if(vis[edge.nbr]==false){
            printPath(graph,edge.nbr,dest,s+edge.nbr);
         }
      }
      vis[src]=false;
      return;
   }
   public static ArrayList<String> printPathDown(ArrayList<Edge> graph[],int src ,int dest,boolean [] visited){
      if(src==dest){
         ArrayList<String> s=new ArrayList<>();
         s.add(String.valueOf(src));
         return  s;
      }
      vis[src]=true;
      ArrayList<String> str=new ArrayList<>();
      for(Edge edge : graph[src]){
         if(vis[edge.nbr]==false){
            ArrayList<String> temp=printPathDown(graph,edge.nbr,dest,visited);
            for(String k: temp){
               str.add(String.valueOf(src)+k);
            }
         }
      }
      vis[src]=false;
      return str;

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

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());
      vis=new boolean[vtces];

      printPath(graph,src,dest,""+src);
      // ArrayList<String> st= printPathDown(graph,src,dest,vis);
      // for(String s : st){
      //    System.out.println(s);
      // }
   }


}