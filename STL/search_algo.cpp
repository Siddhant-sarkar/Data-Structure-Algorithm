#include<bits/stdc++.h>
using namespace std;
//This is the algorithm which implements the binary search to seach
//an item from the sorted collection
//always sort the elements of the collection

int main(){
   int a[10]={2,5,3,6,1,6,7,1,8,2};
   sort(a,a+10);
   int n;
   cin>>n;
   binary_search(a,a+10,n)?cout<<"the number "<<n<<" is found in the array\n":cout<<"The number is unfortunately not found in the arary\n";
   return 0;
}
