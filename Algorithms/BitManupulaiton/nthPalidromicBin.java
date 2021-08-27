import java.io.*;
import java.util.*;

public class nthPalidromicBin {
    public static int getReverse(int n){
        int r=0;
        while(n!=0){
            r|=(n&1);
             n>>=1;
             r<<=1;
        }
        r>>=1;
        return r;
    }
    public static int nThPalindormic(int n){
        int count=0;
        int l=0;
        while(count<n){
            l++;
            count+=(1<<((l-1)/2));
        }
        count-=(1<<((l-1)/2));
        int of=n-count-1;
        int ans=1<<(l-1); 
        ans|= of<<(l/2);
        int rev=getReverse(ans>>l/2);
        ans|=rev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        // for(int i=1;i<=30;i++) nThPalindormic(i);
        System.out.println(nThPalindormic(n));
    }
    
}