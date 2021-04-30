#include"bits/stdc++.h"
using namespace std;

int main(){
	deque<int> i={1,2,3,4,5,6,7};
	i.push_back(i.front());
	i.pop_front();
	for(auto a: i) cout<<a<<endl;
		cout<<"+++++++++++++++++++++++"<<endl;
	for(auto a: i) cout<<a<<endl;
	cout<<"Hello\n";


}