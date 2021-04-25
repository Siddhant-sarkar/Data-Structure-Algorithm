#include<bits/stdc++.h>
using namespace std;

void print(deque<int> n){
	for(auto &i : n) cout<<i<<"   ";
	cout<<endl;
}

int main(){
	/**
	 * ITERATORS
	 * 
	 * begin() end()
	 * rbegin() redn()
	 * crbegin() cend()
	 * cbegin() cend()
	 */
	deque<int>i={1,2,3,4,5,6,7,8,9,10};
	deque<int>ii={1,2,3,4,5,6,7,8,9,10};
	auto it=i.begin();

	/**
	 * MODIFIERS
	 * 
	 * THE INSERT FUNCTION RETURN THE ITERATOR TO THE ELEMENT TO THE 
	 * FIRST ELEMENT OF THE	NEWLY ADDED ELEMENTS
	 * insert(pos_it,int val)||insert(pos_it,int count,int val) ||insert(pos_it,it_to_otherStart,it_toOtherEnd)
	 * 
	 * assign(int count,int val) ||assign(it_OtherStart,it_OtherEnd)
	 *
	 * push_back() push_front()
	 * emplace_front() emplace_back()
	 * pop_back() pop_front()
	 *
	 * clear() removes the entire array
	 * erase(pos_Start,pos_End())
	 */
	i.assign(ii.begin(),ii.end());			// REMEMBER THAT THE ASSIGN OVERWRITES THE ARRAY
	print(i);
	cout<<*iit<<endl;

	/**
	 * SIZE
	 * 
	 * max_size()
	 * size()
	 * resize()
	 * empty() returns true if the deque is empty or not
	 * swap()  it swaps the deque with the other deque
	 */

	/**
	 * ACCESS 
	 * .at() || list<int>[i]
	 * front()  back()
	 */
	


}