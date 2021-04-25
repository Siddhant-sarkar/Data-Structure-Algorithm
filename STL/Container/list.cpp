#include<bits/stdc++.h>
using namespace std;

void print(list<int> l,string m){
	cout<<m<<endl;
	if(l.empty()){
		cout<<"The list is empty\n";
		return ;
	}
	for(auto &i:l) cout<<i<<"   ";
	cout<<endl;
}

int main(){
	/*
	 * ITERATORS
	 *
	 * begin() end()
	 * rbegin() rend()
	 * cbegin() cend()
	 * crbegin() crend()
	 * 
	 */
	list<int>l={1,2,3,4,5,6,7,8,9,10};
	auto it=l.begin();
	auto iit=l.end();
	cout<<"The first element of the list is "<<*it<<endl;
	cout<<"The last element of the array is "<<*iit<<endl;

	/**
	 * FUNCTIONS
	 * front() back()
	 * push_front(int number) push_back(int number)
	 * pop_front() pop_back()
	 * 
	 * insert(ii,int count,int number)
	 * erase(it_start,it_end)
	 * empty() return weather the list is empty or not
	 */
	l.pop_back();
	print(l,"Now popin of the back of the list ");
	l.push_front(10);
	print(l,"Now after pushing 10 to the front of the list");
	l.insert(next(it,3),5,7);
	print(l,"Now after inserting the 5 7s in the list");
	l.erase(next(l.begin(),4),next(l.begin(),9));
	print(l,"Now erased the list");

	/**
	 * assign(count,value);
	 * assign(start_it,end_it);
	 *  IT REASSIGNS THE WHOLE ARRAY 
	 */
	list<int>ll={1,1,1,1,1,1,1,1,1,1,1};
	ll.assign(2,10);
	print(ll,"Now using the assign functionality ");

	/**
	 * remove(val)
	 * it removes the value of the elemnt form the 
	 * given array
	 *
	 * remove_if(prediacte)
	 *
	 * reverse();
	 */
	list<int>lll={1,1,1,1,1,1,1,1,1,1,1};
	lll.remove_if([](int i){return i%2==0;});
	print(lll,"using the remove functionality we removed all the instaces of 1");

	// l.reverse();
	reverse(l.begin(),l.end());
	print(l,"Now the revers is applied");

	/**
	 * size(),resize(),maxsize()
	 */
	cout<<"size "<<l.size()<<" maxsize "<<l.max_size()<<endl;
	l.resize(20);
	cout<<"size of the list is "<<l.size()<<endl;

	/**
	 * unique() --- removes all the duplicates of the list
	 */
	list<int>m={1,2,3,3,3,3,4,5,6,7};
	m.unique();
	print(m,"on removing the duplicates from the list");

	/**
	 *  emplace_font(int val)
	 *  emplace_back(int val)
	 *  emplace(it,int val)
	 *  
	 *  THE MAIN DIFFRENCE BETWEEN EMPLACE AND INSERT 
	 *  COMES INTO PLAY WHEN THE OBJECTS ARE USED INSTEAD 
	 *  OF THE PRIMITIVE DATA TYPES
	 *  EMPLACE CREATES THE OBJECT USING THE CONSTRUCTOR
	 */
	l.emplace(next(l.begin(),4),59);
	print(l,"on using the emplace function");

	/**
	 * clear() this clears the list
	 * swap(list<>l) this swaps the list with eachother of sametype ans same size
	 * splice(postion_tobe_inserted,list_to_be_transferred,pos_start,pos_end)
	 * merge() this only works in the sorted list
	 */
	
	list<int>l1;
	l1.assign(10,10);
	list<int>l2;
	l2.assign(10,20);
	
	print(l1,"just for fun");
	print(l2,"just for fun");
	l1.swap(l2);
	print(l1,"just for fun");
	print(l2,"just for fun");
	l2.splice(l2.begin(),l1,l1.begin(),next(l1.begin(),5));
	print(l2,"Now after splicing the second list to the list");

	l1={1,3,5,7,9};
	l2={2,4,6,8,10};
	l2.merge(l1);
	print(l2,"Now printing the merged list");

	return 0;


}