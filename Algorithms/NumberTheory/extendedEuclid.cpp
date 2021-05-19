#include "bits/stdc++.h"
using namespace std;

/*
if there are two numbers a,b then it can represented in the form of 
a.X+b.Y=gcd(a,b)
them main motif of this algorithm is to determine
the coefficients of X,Y for which the equation will hold true
*/

//this is the recursive approach 
int gcdExtendedRec(int a,int b, int &x,int &y){
	if(b==0){
		x=1;
		y=0;
		return a; 
	}
	int x1,y1;
	int d=gcdExtendedRec(b,a%b,x1,y1);
	x=y1;
	y=x1-y1*(a/b);
	return d;
}
//this is the non-recursive approach 
// int gcd
int gcdExtended(int a,int b,int& x,int& y){
	x=1,y=0;
	int x1=0,y1=1,a1=a,b1=b; 
	while(b1){
		int q=a1/b1;
		tie(x,x1)=make_tuple(x1,x- q * x1);
		tie(y,y1)=make_tuple(y1,y- q * y1);
		tie(a1,b1)=make_tuple(b1,a1- q * b1);
	}
	return a1;
}


int main(){
	int x,y;
	int a=4,b=10;
	// gcdExtended(4,10,x,y);
	cout<<"The gcd of the two numbers   "<<gcdExtended(a,b,x,y)<<"\n";
	cout<<x<<"   "<<y<<endl;
}