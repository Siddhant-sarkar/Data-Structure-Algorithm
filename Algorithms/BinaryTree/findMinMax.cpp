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
node* insert(node* &root,int data){
    if(root==NULL){
        root=new node(data);
        return root; 
    }else if(root->data>data){
       root->l=insert(root->r,data); 
    }else if(root->data<data){
       root->r=insert(root->r,data); 
    }
    return root;
}
bool Search(node* &root,int data){
    if(root== NULL) return false;
    if(root->data==data)return true;
    else if(root->data<data)return Search(root->r,data);
    else if(root->data>data)return Search(root->l,data);
    return -1;
}
int findMinIt(node* head){
    node* t=head;
    while(t->l!=NULL){
        t=t->l;
    }
    return t->data;
}
int findMaxIt(node* head){
    node* t=head;
    while(t->r!=NULL){
        t=t->r;
    }
    return t->data;
}
int findMax(node* head){
    if(head==NULL) return -1;
    else if(head->r==NULL){
        return head->data;
    }
    findMax(head->r);
}
int findMin(node* head){
    if(head==NULL) return -1;
    else if(head->l==NULL){
        return head->data;
    }
    findMin(head->l);
}
int main(){
   node* root=NULL;
   insert(root,1);
   insert(root,2);
   insert(root,4);
   insert(root,4);
   insert(root,6);
   insert(root,6);
   insert(root,7);
   insert(root,8);
   insert(root,58);
   //Search(root,58)?cout<<"Found that bitch\n":cout<<"Fuck it\n";
   cout<<findMax(root);

}
