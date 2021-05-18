#include<iostream>
using namespace std;

class node{
  public:
    int data;
    node* next;

    node(int data){
        this->data=data;
        this->next=NULL;
    }

};
node* front=NULL;
node* back=NULL;

void enqueue(int data);
void dequeue();
bool isEmpty();
//int front(node* head);
void print(node* f,node* b);

void enqueue(int data){
    if(isEmpty()){
        node* n=new node(data);
        front=n;
        back=n;
        return;
    }
    node* n=new node(data);
    back->next=n;
    back=back->next;
}
bool isEmpty(){
    if(front==NULL&&back==NULL){
       return 1; 
    }
    return 0;
}
void print(node* f,node* b){
    if(isEmpty()){
        cout<<"The queue is empty bruh!!!!!"<<endl;
    }
    node* t=f;
    if(t==b){
        cout<<"The queue contains only one value : "<<t->data<<endl;
        return ;
    }
    while(1){
        if(t==b){
            cout<<t->data<<endl;
            return;
        }
        cout<<t->data<<"===>";
        t=t->next;
    }
}
void dequeue(){
    node* a=front;
    front=front->next;
    delete a;
}

int main(){
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);
    enqueue(6);
    print(front,back); 
}
