import java.util.*;
public class baseAddition{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
    int ans=0,c=0;
      for(int i=0;(n1>0 || n2>0 || c>0);i++){
        int cs =((n1%10)+(n2%10)+c);
        ans+=(cs%b)*Math.pow(10,i);
        c=cs/b;
        n1/=10;
        n2/=10;
      }
    return ans;
   }
  }