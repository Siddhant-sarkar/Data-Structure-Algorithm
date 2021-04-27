#include<bits/stdc++.h>
using namespace std;


int main(){
	//this is the standard declaration method for pairs
	pair<int,string> p1 = {1,"HEllO"};
	//diffrent ways
	pair p2 (1,3);
	pair p3 (2,"World");
	pair p4 (p3);


	cout<<p1.first<<" "<<p1.second<<endl;
	cout<<p2.first<<" "<<p2.second<<endl;
	cout<<p3.first<<" "<<p3.second<<endl;
	cout<<p4.first<<" "<<p4.second<<endl;

	/**
	 * MEMBER METHODS
	 *
	 * make_pairs()
	 * swap()
	 *
	 * and all the == != >= and <= work in the same way
	 */
	p1==p2?cout<<"Equal\n":cout<<"Not equal\n";


	return 0;
}