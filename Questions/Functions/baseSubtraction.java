import java.util.*;
public class baseSubtraction{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   // public static int getDifference(int bs, int n1, int n2){
   //  boolean p=false;
   //  int ans=0;
   //    for(int i=0;(n1>0 || n2>0 );i++){
   //      int a=n2%10,b=n1%10;
   //      if(p) b++;
   //      if(a>=b) {
   //        ans+=(a-b)*Math.pow(10,i);
   //        p=false;
   //      } else{
   //        ans+=(bs-b)*Math.pow(10,i);
   //        p=true;
   //      }
   //      n1/=10;
   //      n2/=10;
   //    }
   //    return ans;
   // }
   public static int getDifference(int bs, int n1, int n2){
      int ans=0;
      boolean p=false;
      for(int i=0;(n1>0 || n2>0 || p);i++){
        int a= n2%10,b=n1%10;
        if (p) a--;
        if(a>=b){
          ans += (a-b)*Math.pow(10,i);
          p=false;
        }else{
          ans+=(a-b+bs)*Math.pow(10,i);
          p=true;
        }
        n1/=10;
        n2/=10;
      }
      return ans;
   }
  }