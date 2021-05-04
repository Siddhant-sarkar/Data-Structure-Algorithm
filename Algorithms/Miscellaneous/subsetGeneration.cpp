#include "bits/stdc++.h"
using namespace std;

vector<vector<int>>subset;
vector<int> s;
vector<bool> b={0,0,0,0};


/**
 * this fumction generates the subsets 
 * this function calls its self recursively
 * till it reached the nubmer n+1 where it gets 
 * terminated
 * 
 * @param k start of the element eg 0
 * @param n the maximum of the element eg 3 which is included
 */

void generateSubset(int k,int n){
	if(k==n+1){
		subset.push_back(s);
		return;
	}
	s.push_back(k);
	generateSubset(k+1,n);
	s.pop_back();
	generateSubset(k+1,n);
}


/**
 * this function generates all the permuatations of the 
 * numbers we use a bool vector which will tell if the numbers has been 
 * included in the permutation or not 
 * till the size of permutaion is equal the required size of the set
 * then we terminate the program there by removing all the trued value again to false
 *
 * 	
 * @param b this is the boolean array which is all false by default
 * @param n it is the required number till the end.
 */
void generatePermuation(vector<bool>b,int n){
	if((int)s.size()==n){
		subset.push_back(s);
	}
	for(int i=1;i<=n;i++){
		if(b[i]) continue;
		b[i]=true;
		s.push_back(i);
		generatePermuation(b,n);
		b[i]=false;
		s.pop_back();
	}
}

int main(){
	int n=3;
	generatePermuation(b,3);
	for(auto it:subset){
		for(auto iit:it){
			cout<<iit;
		}
		cout<<"\n";
	}
	cout<<"\n";
}