import java.io.*;
import java.util.*;

public class Queenqueen1d {

    public static void print(boolean chessl[][]){
        for(int i=0;i<chessl.length;i++){
            for(int j=0;j<chessl[0].length;j++){
                if(chessl[i][j]) System.out.print("q\t");
                else System.out.print("-\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
        if(qpsf==tq){
            print(chess);
            return;
        }
        for(int i=lcno+1;i<tq*tq;i++){
            int cn=i%tq;
            int rn=i/tq;
            // System.out.println(rn+" "+cn);
            chess[rn][cn]=true;
            queensCombinations(qpsf+1,tq,chess,i);
            chess[rn][cn]=false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}