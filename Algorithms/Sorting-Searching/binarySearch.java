import java.util.*;
public class binarySearch{
	public static void main(String[] args) {
		int [] ar={1,2,3,4,5,6,7,8,9,10};
		int d=0;
		int l=0,h=ar.length-1;
		while(l<=h){
			int m=(l+h)/2;
			if(d>ar[m]){
				l=m+1;
			}else if(d<ar[m]){
				h=m-1;
			}else{
				System.out.println("data is found at :\t"+(++m));
				break;
			}
		}
	}
}