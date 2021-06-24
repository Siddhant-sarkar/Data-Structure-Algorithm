import java.util.*;

public class subarray{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar= new int[n];
    for(int i=0;i<n;i++) ar[i]=sc.nextInt();
     for( int i=0;i<n;i++){
        for( int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print(ar[k]+"\t");
            }
            System.out.println();
        }
    }
    sc.close();
 }

}