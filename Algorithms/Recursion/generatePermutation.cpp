#include"bits/stdc++.h"
using namespace std;
vector<vector<int>>subset;

/*	This method divides the string into two different 
	parts which further call the function for two parts
	ans subsequently adds the character at ith position
	to the second half of the splited string and then it appends the 
	character in the ans string.
*/
void generatePermutation(string s,string ans){
	if(s.length()==0){
		cout<<ans<<endl;
		return;
	}
	for(int i=0;i<(int)s.length();i++){
		generatePermutation(s.substr(0,i)+s.substr(i+1),ans+s[i]);
	}
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
void generatePermuation(vector<int>s,vector<bool>b,int n){
	if((int)s.size()==n){
		subset.push_back(s);
	}
	for(int i=1;i<=n;i++){
		if(b[i]) continue;
		b[i]=true;
		s.push_back(i);
		generatePermuation(s,b,n);
		b[i]=false;
		s.pop_back();
	}
}

/*
	We keep on swaping the number in array till
	the count equals the size of the given array then
	we realize that the permuation has been generated and the
	fucntion returns the call

	NOTE : THIS METHOD ONLY WORKS WHEN THE ARRAY DOSENT CONTAINS
	ANY DUPLICATE ELEMENTS
	
	solution is simple just use a map which will
	make sure that only one instance of the permutated number
	will be in the list
*/

void generatePermutation(vector<int>&ar,int n){
	if(n==(int)ar.size()){
		subset.push_back(ar);
		return ;
	}
	for(int i=n;i<(int)ar.size();i++){
		swap(ar[i],ar[n]);
		generatePermutation(ar,n+1);
		swap(ar[i],ar[n]);
	}
}
void generatePermutation(vector<vector<int>>&ans,vector<int>ar,int n){
	if(n==(int)ar.size()){
		ans.push_back(ar);
		return; 
	}
	for(int i=n;i<(int)ar.size();i++){
		if(i!=n and ar[i]==ar[n]) continue;
		swap(ar[i],ar[n]);
		generatePermutation(ans,ar,n+1);
	}
}
int main(){
	string s;
	cin>>s;
	vector<int>ar={1,2,3};
	generatePermutation(subset,ar,0);
	for(auto it:subset){
		for(auto iit: it)
			cout<<iit<<"	";
		cout<<endl;
	}
}