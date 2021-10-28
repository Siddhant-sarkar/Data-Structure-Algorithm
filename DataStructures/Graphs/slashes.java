import java.util.*;
class Solution {
    int par[];
    int rank[];
    public class Pair{
        int x;int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public String toString(){
            return this.x+" "+this.y;
        }
    }
    public int regionsBySlashes(String[] grid) {
        int ans=1;
        int len=grid.length;int llen=len+1;
        par= new int[llen*llen];
        rank= new int[llen*llen];
        for(int i=0;i<llen;i++){
            for(int j=0;j<llen;j++){
                int s= i*llen+j;
                par[s]=s;
                rank[s]=1;
            }
        }
        ArrayList<Pair> tf = new ArrayList<>();
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++){
                char c = grid[i].charAt(j);
                int k=0;int l=0; 
                if(c==' ') continue;
                if(c=='/'){
                    k=(i+1)*llen+j;l=i*llen+j+1;
                    tf.add(new Pair(k,l));
                }else{
                    k=i*llen+j;l=(i+1)*llen+j+1;
                    tf.add(new Pair(k,l));
                }
            }
        }

        int b1=0,b2=1;
        for(int i=0;i<len;i++,b1++,b2++){
            union(b1,b2);
        }
        b1--;b2--;
        b1=b2;b2+=llen;
        for(int i=0;i<len;i++,b1+=llen,b2+=llen){
            union(b1,b2);
        }

        b1=0;b2=llen;
        for(int i=0;i<len;i++,b1+=llen,b2+=llen){
            union(b1,b2);
        }
        b1-=llen;b2-=llen;
        b1=b2;b2=b1+1;
        for(int i=0;i<len;i++,b1++,b2++){
            union(b1,b2);
        }
        for(Pair p: tf){
            if(!union(p.x,p.y)) ans++;
        }
        return ans;
    }
    public boolean union(int x,int y){
        //System.out.println(x+" "+y);
        int lx=find(x);
        int ly=find(y);

        if(lx!=ly){
            if(rank[lx]>rank[ly]){
                par[ly]=lx;
            }else if(rank[lx] < rank[ly]){
                par[lx]=ly;
            }else{
                par[lx]=ly;
                rank[ly]++;
            }
            return true;
        }
        return false;
    }
    public int find(int x){
       if(par[x]==x)  return x;
       int temp= find(par[x]);
       par[x]=temp;
       return temp;
    }
}
public class slashes{
    public static void main(String[] args) {
    }
}