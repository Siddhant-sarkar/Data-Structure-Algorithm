#include<bits/stdc++.h>
using namespace std;

void print(int arr[],string mss){
    cout<<mss<<endl;
    for (int i=0;i<10;i++){
        cout<<arr[i]<<"    ";
    }
    cout<<endl;
}

int main(){
  //USE OF LAMBDA FUNCTION IS INITIATED
    int arr[10];
    /**********************************
     * This is the initialization command
     * which uses to initialize the array 
     * with the given element
     * which increases with the position 
     * with the count of one
     * *******************************/
    iota(arr,arr+11,69);
    print(arr,"Now printing the array which is filled with iota command");
    
    /**********************************
     * all_off
     * any_of
     * none_of
     * They function suggests the name
     * so the uses of the function
     * THESE WORK IN ALL THE CONTAINERS
     * *******************************/
    
    int ar[6] =  {1, 2, 3, 4, 5, 6};
    all_of(ar, ar+6, [](int x) { return x>0; })?
          cout << "All are positive elements\n" :
          cout << "All are not positive elements\n";
    any_of(ar, ar+6, [](int x){ return x<0; })?
          cout << "There exists a negative element\n" :
          cout << "All are positive elements\n";
    none_of(ar, ar+6, [](int x){ return x<0; })?
          cout << "No negative elements\n" :
          cout << "There are negative elements\n";

    /**********************************
     * copy_n copies the array to another arrya
     * with the fact that 
     * all the elements will be copied
     * *******************************/
    copy_n(ar,6,arr);
    print(arr,"Now printing the copies array ");
    
}

