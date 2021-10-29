import java.util.*;
public class reconstructItetionary {
	public static void main(String[] args) {
	}
	class Solution {
		HashMap<String ,PriorityQueue<String>> graph;
		LinkedList<String> ans;
		public List<String> findItinerary(List<List<String>> strs){
			graph = new HashMap<>();
			ans = new LinkedList<>();
			for(List<String> str : strs){
				PriorityQueue<String>  pq = graph.getOrDefault(str.get(0),new PriorityQueue<>());
				pq.add(str.get(1));
				graph.put(str.get(0),pq);
			}
			dfs("JFK");
			return ans;
		}
		public void dfs(String src){
			PriorityQueue<String> pq = graph.get(src);
			while(pq!=NULL && pq.size()>0){
				String dest = pq.remove();
				dfs(dest);
			}
			ans.addFirst(src);
		}
	}
}
