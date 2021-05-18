#include<iostream>
using namespace std;

class node{
  public:
    int data;
    node* next;
    node* pre;
    
    node(int data){
        this->data=data;
        this->next=NULL;
        this->pre=NULL;
    }
};
/**********************************
 * This function add a new node at the head 
 * of the linked list if head==NULL
 * then a new linked list is initialized 
 ****************************************/
node* insertAtHead(node* &head,int data){
  node* temp =new node(data);
    if(head==NULL){
      cout<<"Linked List was empty initalizing a linked list XD"<<endl;
        head = temp;
        return head;
    }
    else{
        head->pre=temp;
        temp->next=head;
        head=temp;
    }
    return head;
}
/***********************************
 * Function is printing the linked list
 * *********************************/
void print(node* head){
  if(head==NULL){
      cout<<"Linked List is empty"<<endl;
  }
    while(head!=NULL){
      if(head->next==NULL){
          cout<<head->data<<endl;
          return;
      }
        cout<<head->data<<"==>";
        head=head->next;
    }
}
/***********************************
 * to implement insert at tail function
 * if head == NULL then the linked list
 * is initialized
 * *********************************/
node* insertAtTail(node* &head,int data){
  node* a=head;
  node* temp=new node(data);
    if(head ==NULL){
        head=temp;
        return head;
    }else{
        while(a->next != NULL){
           a=a->next; 
        }
        a->next=temp;
        temp->pre=a;
    }
    return head;
}
/***********************************
 * This function adds the node to
 * the the given place
 * *********************************/
node* insert(node* &head,int data,int pos){
    node* a=head;
    node* t= new node(data);
    pos--;
    if(head==NULL){
        head=t;
        return head;
    }
    while(pos--){
      a=a->next;   
    }
    a->next->pre=t;
    t->next=a->next;
    a->next=t;
    t->pre=a;
    return head;
}
/***********************************
 * This is a delete functionality
 * to be added to the linked list
 * *********************************/
node* deleteNode(node* head,int pos){
  node* a= head;
    while(pos--){
      a=a->next;
    }
    a->next->pre=a->pre;
    a->pre->next=a->next;
    delete a;
    return head;
}
int main(){
  node* head=NULL;
  insertAtTail(head,1);
  insertAtTail(head,2);
  insertAtTail(head,3);
  insertAtTail(head,4);
  insertAtTail(head,4);
  insert(head,69,2);
  deleteNode(head,2);
  print(head);

}
