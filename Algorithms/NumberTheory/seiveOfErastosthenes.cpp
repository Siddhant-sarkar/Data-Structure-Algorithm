#include"bits/stdc++.h"
using namespace std;

vector<int> ar;
vector<bool> check(10e2+1);

// This is the program to find all the prime number 
// which are less the n

//One optimizations can be done to signifigantly improve the time complexity 
// is to seive till square root n times.

void seive(int n){
	for(int i=2;i*i<=n;i++){
		if(i%2==0 && i!=2){
			check[i]=true;
			continue;
		}
		if(!check[i]){
			for(int j=i*i;j<=n;j+=i)
				check[j]=true;
		}
	}
	for(int i=8;i<=n;i++){
		if(check[i]==false){
			ar.push_back(i);
			cout<<i<<"\n";
		}
	}

} 

// This number computes the all the factors of the given 
// This computes the prime factorization of the number
void primeFactorize(int n){
	int s[100];
	for(int i=2;i<=n;i++) s[i]=i;

	for(int i=2;i*i<=n;i++){
		if(s[i]==i){
			for(int j=i*i;j<=n;j+=i ){
				if(s[j]==j){
					s[j]=i;
				}
			}
		}
	}
	while(n!=1){
		cout<<s[n]<<"   ";
		n/=s[n];
	}
}

int main(){
	int a;
	a=100;
	seive(90);
}