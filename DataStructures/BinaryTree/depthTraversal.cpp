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
bool Search(node* &root,int data){
    if(root== NULL) return false;
    if(root->data==data)return true;
    else if(root->data<data)return Search(root->r,data);
    else if(root->data>data)return Search(root->l,data);
}
void levelOrderTraversal(node* root){
    if(root==NULL) return ;
    queue<node*>q;
    q.push(root);
    while(!q.empty()){
        node* n=q.front();
        cout<<n->data<<endl;
        if(n->l!=NULL) q.push(n->l) ;
        if(n->r!=NULL) q.push(n->r) ;
        q.pop();
    }

}
int main(){
   node *root = new node(1);
   root->l = new node(2);
   root->r = new node(3);
   root->l->l = new node(4);
   root->l->r = new node(5);
   levelOrderTraversal(root);
}
