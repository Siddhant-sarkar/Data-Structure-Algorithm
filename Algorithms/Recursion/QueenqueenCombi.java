import java.io.*;
import java.util.*;

public class QueenqueenCombi {

    public static void print(boolean [][]chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                if(chess[i][j]) System.out.print("q\t");
                else System.out.print("-\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j){
        if(qpsf==tq){
            print(chess);
            return;
        }
        for(int col=j+1;col<tq;col++){
            chess[i][col]=true;
            queensCombinations(qpsf+1,tq,chess,i,col);
            chess[i][col]=false;
        }
        for(int row=i+1;row<tq;row++){
            for(int col=0;col<tq;col++){
                chess[row][col]=true;
                queensCombinations(qpsf+1,tq,chess,row,col) ;
                chess[row][col]=false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean[][] chess = new boolean[n][n];
        
        queensCombinations(0, n, chess, 0, -1);
    }
}