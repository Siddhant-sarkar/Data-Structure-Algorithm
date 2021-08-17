import java.io.*;
import java.util.*;

public class Queen1dSafeQueen{
    public static void print(int[][] chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                if(chess[i][j]!=0) System.out.print("q"+chess[i][j]+"\t");
                else System.out.print("-\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
        for(int i=0, j=col;i<chess.length;i++) if(chess[i][col]!=0) return false; 
        for(int i=row,j=0; j<chess[0].length;j++) if(chess[row][j]!=0) return false;
        for(int i=row, j=col;i>=0 && j>=0;i--,j--) if(chess[i][j]!=0) return false;
        for(int i=row, j=col;i<chess.length && j<chess[0].length;i++,j++) if(chess[i][j]!=0) return false;
        for(int i=row, j=col;i>=0 && j<chess[0].length;i--,j++) if(chess[i][j]!=0) return false;
        for(int i=row, j=col;i<chess.length && j>=0;i++,j--) if(chess[i][j]!=0) return false;
        return true;
    }

    public static void nqueens(int qpsf, int tq, int[][] chess) {
        if(qpsf==tq){
            print(chess);
            return ;
        }
        for(int i=0;i<tq*tq;i++){
            int r=i/tq;
            int c=i%tq;
            if(IsQueenSafe(chess,r,c) && chess[r][c]==0){
                chess[r][c]=qpsf+1;
                nqueens(qpsf+1,tq,chess);
                chess[r][c]=0;
            }

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        nqueens(0, n, chess);
    }
}