#include<bits/stdc++.h>
using namespace std;

void print(multiset<int> s){
	for(auto i:s) cout<<i<<"   ";
	cout<<endl;
}
void print(multiset<int,greater<int>> s){
	for(auto i:s) cout<<i<<"   ";
	cout<<endl;
}


int main(){
	multiset<int> s={1,2,3,4,5,6};
	//----THIS IS THE multiset WHCIH STORES THE ELEMENT IN THE REVERSED ORDER------w//
	multiset<int,greater<int>>rev={1,2,3,4,5};
	
	print(rev);
	/**
	 * ITERATORS
	 * begin() end()
	 * rbegin() rend()
	 *
	 * cbegin() cend()
	 * crbegin() crend()
	 * 
	 */
	auto it=s.begin();
	cout<<"the first element of the multiset is "<<*it<<endl;
	
	/**
	 * SIZE as ACESS
	 * size() returns the size of the multiset
	 * nax_size() returns the maxuimum number of elements that the list can hold
	 * empty() returns true if the multiset is empty or not
	 *
	 * find() return the iterator to the found_element or returns the last element
	 * 
	 * count(int n) return the number of occuences of the passed element
	 * 
	 * lower_bound(int n) returns the iterator to the element that equals n or will definately
	 * lower than N.
	 * upper_bound(int n) returns the iterator that will goo after n --NOT EQUAL--
	 * 
	 */
	s.find(3)!=s.end()?cout<<"found the element"<<endl:cout<<"the element is not found"<<endl;

	
	/** 
	 * REMOVAL
	 * clear() removes all the element from the array
	 * erase(const o)
	 * erase(pos_start,pos_end)
	 * 
	 */
	multiset<int> ss=s;
	s.clear();
	s.empty()?cout<<"The multiset is empty\n":cout<<"The multiset is not empty\n";
	ss.erase(ss.find(3),ss.find(5));
	print(ss);

	
	/**
	 * MODIFIER
	 * -----NOTE THAT THE ORDER OF INSERTION DOES NOT MATTER------
	 * -----IT WILL ALWAYS BE IN INCREASING ORDER--------
	 * -----NO DUPLILCATES OF THE ELEMENTS WILL BE ADDED------
	 * insert(g) 
	 * insert(pos_it,int number); here the pos_it defines the positition from which the search to insert must start
	 * insert(it_start,it_end()); it is used to insert from other containers.
	 * 
	 * emplace(int n) add to the multiset if the element is not already present in the multiset
	 * emplace_hint() add the iterator to the inserted element if already present than 
	 * an iterator to that element is returned
	 * 
	 * swap() it swaps the two multisets....
	 */
	s.insert(1);
	s.insert(2);
	s.insert(3);
	s.insert(4);
	s.insert(5);
	print(s);
	s.insert(ss.begin(),ss.end());
	s.insert(s.begin(),99);
	s.insert(2);
	print(s);
	/**
	 * DIFFRENT 
	 * equal_range(int n) : returns the iterator to the pair of 
	 * if the n is the range then then lower is the number itself the upper is the number after it
	 *
	 *	if n is smaller than the number then both point to 0
	 *	if n is greater than the number then it points to the last element of the multiset.
	 *
	 *
	 * pair(lower_bound(int n),upper_bound(int nw))
	 */
	auto temp=s.equal_range(3);
	cout<<*temp.first<<endl;
	cout<<*temp.second<<endl;

	temp=s.equal_range(10);
	cout<<*temp.first<<endl;
	cout<<*temp.second<<endl;

	temp=s.equal_range(0);
	cout<<*temp.first<<endl;
	cout<<*temp.second<<endl;





	return 0;
}
