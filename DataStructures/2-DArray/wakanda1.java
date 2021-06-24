import java.util.*;
public class wakanda1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [][]ar = new int[a][b];
        for( int i=0;i<a;i++) for(int j=0;j<b;j++) ar[i][j]=sc.nextInt();

        for( int i=0;i<b;i++){
            if(i%2==0){
                for( int j=0;j<a;j++) System.out.println(ar[j][i]);
            }else{
                for( int j=a-1;j>=0;j--) System.out.println(ar[j][i]);
            }
        }

    }
}