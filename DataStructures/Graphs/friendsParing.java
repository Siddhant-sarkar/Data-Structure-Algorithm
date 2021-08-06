import java.io.*;
import java.util.*;

public class friendsParing{
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr ) {
         this.src = src;
         this.nbr = nbr;
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

      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      boolean [] visited = new boolean [vtces];
      for(int i=0;i<vtces;i++){
         ArrayList<Integer> comp=new ArrayList<>();
         if(visited[i]==false){
            drawTree(graph,i,comp,visited);
            comps.add(comp);
         }
      }
      int total=0;
      for(int i=0;i<comps.size();i++){
         for(int j=i+1;j<comps.size();j++){
               total+=comps.get(i).size()*comps.get(j).size();
         }
      }
      System.out.println(total/2);

   }
   public static void drawTree(ArrayList<Edge>[] graph,int src,ArrayList<Integer> comp,boolean visited[]){
      visited[src] = true;
      comp.add(src);
      for(Edge e:graph[src]){
         if(visited[e.nbr]==false){
            drawTree(graph,e.nbr,comp,visited);
         }
      }
   }

}