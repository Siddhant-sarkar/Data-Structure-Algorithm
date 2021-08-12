import java.io.*;
import java.util.*;

public class crossword{

  public static void solution(char[][] arr, String[] words, int vidx) {
   if(vidx==words.length){
    print(arr);
    return;
   }
   String s=words[vidx];
   for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
      if(arr[i][j]=='-' || arr[i][j]==s.charAt(0)){
       if(canPlaceH(arr,s,i,j)==true) {
        boolean []vis=placeH(arr,s,i,j);
        solution(arr,words,vidx+1);
        unplaceH(arr,vis,i,j);
      }
      if(canPlaceV(arr,s,i,j)==true){
        boolean[] vis=placeV(arr,s,i,j);
        solution(arr,words,vidx+1);
        unplaceV(arr,vis,i,j);
      }
    }
  }
}
}

public static boolean canPlaceV(char[][] arr, String word, int r, int c) {
    int i = 0 ;
    for (; i < word.length(); i++) {
      if (r + i >= arr.length) {
        return false;
      }
      if (arr[r + i][c] == '-' || arr[r + i][c] == word.charAt(i)) {
        continue;
      } else {
        return false;
      }
    }

    if (r + i == arr.length || arr[r + i][c] == '+') {
      return true;
    } else {
      return false;
    }
  }

  public static boolean canPlaceH(char[][] arr, String word, int r, int c) {
    int i = 0;
    for (; i < word.length(); i++) {
      if (c + i >= arr.length) {
        return false;
      }
      if (arr[r][c + i] == '-' || arr[r][c + i] == word.charAt(i)) {
        continue;
      } else {
        return false;
      }
    }
    if (c + i == arr.length || arr[r][c + i] == '+') {
      return true;
    } else {
      return false;
    }
  }
public static boolean[] placeH(char[][]arr,String s,int i ,int j){
  boolean[] vis= new boolean[s.length()];
  for(int jj=0;jj<s.length();jj++){
    if(arr[i][j+jj]=='-'){
      vis[jj]=true;
      arr[i][jj+j]=s.charAt(jj);
    }
  }
  return vis;
}
public static boolean[] placeV(char[][]arr,String s,int i ,int j){
  boolean[] vis= new boolean[s.length()];
  for(int ii=0;ii<s.length();ii++){
    if(arr[i+ii][j]=='-'){
      vis[ii] = true;
      arr[i+ii][j]=s.charAt(ii);
    }
  }
  return vis;
}
public static void unplaceH(char[][]arr,boolean[]vis,int i,int j){
  for(int jj=0;jj<vis.length;jj++){
    if(vis[jj]==true) arr[i][j+jj]='-';
  }
}
public static void unplaceV(char[][]arr,boolean[]vis,int i,int j){
  for(int ii=0;ii<vis.length;ii++){
    if(vis[ii]==true) arr[i+ii][j]='-';
  }
}

public static void print(char[][] arr) {
  for (int i = 0 ; i < arr.length; i++) {
    for (int j = 0 ; j < arr.length; j++) {
      System.out.print(arr[i][j]);
    }
    System.out.println();
  }

}
public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  char[][] arr = new char[10][10];
  for (int i = 0 ; i < arr.length; i++) {
    String str = scn.next();
    arr[i] = str.toCharArray();
  }
  int n = scn.nextInt();
  String[] words = new String[n];
  for (int i = 0 ; i  < words.length; i++) {
    words[i] = scn.next();
  }
  solution(arr, words, 0);
}
}