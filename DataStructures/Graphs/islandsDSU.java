import java.util.*;
import java.io.*;

public class islandsDSU {
  static int rank[];
  static int parent[];
  static int dirs[][] ={{1,0},{-1,0},{0,1},{0,-1}};
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] st = br.readLine().split(" ");
    int m = Integer.parseInt(st[0]);
    int n = Integer.parseInt(st[1]);
    int q = Integer.parseInt(st[2]);

    int[][] pos = new int[q][2];
    for (int i = 0; i < q; i++) {
      st = br.readLine().split(" ");
      pos[i][0] = Integer.parseInt(st[0]);
      pos[i][1] = Integer.parseInt(st[1]);
    }

    System.out.println(numIslands2(m, n, pos));
  }

  public static List<Integer> numIslands2(int m, int n, int[][] pos) {
    List<Integer> clist = new ArrayList<>();
    int total=n*m;
    parent = new int[total]; Arrays.fill(parent,-1);
    rank = new int[total];
    int nas = 0;
    for(int i=0;i<pos.length;i++){
      int r = pos[i][0];int c = pos[i][1];
      int cn = r*n+c;

      if(parent[cn]!=-1){
        clist.add(nas);
        continue;
      }else{
        rank[cn]=1;parent[cn]=cn;
        nas+=1;
        for(int[] dir: dirs){
          int nr=r+dir[0];int nc=c+dir[1];
          int ncn= nr*n+nc;
          if(nr<0 || nr>=m || nc<0 || nc>=n || parent[ncn]==-1){
            continue;
          }
          if(union(cn,ncn)) nas--;
        }
      }
      clist.add(nas);
    }
    return clist;
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
    if(parent[x]==x)  return x;
    int temp= find(parent[x]);
    parent[x]=temp;
    return temp;
  }
}