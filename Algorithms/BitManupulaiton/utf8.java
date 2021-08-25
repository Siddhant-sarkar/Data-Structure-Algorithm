import java.io.*;
import java.util.*;

public class utf8 {

    public static boolean solution(int[] arr) {
        int r=0;
        for(int val:arr){
            if(r==0){
                if((val>>7)==0b0){
                    r=0;
                }else if((val>>5)==0b110){
                    r=1;
                }else if((val>>4)==0b1110){
                    r=2;
                }else if((val>>3)==0b11110){
                    r=3;
                }
            }else{
               if((val>>6)==0b10)r--;
               else return false;
            }

        }
        if(r!=0) return false;
        return true;
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
    
    
}