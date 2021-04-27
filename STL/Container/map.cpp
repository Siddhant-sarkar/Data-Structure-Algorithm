#include<bits/stdc++.h>
using namespace std;

void print(map<int,int>m){
	for(auto i :m){
		cout<<i.first<< "     "<<i.second<<endl;
	}
	cout<<endl;
}


int main(){
	map<int,string> m;
	m.insert(make_pair(1,"Hello world"));
	// print(m);
	map<int,int> mm;

	/**
	 * ITERATORS
	 * 
	 * begin() end()
	 * rbegin() rend()
	 * cbegin() cend()
	 * crbegin() crend()
	 * 
	 */
	
	/**
	 * SIZE as ACESS
	 * 
	 * empty() ?
	 * size()
	 * max_size()
	 * 
	 */
	cout<<m.size()<<endl;

	
	/**
	 * MODIFIER
	 * insert() ||int value||it_pos,value||it_start,it_end||initializer list
	 * erase()  ||int value||it_pos|| it_start it_end
	 * swap() this swaps the two maps
	 * clear() this clears the entire map
	 * emplace() constructs the new object and places it in the map
	 * emplace_hint(it stat,int val) it starts to check from the given position not from the begining
	 * 
	 */
	m.erase(m.begin());
	m.empty()?cout<<"the map is empty now\n":cout<<"The map is not empty\n";

	mm.insert(pair<int, int>(1, 40));
    mm.insert(pair<int, int>(2, 30));
    mm.insert(pair<int, int>(3, 60));
    mm.insert(pair<int, int>(4, 20));
    mm.insert(pair<int, int>(5, 50));
    mm.insert(pair<int, int>(6, 50));
    mm.insert(pair<int, int>(7, 10));
    print(mm);

    auto it=mm.equal_range(4);
    cout<<it.first->second<<"	"<<it.second->first<<endl;
    mm.erase(find(2),find())
	
	 /**
	  * OPERATIONs
	  * find() finds and returs the iterator to the found element or to the last otherwise
	  * count() return 1 if the element is in the list or 0 otherwise
	  * lower_bound() upper_bound()
	  * equal_range() __----THIS RETURNS THE PAIR OF PAIRS WHICH CONTAINS THEIR RESPECTIVE KEY_VALUES----__
	  */
}