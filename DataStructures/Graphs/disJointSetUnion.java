import java.util.*;
public class disJointSetUnion{
	int parent[];
	int rank[];
	public static void main(String[] args) {
			// sometimes we jsut want to group similiar itmes in some subgroup
			// which just have some heirarcy 
			// which have a common leader
		// we use two functions : find() which finds the leader of the subgroup
		// union() we use the find function to find the leaders and the merge then according to the order

		// Path compression is just like a dp which is used to optimize the recursive find function.
		//	union by Rank : 
	}
	public static int find(int x){
		if(parent[x]==x) return x;
		int temp= find(parent[x]);
		parent[x]	=temp;
		return temp;
	}
	public static void union() {
		int lx = find(x);
		int ly = find(y);
		if(lx!=ly){
			if(rank[lx]<rank[ly]){
				parent[lx]=ly;
			}else if(rank[lx]>rank[ly]){
				parent[ly]=lx;
			}else{
				parent[ly]=lx;
				rank[lx]++;
			}
		}
	}
}