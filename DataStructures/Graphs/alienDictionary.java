import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class alienDictionary {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] words = br.readLine().split(" ");
    System.out.println(alienOrder(words));
  }

  public static String alienOrder(String[] words) {
    HashMap<Character,HashSet<Character>> map = new HashMap<>();
    HashMap<Character,Integer> indegree = new HashMap<>();

    for(String s: words){
      for(char ch : s.toCharArray()){
        indegree.put(ch,0);
      }
    }
    boolean flag=false;
    for(int i=0;i<words.length-1;i++) {
      String curr=words[i];
      String next=words[i+1];
      for(int j=0;j<Math.min(curr.length(),next.length());j++){
	      char cc=curr.charAt(j);
	      char nc=next.charAt(j);
	      if(cc!=nc){
	        HashSet<Character>  set = new HashSet<>();
	        if(map.containsKey(cc)){
	          set=map.get(cc);
	          if(set.contains(nc)==false){
	            set.add(nc);
	            indegree.put(nc,indegree.get(nc)+1);
	            map.put(cc,set);
	          }
	        }else{
	          set.add(nc);
	          indegree.put(nc,indegree.get(nc)+1); 
	          map.put(cc,set);
	        }
	        flag=true;
	        break; 
	      }
      }
    }
    if(flag==false) return "";
   	Queue<Character> qu = new LinkedList<>(); 
   	String ans ="";
    for(char c:indegree.keySet()){
    	if(indegree.get(c)==0){
    		qu.add(c);
    	}
    }
   	while(qu.size()!=0){
   		char rem= qu.remove();
   		ans+=rem;
   		if(map.containsKey(rem)){
   			HashSet<Character> nbr = map.get(rem);
   			for(char nbrs : nbr){
   				indegree.put(nbrs,indegree.get(nbrs)-1);
   				if(indegree.get(nbrs)==0){
   					qu.add(nbrs);
   				}
   			}
   		}
   	}
   	if(ans.length()==indegree.size()){
   		return ans;
   	}else return "";
  }
}
