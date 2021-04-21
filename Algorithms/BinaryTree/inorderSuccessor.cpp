#include<iostream>
using namespace std;

class node{
    public:
      int data;
      node* l;
      node* r;
    node(int data){
        this->data=data;
        this->l=NULL;
        this->r=NULL;
    }
};

node* insert(node* head,int d){
    if(head==NULL){
        node* head=new node(d);
        return head;
    }else if(head->data>d){
       head->l=insert(head->l,d);
    }else if(head->data<d){
       head->r=insert(head->r,d);
    }
    return head;
}
void  print(node* head){
    if(head==NULL) return;
    print(head->l);
    cout<<head->data<<"   ";
    print(head->r);
}
node* findMin(node* head){
    if(head==NULL) return NULL;
    if(head->l==NULL) return head;
    return  findMin(head->l);
}
node* search(node* head,int data){
    if(head==NULL) return head;
    else if(head->data>data){
        search(head->l,data);
    }else if(head->data<data){
        search(head->r,data);
    }else{
        return head;
    }
    //return NULL;
}
node* findInOrderSuccessor(node* head,int d){
    if(head==NULL) return NULL;
    node* c=search(head,d);
    //right subtree is available
    if(c->r!=NULL){
        return findMin(c->r);
    }else{
        node* s=NULL;
        while(head!=c){
            if(head->data>c->data){
               s=head;
               head=head->l; 
            }else if(head->data<c->data){
                head=head->r;
            }else{
                break;
            }
        }
        return s;
    }
}
int main(){
   node* root=NULL; 
   root=new node(5);
   root->l=new node(3);
   root->r=new node(8);
   root->r->r=new node(11);
   root->r->l=new node(7);
   root->l->r=new node(4);
   root->l->l=new node(1);
   print(root);
   cout<<endl;
   cout<<"The next succerssor of 5 is "<<findInOrderSuccessor(root,7)->data<<endl;

   return 0;
}
