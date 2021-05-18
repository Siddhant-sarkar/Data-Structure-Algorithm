#include"bits/stdc++.h"
using namespace std;

vector<vector<int>> ar(10);

int findNumberOfDivisors(int n){
	int t=0;
	for(int i=1;i<=sqrt(n);i++){
	    if(n%i==0){
            if(n/i==i){
                t++;
                cout<<i<<"\n";
            }else{
                t+=2;
                cout<<i<<"  "<<n/i<<"\n";
            }
        }
	}
	return t;
}
void findFactors(int n){
	for(int i=1;i<n;i++){
		for(int j=i;j<n;j+=i){
			(ar[j]).push_back(i);
		}
	}
}
int main(){
	findFactors(10);
	for(auto it:ar){
		for(auto iit:it)
			cout<<iit<<"   ";
		cout<<endl;
	}
	cout<<endl;
	return 0;
}