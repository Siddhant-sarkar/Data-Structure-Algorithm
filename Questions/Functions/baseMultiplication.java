import java.util.*;

public class baseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    // int d = add(10,400,400);
    int d = finalPro(b, n1, n2);
    System.out.println(d);
 }
 public static int finalPro(int bs,int n1,int n2){
    int ans=0;
    int counter=1;
    while(n2>0){
        ans=add(bs,ans,(getProductOne(bs,n1,n2%10)*counter));
        counter*=10;
        n2/=10;
    }
    return ans;
 }
 public static int add(int bs,int n1,int n2){
    int ans=0,c=0,p=1;
    for(int i=0;n1>0 || n2 >0 || c>0;i++){
        int cs=n1%10+ n2%10+c;
        ans+=cs%bs*p;
        c=cs/bs;
        n1/=10;
        p*=10;
        n2/=10;
    }
    return ans;
 }
 public static int getProductOne(int bs, int n1, int n2){
    int ans=0,c=0,p=1;
    for( int i=0;n1>0 ||  c>0;i++){
        int cp = (n1%10) * (n2)+ c;
        ans+=(cp%bs) * p;
        c=cp/bs;
        p*=10;
        n1/=10;
    }
    return ans;
  }
}