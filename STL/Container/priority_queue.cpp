#include<bits/stdc++.h>
using namespace std;
void print(const priority_queue<int> q){
	auto qq=q;
	while(!qq.empty()){
		cout<<qq.top()<<"   ";
		qq.pop();
	}
	cout<<endl;
}

int main(){
	priority_queue<int>q;
	/**
	 * empty() return true if the priority_queue is empty or not
	 * size() returns the size of prority_queue
	 * top() it returns the top most element of the list
	 * swap() it can be used to swap the to prority_queue of same type and diffrent sizes
	 * emplace(int n) this places the new element at the end of the list
	 * push() pop() just the usual applications
	 * 
	 */
	q.empty()?cout<<"THe list is empty\n": cout<<"NO its not empty\n";
	q.push(1);
	q.push(5);
	q.push(7);
	q.push(2);
	q.push(9);
	q.push(11);
	q.push(16);
	q.push(1);
	q.push(122);
	q.push(19);
	q.push(15);
	cout<<q.size()<<endl;
	// q.pop();
	// q.pop();
	// q.pop();
	// q.pop();
	// q.pop();
	q.empty()?cout<<"THe list is empty\n" : cout<<"NO its not empty\n";
	cout<<q.size()<<endl;
	print(q);



	return 0;
}