#include<bits/stdc++.h>
using namespace std;

void print(valarray<int> v,string s){
    cout<<s<<endl;
    for(auto i : v) cout<<i<<"    ";
    cout<<endl;
}

int main(){
    valarray<int> varr={10,2,20,1,30};
    valarray<int> varr1;
    print(varr,"Now printing the simple array of val");

    /**********************************
     * The apply function applies the
     * provided function to change the given 
     * val array
     * *******************************/
    varr1=varr.apply([](int n){return n+=6;});
    print(varr1,"Now printing the given array with the function applied");


    /**********************************
     * SUM functiion provide the sum of 
     * complete val array
     *
     * MIN returns the minimum element of
     * the array
     *
     * MAX returns the maximum element 
     * of the valarrray
     * *******************************/
    cout<<"The sum of the complete valarray is "<<varr.sum()<<endl;
    cout<<"The minimum of the complete valarray is "<<varr.min()<<endl;
    cout<<"The maximum of the complete valarray is "<<varr.max()<<endl;


    /**********************************
     * Shift function allows to shift the
     * elements of the array in the direction
     * if positive then right ---> left is applied
     * else then left ---> right is applied
     *
     * CSHIFT allows to circularly shift with the 
     * fact that positive and negative shifts 
     * *******************************/
    varr1=varr.shift(2);
    print(varr1,"Now printing the 2 times right shifted array ");
    varr1=varr.cshift(3);
    print(varr1,"Now printing the circularly right shifted array");


    /**********************************
     * Swap function swaps the two 
     * source.valarrays(destination)
     *  
     *  I WONT BE Implementing funcion here
     * *******************************/
      
  return 0;
}
