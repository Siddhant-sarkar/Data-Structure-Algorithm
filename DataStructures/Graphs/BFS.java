import java.io.*;
import java.util.*;

public class BFS {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   static class Pair{
      int v;
      String psf;
      Pair(int v,String psf){
         this.v=v;
         this.psf=psf;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      BFS(graph,2);
   }
   public static void BFS(ArrayList<Edge>[] graph,int src){
      boolean [] arr=new boolean[graph.length];
      Queue<Pair> mq=new LinkedList<>();
      mq.add(new Pair(v,src+""));
      arr[src]=true;
      while(mq.size()>0){
         Pair p= mq.remove();
         if(visited[p.nbr]==true) continue;
         System.out.println(p.v+"@"+p.psf);
         for(Edge e: graph[r.v]){
            if(visite[p.nbr]==false){
               mq.add(new Pair(p.nbr,psf+p.nbr));
            }
         }
      }
   }
}