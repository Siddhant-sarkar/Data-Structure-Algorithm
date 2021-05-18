#include<iostream>
using namespace std;

int main(){
    int a[10]={3,4,6,2,6,3,6,3,76,7};
    cout<<"Now printing the array \n";
    for(int i=0;i<10;i++) cout<<a[i]<<"    ";
    int b[10];
    for(int i=0;i<10;i++) b[i]=a[i];
    cout<<"Now printing the array in reversed order"<<endl;
    for(int i=0;i<10;i++) cout<<a[i]<<"    ";
}

