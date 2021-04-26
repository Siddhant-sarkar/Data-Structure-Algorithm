#include<bits/stdc++.h>
using namespace std;

void print(forward_list<int> l){
	for(auto i : l){
		cout<<i<< "   " ;
	}
	cout<<endl;
}


int main(){
	forward_list<int>l={1,2,3,4,5,6,7,8,9};
	print(l);
	/**
	 * ITERATORS
	 *
	 * begin() end()
	 * cbegin() cend()
	 * befor_begin() cbefore_begin()
	 * 
	 */
	l.insert_after(l.before_begin(),999);
	print(l);

	/**
	 * ACCESSING & SIZE
	 *
	 * .at() or [i]
	 * max_size()  resize()
	 * 
	 */
	
	/**
	 * ASSIGNING 
	 *
	 * assign()
	 * push_front() pop_front()
	 * emplace_front()
	 *
	 * insert_after() emplace_after()
	 *   
	 */
	
	l.insert_after(next(l.begin(),3),101);
	print(l);   


	/**
	 * REMOVAL
	 *
	 * clear() this clears the list
	 * erase_after()  this only deletes the single number
	 * erase() this delets in the whole range
	 * remove() and remove_if(LAMBDA EXPRESSION)
	 * 
	 */
	forward_list<int>ll={1,2,3,4,5,5,5,5,6,7,8};
	ll.remove(5);
	print(ll);

	/**
	 * MODIFYING 
	 * merge() this merges the two forward lists
	 * if the lists are sorted then the merges list will also be sorted
	 *
	 * sort()
	 * unique() removes the duplicated items in the forward list
	 * reverse()
	 * swap()
	 * clear()
	 * empty() This returns true if the list is empty or false otherwise
	 * 
	 */

	return 0;
}