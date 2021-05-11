#include "bits/stdc++.h"
using namespace std;

int addTwoBinaryNumber(int a,int b){
	int ans=0;	
	int pcarry=0;
	while(a>0&& b>0){
		if(a%2==0 && b%2==0){
			ans= ans*10+pcarry;
			pcarry=0;	
		}
		else if(a%2==1&& b%2==0 ||a%2==0 && b%2==1){
			if(pcarry==1){
				ans=ans*10+0;
				pcarry=1;
			}else{
				ans=ans*10+1;
				pcarry=0;
			}
		}
		//this means that the both the unit digits are equal to one
		else{
			ans=ans*10+pcarry;
			pcarry=1;
		}
		a/=10;
		b/=10;
	}
	while(a>0){
		if(pcarry==1){
			if(a%2==1)	{
				ans=ans*10+0;
				pcarry=1;
			}
			else{
				ans=ans*10+1;
				pcarry=0;
			}
		}else{
			ans= ans*10 +(a%2);
			pcarry=0;
		}
		a/=10;
	}
	while(b>0){
		if(pcarry==1){
			if(b%2==1)	{
				ans=ans*10+0;
				pcarry=1;
			}
			else{
				ans=ans*10+1;
				pcarry=0;
			}
		}else{
			ans= ans*10 +(b%2);
			pcarry=0;
		}
		b/=10;
	}
	return ans;
}
int main(){
	int a=5,b=8;
	cout<<"HEllo World\n"<<endl;
	cout<<addTwoBinaryNumber(a,b)<<endl;
	return 0;
}