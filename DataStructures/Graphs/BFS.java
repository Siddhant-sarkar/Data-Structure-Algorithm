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
      BFS(graph,src);
   }
   public static void BFS(ArrayList<Edge>[] graph,int src){
      // re mark* work add*
      boolean [] visited=new boolean[graph.length];
      Queue<Pair> mq=new LinkedList<>();
      mq.add(new Pair(src,src+""));
      while(mq.size()>0){
         Pair p= mq.remove();
         if(visited[p.v]==true) continue;
         visited[p.v]=true;
         System.out.println(p.v+"@"+p.psf);
         for(Edge e: graph[p.v]){
            if(visited[e.nbr]==false){
               // just be more sure than 
               // add them by marking them visited
               // THIS WILL SAVE YOUR ASS ONE MORE TIME
               mq.add(new Pair(e.nbr,p.psf+e.nbr));
            }
         }
      }
   }
}