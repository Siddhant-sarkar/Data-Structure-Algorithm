#include<bits/stdc++.h>
using namespace std;

void print(stack<int> s){
	stack<int>temp=s;
	while(!s.empty()){
		cout<<s.top()<< "    ";
		s.pop();
	}
	cout<<endl;
}

int main(){

	stack<int>s;
	s.top();
	/**
	 * empty() returns true if the stack is empty
	 * size() returns the size of the stack
	 * top() returns the topmost element of the stack
	 * push() pop() the usual insertion and deletion 
	 * swap() swaps the the stack of the same type and size can vary
	 * emplace() is another name for inserting in the top
	 */


	return 0;
}