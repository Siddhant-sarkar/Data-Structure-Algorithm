import java.io.*;
import java.util.*;

public class QueenBox {

    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
        if(row==tq){
            if(qpsf==tq){
                System.out.println(asf);
            }
            return;
        }
        int nr=row,nc=col;
        if(col==tq-1){
            nc=0;nr=row+1;
        }else{
            nc=col+1;
        }
        if(col==tq-1){
            queensCombinations(qpsf+1,tq,nr,nc,asf+"q\n");
            queensCombinations(qpsf,tq,nr,nc,asf+"-\n");
        }else{
            queensCombinations(qpsf+1,tq,nr,nc,asf+"q");
            queensCombinations(qpsf,tq,nr,nc,asf+"-");
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // printArry(0,0,"") ;
        queensCombinations(0, n, 0, 0, "");
    }
}