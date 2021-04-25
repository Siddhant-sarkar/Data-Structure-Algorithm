#include<bits/stdc++.h>
using namespace std;

void print(vector<int> n,string msg){
    cout<<msg<<endl;
    for(auto i : n) cout<<i<<"   ";
    cout<<endl;
}
int main(){
   vector<int> v={1,2,3,4,5,6,7,8,9};
   vector<int> v1={1,2,3,4,5,6,7,8,9};
    /**********************************
     *This is the unstable partition in this 
     * relative position is not maintained 
     * *******************************/
   partition(v.begin(),v.end(),[](int x){return x%2==0;});
   print(v,"Using the unstable partition");

    /**********************************
     * This is stable partition algorithm 
     * so the relative position of the 
     * is maintained and conserved
     * *******************************/
   stable_partition(v1.begin(),v1.end(),[](int x){return x%2==0;});
   print(v1,"Using the stable partition");

    /**********************************
     * is_partioned returns the bool 
     * value if the conainer is partioned or 
     * not
     * *******************************/
   is_partitioned(v.begin(),v.end(),[](int x){return x%2==0;})?cout<<"yes yes it is\n"<<endl:cout<<"No unfortunately its not partioned\n";

    /**********************************
     * partion_point return an iterator 
     * to element where which it is
     * first partitioned
     * *******************************/
   vector<int>::iterator it=partition_point(v.begin(),v.end(),[](int x){return x%2==0;});
   
    /**********************************
     *this is the code to print the 
     *parted contaier in the 
     * *******************************/
   for(vector<int>::iterator iit=v.begin();iit!=it;iit++){
      cout<<*iit<<"   ";
   }
   cout<<endl;
    /**********************************
     *patition_copy() copies the partition 
     * another container with the fact taking in 
     * the accordance with the start and the end point 
     * of the source and the destination containers
     * *******************************/
   partition_copy(v.begin(),v.end(),v1.begin(),v1.end(),[](int i){return i%2==0;});
   print(v1,"now printing the copied partitioned array");
  return 0;
}
