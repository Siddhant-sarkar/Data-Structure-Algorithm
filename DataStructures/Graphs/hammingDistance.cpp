#include"bits/stdc++.h"
using namespace std;
class DSU{
private:
public:
	vector<int> par,size;
	DSU(int n){
		par.resize(n); size.resize(n);
		for(int i=0;i<n;i++){
			par[i]=i; size[i]=1;
		}
	}
	bool unite(int lx,int ly){
		int x=find(lx); int y=find(ly);
		if(x!=y){
			if(size[x]<size[y]) swap(x,y);
			par[y]=x; 
			size[x]+=size[y];
			return true;
		}
		return false;
	}
	int find(int x){
		if(par[x] ==x)	return x;
		return par[x]= find(par[x]);
	}

};
class Solution {
public:
    int minimumHammingDistance(vector<int>& source, vector<int>& target, vector<vector<int>>& allowedSwaps) {
    	int n = source.size();
    	DSU d = DSU(n);
    	int count=0;
    	for(auto swp : allowedSwaps){
    		d.unite(swp[0],swp[1]);
    	}
    	map<int,map<int,int>> sets;
    	for(int i=0;i<(int)source.size();i++){
    		sets[d.find(i)][source[i]]++;
    	}
    	for(int i=0;i<(int)source.size();i++){
    		sets[d.find(i)][target[i]]--;
    	}
    	int a=0;
    	for(auto [_,mp]: sets){
    		for(auto [_,k] : mp){
    			a+=abs(k);
    		}
    	}
    	return a/2;
    }

};
int main(){
	cout<<"We did it Houston\n";
	return 0;
}