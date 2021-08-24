import java.io.*;
import java.util.*;

public class abbreviation {

    public static void solution(String str){
        for(int i=0;i<1<<str.length();i++){
            int counter=0;
            String ans="";
            for(int j=0;j<str.length();j++){
                if((i&1<<j)!=0) counter++;
                else{
                    if(counter==0) ans=str.charAt(str.length()-1-j)+""+ans;
                    else ans=str.charAt(str.length()-1-j)+""+counter+ans;
                    counter=0;
                }

            }
            if(counter!=0) ans=counter+ans;
            System.out.println(ans);
        }

    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str);
    }
    
    
}