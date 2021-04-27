#include<bits/stdc++.h>
using namespace std;
void print(list<int>l){
	for(auto i:l) cout<<i<<"   ";
	cout<<endl;
}


int main(){
	list<int> v={1,2,3,4,5,6,7,8};
	list<int> vv={1,2,3,4,5,6,7,8};
	auto it =vv.insert(vv.begin(),999);
	cout<<*it<<endl;
	print(vv);

}