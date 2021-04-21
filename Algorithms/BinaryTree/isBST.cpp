#include<bits/stdc++.h>
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
int findMin(node* head){
  if(head==NULL) return -1;
  else if(head->l==NULL) return head->data;
  return findMin(head->l);
}
int findMax(node* head){
  if(head==NULL) return -1;
  else if(head->r==NULL) return head->data;
  return findMax(head->r);
}
bool isBinaryTree(node* head){
    if(head==NULL) return true;
    if(head->l!=NULL&&head->data<findMax(head->l)) return false;
    if(head->r!=NULL&&head->data>findMin(head->r)) return false;
    if(!isBinaryTree(head->l)||!isBinaryTree(head->r)) return false;
    return true;
}

bool isBinaryTreeOp(node* head,int min,int max){
    if(head==NULL) return 1;
    else if(head->data<min
        &&head->data>max
        &&isBinaryTreeOp(head->l,head->data,max)
        &&isBinaryTreeOp(head->r,min,head->data)){
        return true;
    }else{
        return false;
    }
}
bool isBstUtil(node *head,int min,int max){
   if(head==NULL) return true;
   else if(head->data<min
       &&head->data>max
       &&isBstUtil(head->l,head->data,max)
       &&isBstUtil(head->r,min,head->data)){
      return true;
   }
   return false;
}
bool finalCall(node* root){
    return isBstUtil(root,INT_MAX,INT_MIN);
}

bool usingInorderTraversal(node* head,int d){
  if(head==NULL) return true;
  usingInorderTraversal(head->l,head->data);
  if(head->data<d) return false;
  usingInorderTraversal(head->r,head->data);
}
int main(){
   node* root=NULL;
   root=new node(8);
   root->l=new node(5);
   root->l->l=new node(4);
   root->l->r=new node(7);
   root->r=new node(12);
   root->r->l=new node(11);
   root->r->r=new node(16);
   //cout<<findMax(root);
   if(usingInorderTraversal(root,root->data)){
      cout<<"The given tree is s binary tree"<<endl;
   }
}
