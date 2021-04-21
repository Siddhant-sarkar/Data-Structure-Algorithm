#include<iostream>
#include<queue>
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
void inorderTraversal(node* root){
    if(root==NULL) return ;
    inorderTraversal(root->l);
    cout<<root->data<<"   ";
    inorderTraversal(root->r);
}
void preorderTraversal(node* root){
    if(root==NULL) return ;
    cout<<root->data<<"   ";
    preorderTraversal(root->l);
    preorderTraversal(root->r);
}
void postorderTraversal(node* root){
    if(root==NULL) return ;
    postorderTraversal(root->l);
    postorderTraversal(root->r);
    cout<<root->data<<"   ";
}
int main(){
   node *root = new node(1);
   root->l = new node(2);
   root->r = new node(3);
   root->l->l = new node(4);
   root->l->r = new node(5);
   postorderTraversal(root);
}
