import java.io.*;
import java.util.*;

public class minSwaps {
    private static class Pair implements Comparable<Pair> {
    int val;
    int idx;

    Pair(int val, int idx) {
      this.val = val;
      this.idx = idx;
    }

    @Override
    public int compareTo(Pair o) {
      return this.val - o.val;
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    String[] st = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st[i]);
    }

    System.out.println(minSwaps(arr));
  }

  public static int minSwaps(int[] arr1) {
    Pair [] pr= new Pair[arr1.length];
    for(int i=0;i<arr1.length;i++){
      pr[i]= new Pair(arr1[i],i);
    }
    Arrays.sort(pr);
    int ans=0;
    boolean vis[]= new boolean[arr1.length];
    for(int i=0;i<pr.length;i++){
      if(vis[i] || pr[i].idx==i) continue;

      int j=i;
      int cl=0;
      while(!vis[j]){
        vis[j]=true;
        cl++;
        j=pr[j].idx;
      }
      if(cl>0) ans+=cl-1;
    }
    return ans;
  }

  
}
