#include<bits/stdc++.h>
using namespace std;
void print(list<int>l){
	for(auto i:l) cout<<i<<"   ";
	cout<<endl;
}

int main(){
	list<int> l={1,2,3,4,5};
	list<int> ll=l;
	l.merge(ll);
	print(l);
}