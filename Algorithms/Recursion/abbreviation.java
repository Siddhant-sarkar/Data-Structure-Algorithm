import java.util.*;
public class abbreviation{

    public static void printAbb(String s,String a,int count ,int pos){
        if(pos==s.length()){
            if(count==0)System.out.println(a);
            else System.out.println(a+count);
            return;
        }
        if(count==0)printAbb(s,a+s.charAt(pos),0,pos+1);
        else printAbb(s,a+count+s.charAt(pos),0,pos+1);
        printAbb(s,a,count+1,pos+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String st="asdfasdf";
        // System.out.println(st.substring(2,4));
        printAbb(s,"",0,0);
        sc.close();
    }
}