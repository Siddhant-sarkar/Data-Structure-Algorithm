#include"bits/stdc++.h"
using namespace std;

int main(){
	ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
	int n,b=1;
	cin>>n;
	if(n==2 || n==3){
		cout<<"NO SOLUTION\n";
		return 0;
	}
	// n++;
	vector<int> ar;
	while(b<=n){
		ar.push_back(b);
		b++;
	}
	stable_partition(ar.begin(),ar.end(),[](int n){ return n%2==0;});
	auto p=partition_point(ar.begin(),ar.end(),[](int n){ return n%2==1;});
	reverse(p,ar.end());
	reverse(ar.begin(),p);
	for(auto it: ar){
		cout<<it<<"    ";
	}
		
		
}