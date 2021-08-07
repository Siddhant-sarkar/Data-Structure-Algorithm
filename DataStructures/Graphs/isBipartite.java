import java.io.*;
import java.util.*;

public class isBipartite{
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
   static class Pair{
      int v;
      int l;
      Pair(int v,int p){
         this.v=v;
         this.l=p;
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
      boolean []visited= new boolean[vtces];
      int s=0;
      for(int i=0;i<vtces;i++){
         if(visited[i]==false){ 
            // System.out.println(cycleLength(graph,i,visited));
            s+=cycleLength(graph,i,visited);
         }
      }
      System.out.println(s);
      if(s==0 || s%2==0){
         System.out.println("true");
         return;
      }else{
         System.out.println(false);
         return;
      }
   }
   public static int cycleLength(ArrayList<Edge>graph[],int src,boolean[] visited){
      Queue<Pair> mq= new LinkedList<>();
      mq.add(new Pair(src,1));
      int pl=1;
      while(mq.size()>0){
         Pair p= mq.remove();
         if(visited[p.v]){
            if(p.l==pl){
               return (pl-1)*2;
            }return (2*pl)-1;
         } 
         visited[p.v]=true;
         pl=p.l;
         for(Edge e:graph[p.v]){
            if(visited[e.nbr]==false) mq.add(new Pair(e.nbr,p.l+1));
         }
      }
      return 0;
   }
}