import java.util.*;
 
 public class greycode {
 
     public static List<Integer> grayCode(int n) {
       if(n==1) {
        List<Integer> li= new ArrayList<>();
        li.add(0);
        li.add(1);
        return li;
       }
       List<Integer> li=grayCode(n-1);
       // System.out.println(li);
       List<Integer> nl=new ArrayList<>();
       for(int i=0;i<li.size();i++){
        nl.add(li.get(i));
       }
       for(int i=li.size()-1;i>=0;i--){
        nl.add(li.get(i)+(1<<(n-1)));
       }
       return nl;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         List<Integer> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }