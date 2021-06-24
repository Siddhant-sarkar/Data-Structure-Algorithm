    
import java.util.*;

public class barChart{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),max=-99;
    int []ar =new int[n];
    for(int i=0;i<n;i++) {
        ar[i]=sc.nextInt();
        max=Math.max(max,ar[i]);
    }
    int []sp = new int [n];
    for(int i=0;i<n;i++){
        sp[i]=max-ar[i];
    }
    for(int i=0;i<max;i++){
        for(int j=0;j<n;j++){
            if(sp[j]!=0){
                System.out.print("\t");
                sp[j]--;
            }else{
                System.out.print("*\t");
                ar[j]--;
            }
        }
        System.out.println();
    }
    sc.close();
 }

}