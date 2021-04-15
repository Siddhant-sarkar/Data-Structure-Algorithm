#include<iostream>
using namespace std;


#define MAX_SIZE 100
int A[MAX_SIZE];
int top=-1;

void pop(){
  if(top==-1){
      cout<<"No stack values to print"<<endl;
  }
    top--;

}
void push(int val){
    if(top == MAX_SIZE-1){
        cout<<"maximum overflow reached\n";
    }
    A[++top]=val;
}
void print(int arr[]){
    for(int i=0;i<top;i++){
        cout<<arr[i]<<endl;
    }
}
int atTop(){
    return A[top];
}
int main(){
    push(1);
    push(1);
    push(1);
    push(1);
    push(1);
    push(1);
    push(1);
    push(1);
    push(1);
    push(1);
    print(A);
    cout<<"The element at top index is "<<atTop()<<endl;

}
