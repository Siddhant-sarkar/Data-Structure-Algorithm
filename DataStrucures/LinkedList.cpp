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
void insert(node* &head,int data,int n);
void print(const node* head);
void insertAtTail(node* &head,int data);

/****************************
 * INSERT AT ANY-POSITION
* This inserts the node at any position in the linked list
* if the node is the head node node.next is assigned head
* else the node is assigned the the null as its next
* **************************/
void insert(node* &head,int data,int n){
    node* temp1 =new node(data);
      if(n==1){
       temp1->next = head;
       head = temp1;
       return;
      }
    node* temp2=head;
    for(int i=0;i<n-2;i++){
        temp2=temp2->next;
    }
    temp1->next=temp2->next;
    temp2->next=temp1;
}
/****************************
 * PRINT THE LINKED LIST
 *this is as linked list printing function
 *It traverses the list till head->next!=NULL
 * **************************/
void print( node* head){
  node* temp = head;
    while(temp!=NULL){
      if(temp->next == NULL){
          cout<<temp->data<<endl;
      }else{    
          cout<<temp->data<<"==>";
      }
        temp=temp->next;
    }

}
/********************************
 * this is the function to insert the node at the
 * end of linked list
 * ******************************/
void insertAtTail(node* &head,int data){
  node* temp= new node(data);
  node* temp2= head;
  if(head==NULL){
     cout<<"the linked list is "<<endl;
     head=temp;
     return;
  }
    while(temp2->next!=NULL){
        temp2=temp2->next;
    }
    temp2->next=temp;

}
int main(){
  node* head;
    head=NULL;
   // insert(head,1,1);
    insertAtTail(head,2);
    insertAtTail(head,2);
    insertAtTail(head,2);
    insertAtTail(head,2);
    insertAtTail(head,2);
    print(head);

}
