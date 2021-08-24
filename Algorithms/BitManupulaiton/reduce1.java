import java.io.*;
import java.util.*;

public class reduce1 {
	static int count=Integer.MAX_VALUE;
    public static int solution(int n) {
    	int counter=0;
    	while(n!=1){
    		if(n%2==0){
    			n/=2;
    		}else{
    			int r=n%4;	
    			if(r==1){
    				n--;
    			}else {
    				n++;
    			}
    		}
			counter++;
    	}
    	return counter;
    }
    public static void findCount(int n,int i){
    	if(n==1){
    		if(i<count) count=i;
    		return;
    	}
    	if(n%2==0){
    		findCount(n/2,i+1);
    	}else{
    		findCount(n+1,i+1);
    		findCount(n-1,i+1);
    	}
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(solution(n));
    }
	
	
}