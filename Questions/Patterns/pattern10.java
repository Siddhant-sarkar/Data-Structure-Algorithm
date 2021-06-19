import java.util.*;
public class pattern10{
    static void print(int sp,int st){
        for(int i=1;i<=sp;i++) System.out.print("\t");
        for(int i=1;i<=st;i++) {
            if(i==1 || i== st) System.out.print("*\t");
            else System.out.print("\t"); 
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n/2,st=1;

        for(int i =1 ;i<=n;i++){
            print(sp,st);
            if(i<=n/2){
                st+=2;
                sp--;
            }else{
                st-=2;
                sp++;
            }
            System.out.println();
        }
    }
}
