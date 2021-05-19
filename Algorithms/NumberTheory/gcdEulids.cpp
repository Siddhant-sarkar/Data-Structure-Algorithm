#include"bits/stdc++.h"
using namespace std;

//This is the non-recursive implementation of the 
// euclids gcd algorithm
int findGcd(int a,int b){
	if(!b)
		return a;
	return findGcd(b,a%b);
}
//This is the recursive implementation of the 
// euclids gcd algorithm
int findGcdRec(int a,int b){
	while(b){
		a%=b;
		swap(a,b);
	}
	return a;
}

//If both numbers are even, then we can factor out a two of both and compute the GCD of the remaining numbers: gcd(2a,2b)=2gcd(a,b).

//If one of the numbers is even and the other one is odd, then we can remove the factor 2 from the even one: gcd(2a,b)=gcd(a,b) if b is odd.

//If both numbers are odd, then subtracting one number of the other one will not change the GCD: gcd(a,b)=gcd(b,a−b)
int main(){
	cout<<gcd(4,10);
	// cout<<findGcdRec(4,10)<<endl;
}