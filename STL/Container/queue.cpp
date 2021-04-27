#include<bits/stdc++.h>
using namespace std;
void print(const queue<int> q){
	auto qq=q;
	while(!qq.empty()){
		cout<<qq.front()<<"   ";
		qq.pop();
	}
	cout<<endl;
}

int main(){
	queue<int>q;
	/**
	 * empty() return true if the queue is empty or not
	 * size() returns the size of queue
	 * front() back() they both return the front and back element of the list
	 * swap() it can be used to swap the to queue of same type and diffrent sizes
	 * emplace(int n) this places the new element at the end of the list
	 * push() pop() just the usual applications
	 * 
	 */
	q.empty()?cout<<"THe list is empty\n": cout<<"NO its not empty\n";
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	q.push(1);
	cout<<q.size()<<endl;
	q.pop();
	q.pop();
	q.pop();
	q.pop();
	q.pop();
	q.empty()?cout<<"THe list is empty\n" : cout<<"NO its not empty\n";
	cout<<q.size()<<endl;
	print(q);


	return 0;
}