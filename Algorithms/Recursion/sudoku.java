// import java.io.*;
import java.util.*;

public class sudoku {
  public static void display(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }


  public static boolean check(int[][]board,int row,int col,int n){
    for(int i=0;i<board.length;i++) if(i!=row && n==board[i][col]) return false;
      for(int j=0;j<board[0].length;j++) if(j!=col && n == board[row][j]) return false;
        int rn=(row/3);
      int cn= (col/3);
      rn*=3;
      cn*=3;
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          if(row!= i && col!= j && n==board[rn+i][cn+j]) return false;
        }
      }
      return true;
    }
    public static void solveSudoku(int[][] board, int i ,int j) {
      if(i==8 && j==8) {
        for(int k=1;k<10;k++){
          if (check(board,i,j,k)) {
            board[i][j]=k;
          }
        }
        display(board);
        board[i][j]=0;
        return;
      }
      int ni=0,nj=0;
      if(j==8){ni=i+1;nj=0;}
      else {ni=i;nj=j+1;}
      if(board[i][j]!=0) solveSudoku(board,ni,nj);
      else{
        for(int k=1;k<10;k++){
          if(check(board,i,j,k)){
            board[i][j] =k;
            solveSudoku(board,ni,nj);
            board[i][j]=0;
          }
        }
      }

    }
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int[][] arr = new int[9][9];
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      solveSudoku(arr, 0, 0);
    }
  }
