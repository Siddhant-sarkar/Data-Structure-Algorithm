#include<iostream>
using namespace std;
/*****************************
 * insertAtHead=push()
 * insertAtTail=pop()
 * top()
 * ****************************/
class node{
    public:
      int data;
      node* next;

    node(int data){
        this->data=data;
        this->next=NULL;
    }
};

node* pop(node* &head){
    if(head == NULL){
      cout<<"The stack seems to be empty bruh!!"<<endl;
    }
    node* a=head;
    head=head->next;
    delete a;
    cout<<"We are now deleting guys"<<endl;
    return head;
}
node* push(node* &head,int data){
    node* b= new node(data);
    if(head==NULL){
        head=b;
        return b;
    }
    b->next=head;
    head=b;
    return b;
}
void print( node* head){
  node* temp = head;
    while(temp!=NULL){
      if(temp->next == NULL){
          cout<<temp->data<<"==> NULL"<<endl;
      }else{    
          cout<<temp->data<<"==>";
      }
        temp=temp->next;
    }
}

int top(node* head){
    return head->data;
}

int main(){
   node* head=NULL;
   push(head,1);
   push(head,2);
   pop(head);
   push(head,2);
   push(head,3);
   print(head);
   cout<<"the topmost element in the stack is "<<top(head)<<endl;


}
