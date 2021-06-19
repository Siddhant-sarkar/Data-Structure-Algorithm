import java.util.*;
public class pattern6{
    static void print(int sp,int st){
        for(int i=1;i<=st;i++) System.out.print("*\t");
        for(int i=1;i<=sp;i++) System.out.print("\t");
        for(int i=1;i<=st;i++) System.out.print("*\t");

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=1,st=(n/2)+1;
        for(int i =1;i<=n;i++){
            print(sp,st);
            if(i<=(n/2)){
                st--;
                sp+=2;
            }else{
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
