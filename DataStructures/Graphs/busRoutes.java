import java.util.*;
class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer,ArrayList<Integer>> mp = new HashMap<>();
        HashSet<Integer> st = new HashSet<>();
        int t=0;
        if(source == target) return 0;
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes[i].length;j++){
                ArrayList<Integer> ls = mp.getOrDefault(routes[i][j],new ArrayList<>());
                ls.add(i);
                mp.put(routes[i][j],ls);
            }
        }

        ArrayDeque<Integer> mq = new ArrayDeque<>();
        mq.add(source);
        while(mq.size()>0){
            int len= mq.size();
            t++;
            while(len-- > 0){
               int curr = mq.remove();
               ArrayList<Integer> carr = mp.get(curr);
               for(int i : carr){
                   if(st.contains(i)) continue;
                   st.add(i);
                   for(int j=0 ;j<routes[i].length;j++){
                        if(routes[i][j]==target) return t;
                       mq.add(routes[i][j]);
                   }
               }
            }
        }
        return -1;        
    }
}

public class busRoutes{
    public static void main(String[] args) {
        
    }
}