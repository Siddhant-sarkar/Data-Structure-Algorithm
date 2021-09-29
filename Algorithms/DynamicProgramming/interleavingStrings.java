import java.io.*;
import java.util.*;

public class interleavingStrings {
  public static void print(boolean[][] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]) System.out.print("T ");
        else System.out.print("F ");
      }
      System.out.println();
    }
  }
  public static Boolean dp[][];
  public static boolean solution(String s1, String s2, String s3,int i,int j) {
    if(i==s1.length() && j==s2.length()) return true;
    if(dp[i][j]!=null ) return dp[i][j];
    if(i<s1.length()&&s1.charAt(i)==s3.charAt(i+j)){
        Boolean f1=solution(s1,s2,s3,i+1,j);
        dp[i][j]=f1;
        if(f1) return f1;
    }
    if(j<s2.length()&&s2.charAt(j)==s3.charAt(i+j)){
        Boolean f2=solution(s1,s2,s3,i,j+1);
        dp[i][j]=f2;
        if(f2) return f2;
    }
    dp[i][j]=false;
    return false;
  }
  public static boolean solve(String s1,String s2,String s3){
    boolean dp[][] = new boolean[s1.length()+1][s2.length()+1];
    for(int i=0;i<s1.length()+1;i++){
      for(int j=0;j<s2.length()+1;j++){
        if(i==0 && j==0) dp[0][0]=true;
        else if(i==0){
          if(s2.substring(0,j).equals(s3.substring(0,i+j))) dp[i][j]=true;
          else dp[i][j]=false;
        }else if(j==0){
          if(s1.substring(0,i).equals(s3.substring(0,i+j))) dp[i][j]=true;
          else dp[i][j]=false;
        }else{
          if(dp[i][j]==false && s1.charAt(i-1)==s3.charAt(i+j-1))dp[i][j]=dp[i-1][j];
          if(dp[i][j]==false && s2.charAt(j-1)==s3.charAt(i+j-1))dp[i][j]= dp[i][j-1];
        }
      }
    }
    print(dp);
    return dp[dp.length-1][dp[0].length-1];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s1 = scn.nextLine();
    String s2 = scn.nextLine();
    String s3 = scn.nextLine();
    System.out.println(solve(s1,s2,s3)); 
  }

}