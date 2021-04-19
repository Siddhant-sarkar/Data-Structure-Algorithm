#include<iostream>
using namespace std;
int f=-1,b=-1;

bool isEmpty();
void dequeue(int *a,int n);
void enqueue(int *a,int n){
  if(isEmpty()){
      f++;
      b++;
      a[f]=n;
      return ;
  }
  b++;
  a[b]=n;
  return;
}
void dequeue(int *a,int n){
    if(isEmpty()) {cout<<"The queue is empty \n"; return ;}
    f++;
}
bool isEmpty(){
    if(f==-1&&b==-1){
        return true;
    }
    return false;
}
void print(int *a,int f,int b){
    for(int i=0;i<(b-f+1);i++){
        cout<<a[f+i]<<"  ";
    }
}

int main(){
  int *queue=new int[10];
  enqueue(queue,1);
  enqueue(queue,1);
  enqueue(queue,1);
  enqueue(queue,1);
  enqueue(queue,1);
  dequeue(queue,1);
  dequeue(queue,1);
  dequeue(queue,1);
  dequeue(queue,1);
  print(queue,f,b);
}
