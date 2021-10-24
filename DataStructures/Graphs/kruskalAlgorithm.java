import java.util.*;
import java.io.*;

public class kruskalAlgorithm {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int v = Integer.parseInt(br.readLine());
    int e = Integer.parseInt(br.readLine());

    int[][] edges = new int[e][3];
    for (int i = 0; i < e; i++) {
      String[] st = br.readLine().split(" ");
      edges[i][0] = Integer.parseInt(st[0]);
      edges[i][1] = Integer.parseInt(st[1]);
      edges[i][2] = Integer.parseInt(st[2]);
    }

    System.out.println(minCostToSupplyWater(v, edges));
  }

  static int[] parent;
  static int[] rank;

  public static class Pair implements Comparable<Pair> {
    int u;
    int v;
    int wt;

    Pair(int u, int v, int wt) {
      this.u = u;
      this.v = v;
      this.wt = wt;
    }

    @Override
    public int compareTo(Pair o) {
      return this.wt - o.wt;
    }
    @Override
   	public String toString(){
   		return u+" "+v+" "+wt+"\n";
   	}
  }
  public static boolean union(int x,int y){
  	int lx=find(x);
  	int ly=find(y);
  	if(lx!=ly){
  		if(rank[lx]>rank[ly]){
  			parent[ly]=lx;
  		}else if(rank[lx]<rank[ly]){
  			parent[lx]=ly;
  		}else{
  			parent[lx]=ly;
  			rank[ly]++;
  		}
  		return true;
  	}
  	return false;
   	
  }
  public static int find(int x){
  	if(parent[x]==x) return x;
  	int temp= find(parent[x]);
  	parent[x]=temp;
  	return temp;
  }

  public static int minCostToSupplyWater(int n, int[][] pipes) {
  	Pair [] parr= new Pair[n];
  	for(int i=0;i<parr.length;i++){
  		parr[i]= new Pair(pipes[i][0],pipes[i][1],pipes[i][2]);
  	}
  	parent=new int[n];
  	rank=new int[n];
  	for(int i=0;i<n;i++){
  		parent[i]=i;
  		rank[i]=1;
  	}
  	Arrays.sort(parr);
  	int ans=0;
  	for(int i=0;i<parr.length;i++){
  		boolean merged = union(parr[i].u,parr[i].v);
  		if(merged){
  			ans+=parr[i].wt;
  		}
  	}
  	return ans;
  }
}
