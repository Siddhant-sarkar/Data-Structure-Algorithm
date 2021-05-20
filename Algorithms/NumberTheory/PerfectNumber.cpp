#include"bits/stdc++.h"
using namespace std;
/*
	A perfect number is a number whose sum of factors 
	other than the number it self is equal to the number.
	6 =1+2+3.
	
	An optimized approach is that to loop till sqrt(n)
	add i and n/i simulatneously and after the looop ends
	check if the sum == the number.
*/
bool isPerfectNumber(int n){
	int sum=0;
	for(int i=1;i<=sqrt(n);i++){
		if(n%i==0)
			sum+=i+n/i;
	}
	sum-=n;
	return sum==n;
}
int main(){
	#ifndef ONLINE_JUDGE
	freopen("inputf.in", "r", stdin);
	freopen("outputf.in", "w", stdout);
	freopen("errorf.in", "w", stderr);
	#endif 
	cout<<std::boolalpha<<isPerfectNumber();



	return 0;
}