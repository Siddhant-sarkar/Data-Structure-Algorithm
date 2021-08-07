import java.io.*;
import java.util.*;

public class infection {
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
      int t;
      Pair(int v,int t){
         this.v=v;
         this.t=t;
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
      int t = Integer.parseInt(br.readLine());
      System.out.println(spredInfection(graph,src,t));   
   }
   public static int spredInfection(ArrayList<Edge>[]graph,int src,int tt){
      int total=0;
      boolean[ ] visited=new boolean[graph.length];
      Queue<Pair> mq= new LinkedList<>();
      mq.add(new Pair(src,1));
      while(mq.size()>0){
        Pair k=mq.remove();
        if(k.t>tt){
         break;
        }
        if(visited[k.v]){
         continue;
        }
        total++;
        visited[k.v]=true;
        for(Edge e: graph[k.v]){
         if(visited[e.nbr]==false){
            mq.add(new Pair(e.nbr,k.t+1));
         }
        }
      }
      return total;
   }

}