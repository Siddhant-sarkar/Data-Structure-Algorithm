class Solution {
public:
    class unionfind{
        int *parent;
        int *size;
        public:
        unionfind(int n){
            parent= new int[n+1];
            size= new int[n+1];
            for(int i=0;i<=n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int a){
            if(a!=parent[a]){
                parent[a]=find(parent[a]);
            }
            return parent[a];
        }
        bool unionop(int a,int b){
            int x=find(a);
            int y=find(b);
            if(x==y){
                return false;
            }
            if(size[x]>size[y]){
                parent[y]=x;
                size[x]+=size[y];
            }else{
                parent[x]=y;
                size[y]+=size[x];
            }
            return true;
        }
    };
    vector<int> findRedundantDirectedConnection(vector<vector<int>>& edges) {
        int n=edges.size();
        unionfind ob(n);
        int bl1=-1;
        int bl2=-1;
        vector<int>indegree(n+1,-1);
        for(int i=0;i<n;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(indegree[v]==-1){
                indegree[v]=i;
            }else{
                bl1=i;
                bl2=indegree[v];
                break;
            }
        }
        //  Now traversing again to check which case it is
        //so we traverse again and we would skip previous potential expected answer
        //we check if cycle is still present that means our potential answer is wrong
        //so our answer would be second bl2;
        //now there may be possibility that indegree found to be -1 that means there is cycle 
        //only so our answer would be the current indexed row 
        //otherwise answer would be among the bl1 and bl2
        for(int i=0;i<n;i++){
            if(i==bl1){
                continue;
            }
            int u=edges[i][0];
            int v=edges[i][1];
            bool flag=ob.unionop(u,v);
            if(flag==false){
			//case 2 -> When there is only cycle is present(All nodes have indegree 1 )
                if(bl1==-1){
                    return edges[i];
                }else{
					// Case 3: like there is cycle and also a single node have more than one parent and thats why its indegree is more than one
                    return edges[bl2];
                }
            }
        }
		//final case that means our potential answer is our answer and after removing that there is no cycle
        return edges[bl1];
    }
};