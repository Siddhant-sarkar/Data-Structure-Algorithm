#include<iostream>
#include<vector>
using namespace std;

long long minCost(vector<long long>r,vector<long long>b,vector<long long>g){
	long long pr=r[0];
	long long pb=b[0];
	long long pg=g[0];

	for(int i=1;i<r.size();i++){
		long long nr=r[i]+min(pb,pg);
		long long nb=b[i]+min(pg,pr);
		long long ng=g[i]+min(pb,pr);
		pr=nr;
		pb=nb;
		pg=ng;
	}
	return min(pr,min(pg,pb));
}
int main(){
	long long n;cin>>n;
	vector<long long>r(n);
	vector<long long>b(n);
	vector<long long>g(n);

	for(int i=0;i<n;i++){
		cin>>r[i];
		cin>>b[i];
		cin>>g[i];
	}
	
	// minCost(r,b,g);
	cout<<minCost(r,b,g)<<endl;
	return 0;
}