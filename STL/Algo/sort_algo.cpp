#include<bits/stdc++.h>
using namespace std;

//This uses an INTOSORT which is a hybrid of QuickSort, InsertionSort,HeapSort
//if Quicksort is doing unfair partitions or Taking more than O(nlogn)
//it then switches to HeapSort 
//for smaller arrays it uses InsertionSort Algorithm

int main(){
   int a[10]={2,5,3,6,1,6,7,1,8,2};

   for(int i=0;i<10;i++) cout<<a[i]<<"  ";
   cout<<endl;

   sort(a,a+10);
   cout<<"Now sorting the array"<<endl;
   for(int i=0;i<10;i++) cout<<a[i]<<"  ";
   cout<<endl;
}
