// import java.io.*;
import java.util.*;

public class sudoku{

  public static void display(int[][] arr){
    for (int ii = 0; ii < arr.length; ii++) {
      for (int jj = 0; jj < arr.length; jj++) {
        System.out.print(arr[ii][jj] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void solveSudoku(int[][] arr, int[] rows, int[] cols, int[][] grid, int i, int j) {
    if(i==arr.length){
      display(arr);
      return;
    }
    if(arr[i][j]>0){
      solveSudoku(arr,rows,cols,grid,j==8?i+1:i,j==8?0:j+1);
    }else{
      for(int n=1;n<10;n++){
        if((rows[i]&(1<<n))==0 && (cols[j]&(1<<n))==0 &&( grid[i/3][j/3]&(1<<n))==0){
         arr[i][j]=n;
         rows[i] ^= 1<<n;
         cols[j] ^=1<<n;
         grid[i/3][j/3] ^= 1<<n;
         solveSudoku(arr,rows,cols,grid,j==8?i+1:i,j==8?0:j+1);
         rows[i] ^= 1<<n;
         cols[j] ^=1<<n;
         grid[i/3][j/3] ^= 1<<n;
         arr[i][j]=0;
        }
      }
    }

  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    int[] rows = new int[9];
    int[] cols = new int[9];
    int[][] grid = new int[3][3];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        int digit = scn.nextInt();
        arr[i][j] = digit;
        rows[i] |= (1 << digit);
        cols[j] |= (1 << digit);
        grid[i / 3][j / 3] |= (1 << digit);
      }
    }

    solveSudoku(arr, rows, cols, grid, 0, 0);
  }

}