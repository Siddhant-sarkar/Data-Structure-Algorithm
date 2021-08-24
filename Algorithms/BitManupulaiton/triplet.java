import java.io.*;
import java.util.*;

public class triplet{

	public static void solution(int[] arr){
		int counter=0;
		for(int i=0;i<arr.length;i++){
			int k=arr[i];
			for(int j=i+1;j<arr.length;j++){
				k^=arr[j];
				if(k==0) counter+=(j-i);
			}
		}
		System.out.println(counter);
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
	
	
}