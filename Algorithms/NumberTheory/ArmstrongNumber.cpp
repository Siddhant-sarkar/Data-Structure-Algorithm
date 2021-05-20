#include"bits/stdc++.h"
using namespace std;

/*
	An armstrong number is a nubmer whose sum of 
	the individual constituting number is equal to 
	the number it self
	
	153= 1*1*1 + 5*5*5 + 3x3x3;
	idea is simple pick one by one each element and the compute
	the cube of that number and add it to the sum variable 
	and finally true if the sum is equal to the number intially given.

*/
bool isArmstrong(int n){
	int sum=0,c=n;
	while(n){
		int a=n%10;
		sum+= pow(a,3);
		n/=10;
	}
	return sum==c;
}
int main(){
	#ifndef ONLINE_JUDGE
	freopen("inputf.in", "r", stdin);
	freopen("outputf.in", "w", stdout);
	freopen("errorf.in", "w", stderr);
	#endif 
	cout<<boolalpha<<isArmstrong(1253);



	return 0;
}