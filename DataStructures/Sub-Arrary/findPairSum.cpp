#include "bits/stdc++.h"
using namespace std;

pair<int,int> pairSum(vector<int>ar,int s){
	int st=0,en=(int)ar.size()-1;
	while(st<en){
		if(ar[st]+ar[en]<s)
			st++;
		else if(ar[st]+ar[en]>s)
			en--;
		else
			return make_pair(st+1,en+1);
	}
	return make_pair(-1,-1);
}
int main(){
	vector<int>ar={1,2,3,4,5,6,7,8,9,10,11};
	cout<<pairSum(ar,16).first<<"   "<<pairSum(ar,16).second<<endl;
}