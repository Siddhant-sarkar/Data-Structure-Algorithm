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
node* insert(node* &root,int data){
    if(root==NULL){
        node* temp=new node(data);
        return temp;
    }
    else if(data<root->data) root->l=insert(root->l,data);
    else if(data>root->data) root->r=insert(root->r,data);
    return root;
}
void print(node* &root){
    if(root==NULL) return ;
    print(root->l);
    cout<<root->data<<"   ";
    print(root->r);
}
int findMin(node* &root){
    if(root==NULL){
        cout<<"THe tree is not initialized "<<endl;
        return -1;
    }
    if(root->l==NULL){
        return root->data; 
    }
    return findMin(root->l);
}
node* deleteNode(node* &root,int d){
    if(root==NULL){
        return root;
    }else{
        if(d<root->data)deleteNode(root->l,d);
        else if(d>root->data)deleteNode(root->r,d);
        else{
            if((root->l==NULL)&&(root->r=NULL)){
                delete root;
                root=NULL;
            }else if(root->r==NULL){
                node* temp=root;
                root=root->l;
                delete temp;
            }else if(root->l==NULL){
                node* temp=root;
                root=root->r;
                delete temp;
            }else{
                root->data=findMin(root->r);
                deleteNode(root->r,root->data);

            }

        }
 
    }
    return root;
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
    root=insert(root,2);
    print(root);
    cout<<endl;
    deleteNode(root,8);
    print(root);
}
