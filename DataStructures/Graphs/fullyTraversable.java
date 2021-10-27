import java.io.*;
import java.util.*;

public class fullyTraversable {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] st = br.readLine().split(" ");
    int n = Integer.parseInt(st[0]);
    int m = Integer.parseInt(st[1]);

    int[][] edges = new int[m][3];
    for (int i = 0; i < m; i++) {
      st = br.readLine().split(" ");
      edges[i][0] = Integer.parseInt(st[0]);
      edges[i][1] = Integer.parseInt(st[1]);
      edges[i][2] = Integer.parseInt(st[2]);
    }
    fullyTraversable obj = new fullyTraversable();
    System.out.println(obj.maxNumEdgesToRemove(n, edges));
  }

  public int maxNumEdgesToRemove(int n, int[][] edges) {
    // ***-> Edges array must be sorted
    Arrays.sort(edges,(a,b)->Integer.compare(b[0],a[0]));
    int parA[] = new int[n+1];
    int parB[] = new int[n+1];
    int rankA[] = new int[n+1];
    int rankB[] = new int[n+1];

    for(int i=0;i<=n;i++){
      parA[i]=i;
      parB[i]=i;
      rankA[i]=1;
      rankB[i]=1;
    }
    int merA=1;
    int merB=1;
    int rem=0;

    for(int []e:edges){
      if(e[0]==3){
        boolean mergedA = union(e[1],e[2],parA,rankA);
        boolean mergedB = union(e[1],e[2],parB,rankB);

        if(mergedA) merA++;
        if(mergedB) merB++;

        if(!mergedB && !mergedA) rem++;

      }else if(e[0]==1){
        boolean mergedA = union(e[1],e[2],parA,rankA);
        if(mergedA) merA++;
        else rem++;
      }else{
        boolean mergedB = union(e[1],e[2],parB,rankB);
        if(mergedB)  merB++;
        else rem++;
      }
    }
    if(merA!=n || merB!=n) return -1;
    else return rem;
  }
  public static int find(int x,int[] parent){
    if(parent[x]==x) return x;
    int temp= find(parent[x],parent);
    parent[x]=temp;
    return temp;
  }
  public static boolean union(int x,int y,int[] parent,int[] rank){
    int lx=find(x,parent);
    int ly=find(y,parent);

    if(lx!=ly){
      if(rank[lx]>rank[ly]) parent[ly]=lx;
      else if(rank[ly]>rank[lx]) parent[lx]=ly;
      else{
        parent[ly]=lx;
        rank[lx]++;
      }
      return true;
    }
    return false;
  }

}