#include<bits/stdc++.h>
using namespace std;

void print(unordered_map<int>n){
	if(n.empty()){
		cout<<"the map is empty\n";
		return;
	}
	for(auto i : n){
		cout<<i<<"	";
	}
	cout<<endl;
}
int main(){
	unordered_map<int> n ={6,4,7,8,2,7,8,2,2,4};

	/**
	 * ITERATORS
	 * begin() end()
	 * cbegin() cend()
	 * 
	 */
	auto it=n.begin();
	auto iit=n.end();
	print(n);

	/**
	 * SIZE
	 * size() this returns the size of the unordered_map
	 * empty() return true if the unordered_map is empty or false otherwise
	 * max_size() returns the max size of the unordered_map
	 */
	cout<<n.size()<<endl;

	/**
	 * ELEMENT LOOK UP
	 * find(int val) it will return an iterator if the key is found else return the iterator to the last element of the umap
	 * 
	 * count(int val) since it is an unordered map it will return true if the element is present in the map or not
	 * 
	 * equal_range(range) this will return an iterator to the pair with first :as lower bound	to that element of the given
	 * 																	second: as uppper bound 
	 */
	n.find(2)==n.end()?cout<<"the 2 is not in the unordered_map\n":cout<<"the 2 is in the unordered_map\n";
	auto nit=n.equal_range(2);
	cout<<*nit.first<<"		"<<*nit.second<<endl;

	/** 
	 * MODIFIERS
	 * insert() |int val| |it_pos,int val| |it_begin,it_end| (it_pos is NOT the position to be inserted to it is the position to start search from)
	 * this return the pair first: iterator<key,value> second is the bool value
	 * 
	 * 
	 * emplace() emplace_hint() it creates an object rather than passing the given object
	 * it return the pair which contains first:the iterator(pair<key,value>)  second :bool if it was already present in it
	 *
	 * erase() |int val| |it_pos| |it_start ,it_end|
	 * 
	 * clear() clears the whole unordered_list
	 * 
	 * swap() they are used to swap the whole two unorderd list
	 * 
	 */
	auto a=n.insert(5);
	print(n);
	!a.second?cout<<"5 was already in the unordered map\n":cout<<"5 was not already in the list\n";
	auto b=n.emplace(5);
	print(n);
	!b.second?cout<<"5 was already in the unordered map\n":cout<<"5 was not already in the list\n";

	/**
	 * ----these are only unique to the unorderd map -----
	 * bucket_couunt() returns the number of buckets used in the list
	 * max_bucket_count() returns the maximum number of bucket count
	 * bucket_size() returns the bucket size.
	 * bucket() returns the bucket size
	 * 
	 */
	cout<<"The bucket_count "<<n.bucket_count()<<endl;
	cout<<"The maximum bucket count "<<n.max_bucket_count()<<endl;
	cout<<"The bucket size is "<<n.bucket_size(5)<<endl;
	cout<<n.bucket(6)<<endl;

	/**
	 * load_factor() it returns the load factor [load factor =size/bucket_count]
	 * load_factor(int n) maps the new load factor for the given program
	 * 
	 * rehash(int n) it is used to  map the bucket count in a unordered map
	 *
	 * map_max_load_count() this is the maximum load count mapter fucntion
	 */

	

	return 0;
}