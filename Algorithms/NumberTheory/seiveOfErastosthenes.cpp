#include"bits/stdc++.h"
using namespace std;

vector<int> ar;
vector<bool> check(10e2+1);

void seive(int n){
	for(int i=2;i<n;i++){
		if(check[i])continue;
		for(int j=i;j<n;j+=i){
			if(check[j]) continue;
			check[j]=true;
		}
	}

	for(auto it: check){
		cout<<it<<endl;
	}
	// for(int i=0;i<check.size();i++){
	// 	if(check[i]==false){
	// 		ar.push_back(i);
	// 		cout<<i<<"\n";
	// 	}

	// }

}
int main(){
	int a;
	a=100;
	seive(a);
}