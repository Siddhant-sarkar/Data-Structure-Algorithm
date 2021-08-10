import java.io.*;
import java.util.*;

public class nQueenBnB{

  /*public static boolean isSafe(boolean[][]arr,int i ,int j){
    for(int col=j-1;col>=0;col--) if(arr[i][col]) return false; // horizontal row
    for(int row=i-1;row>=0;row--) if(arr[row][j]) return false; // vertical colummn
    for(int row=i-1,col=j-1;row>=0 && col>=0;row--,col--) if(arr[row][col]) return false; // back diagonal 
    for(int row=i-1,col=j+1;row>=0 && col<arr[0].length;row--,col++) if(arr[row][col]) return false; // forward diagonal
    return true;
  }
  public static void nqueen(boolean [][]arr,int row){
    if(row==arr.length){
      printBoard(arr);
      return;
    }
    for(int col=0;col<arr[0].length;col++){
      if(arr[row][col]==false && isSafe(arr,row,col)){
        arr[row][col]=true;
        nqueen(arr,row+1);
        arr[row][col]=false;
      }
    }
  }*/
  static boolean cl[];
  static boolean dia[];
  static boolean diaa[];

  public static void nQueen(boolean[][] arr,int row,String s){
    if(row==arr.length){
      s+=".";
      System.out.println(s);
      // printBoard(arr);
      return;
    }
    for(int col=0;col<arr.length;col++){
      if(cl[col]|| dia[col+row] || diaa[row-col+arr.length-1]) continue;
      cl[col]=true;dia[col+row]=true;diaa[row-col+arr.length-1]=true;
      arr[row][col]=true;
      nQueen(arr,row+1,s+row+"-"+col+", ");
      arr[row][col]=false;
      cl[col]=false;dia[col+row]=false;diaa[row-col+arr.length-1]=false;
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    cl=new boolean[n];
    dia=new boolean[2*n];
    diaa=new boolean[2*n];

    boolean[][] board = new boolean[n][n];
    nQueen(board,0,"");
  }
  public static void printBoard(boolean[][]arr){
    for(boolean b[]:arr){
      for(boolean a:b){
        if(a) System.out.print(" 0 ");
        else System.out.print(" * ");
      }
      System.out.println();
    }
    System.out.println();
  }
}