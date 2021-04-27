#include<bits/stdc++.h>
using namespace std;

int main(){
	string s="This is Siddhant Sarkar";
	/**
	 * ITERATORS
	 *
	 * begin() end()
	 * rbegin() rend()
	 * cbegin() cend()
	 * crbegin() crend()
	 * 
	 */
	cout<<"its all become so redundant for me such that I am pretty boared as of now to redeclare the iterators "<<
	"if you wish so you can clone this repository and do that"<<endl;
	/**
	 * CAPACITY 
	 * size() returns the size of the string
	 * length() returns the length of the string
	 * max_size() returns the length of the string that it can hold
	 * capacity() returns the storage allocated to the string
	 * reserve() can be used to change the capacity of the string
	 * clear() is used to clear the string 
	 * empty() it is the ususal function which returns if the string is empty or not.
	 * shrink_to_fit() 
	 */
	cout<<"The length of the string is "<<s.length()<<endl;
	cout<<"the max_size of the string is "<<s.max_size()<<endl;
	cout<<"the capacity of the string is "<<s.capacity()<<endl;

	/**
	 * MODIFIERS
	 *
	 * 	append() 
	 * 		*append(string &s)
	 * 		*append(string s,int pos_start,int pos_end)
	 * 		*append(string s,int count)
	 * 		*append(it_start,it_end)
	 * 		
	 * 	push_back() used to append just a single  element in to the end of the string
	 * 	
	 * 	assign()
	 * 		*assign(string &s)
	 * 		*assign(string s,int pos_start,int pos_end)
	 * 		*assign(string s,int count)
	 * 		*assign(it_start,it_end)
	 *
	 * insert()
	 *		*insert(it_pos_to_be_inserted,string &s)
	 * 		*insert(it_pos_to_be_inserted,string s,int pos_start,int pos_end)
	 * 		*insert(it_pos_to_be_inserted,string s,int count)
	 * 		*insert(it_pos_to_be_inserted,it_start,it_end)
	 * 	
	 * 	erase()
	 * 		*erase(int_start,int_end)
	 * 		*erase(it_start,it_end)
	 * 		*erase(it_pos_to_be_deleted)
	 * 		
	 * 	replace(pos_start,pos_end,string,st_it,st_last) //this bitch got the every possible combination 
	 *
	 *  swap()
	 *  
	 *  pop_back()
	 * 	
	 * 		
	 */
	s.push_back(' ');	//it appends the sapce also
	s.push_back('+');
	cout<<s<<endl;

	/**
	 * USRFULL STRING OPERATIONS
	 *
	 * find() returns the position of passed substring
	 * rfind() returns the last occurence of the passed string
	 * substr(int pos_start,int pos_end)
	 * 
	 */





	return 0;
}