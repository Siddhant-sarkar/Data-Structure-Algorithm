#include<bits/stdc++.h>
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

void insertAtTail(node* &head,int data){
  node* temp= new node(data);
  node* temp2= head;
  if(head==NULL){
     head=temp;
     return;
  }
    while(temp2->next!=NULL){
        temp2=temp2->next;
    }
    temp2->next=temp;
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
node* reverseIt(node* &head){
    node* a=NULL;
    node* b=head;
    node* c=NULL;
    while(b!=NULL){
        c=b->next;
        b->next=a;
        a=b;
        b=c;
    }
    head=a;
    return head;
}
node* reverseRec(node* &head){
    if(head==NULL||head->next==NULL){
        return head;
    }
    node* a=reverseRec(head->next);
    head->next->next=head;
    head->next=NULL;
    return a;
}
node* reverseSt(node* & head){
    node* a=head;
    stack<node*>s;
    while(a!=NULL){
        s.push(a);
        a=a->next;
    }
    a=s.top();
    head=a;
    s.pop();
    while(!s.empty()){
      a->next=s.top();
      s.pop();
      a=a->next;
    }
    a->next=NULL;
    return head;
}
int main(){
  node* head=NULL;
  insertAtTail(head,1);
  insertAtTail(head,2);
  insertAtTail(head,3);
  insertAtTail(head,4);
  insertAtTail(head,5);
  insertAtTail(head,6);
  reverseSt(head);
  print(head);



}
