import java.util.*;
class Solution {
    public int slidingPuzzle(int[][] board) {
        ArrayDeque<String> mq = new ArrayDeque<>();
        String ans = "123450";
        String start ="";
        HashSet<String> visited = new HashSet<>();
        int[][] dirs = new int[][] { { 1, 3 }, { 0, 2, 4 },
                { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++) start += board[i][j];
        }
        if(start.equals(ans)) return 0;
        mq.add(start);visited.add(start);
        int t=0;
        while(mq.size()>0){
            int n =  mq.size();
            t++;
            while(n-- > 0){
                String rs = mq.remove();
                int cr = rs.indexOf('0');
                for(int i : dirs[cr]){
                    String nxt = swap(rs,cr,i);
                    if(visited.contains(nxt)){ continue; }
                    if(nxt.equals(ans)) return t;
                    visited.add(nxt);
                    mq.add(nxt);
                }
            }
        }
        return -1;
    }
    public String swap(String str,int i,int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();

    }
}
public class slidingPuzzle{
    public static void main(String[] args) {
        
    }
}