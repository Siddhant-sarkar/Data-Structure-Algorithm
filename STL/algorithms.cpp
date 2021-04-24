#include<bits/stdc++.h>
using namespace std;

void print(vector<int> v){
    for(auto i :v) cout<<i<<"   ";
    cout<<endl; 
} 
int main(){
    int arr[] = {10, 20, 5, 23 ,42 , 15};
    int n = sizeof(arr)/sizeof(arr[0]);
    vector<int> v(arr,arr+n);
    cout<<"Now printing the vec \n";
    print(v);

    //SORT function
    sort(v.begin(),v.end());
    cout<<"now printing the array \n";
    print(v);

    //REVERSE function
    reverse(v.begin(),v.end());
    cout<<"Now reversing the array\n";
    print(v);

    //min and max function
    cout<<"Now printing the maximum and minimum elements\n";
    cout<<*max_element(v.begin(),v.end())<<"     "<<*min_element(v.begin(),v.end())<<endl;

    //Acumulate function is the sum function in 
    cout<<"sum of all the elemets with refrence from 0\n";
    cout<<accumulate(v.begin(),v.end(),0)<<endl;

    //Count counts all the occurences of the x element in the collection
    cout<<"The number of occurences of the 20 are "<<endl;
    cout<<count(v.begin(),v.end(),20)<<endl;

    /**********************************
    *Find returns the iterator to the first matching element passed to the function
    *However if the elment is not found then it return the iterator to the last element
    *of the given collection
    **********************************/
    cout<<*find(v.begin(),v.end(),20)<<endl;

    /*********************************
    *Binary_search
    *in order to make this work we need to have an assending order sorted array
    **********************************/
    reverse(v.begin(),v.end());
    cout<<binary_search(v.begin(),v.end(),42)<<endl;

    /*********************************
    *upper bound and lower bound 
    *they provide a number which is greator or lesser than the the defined range
    *range[start,end)
    *NOtice the inlcusion in that start and exclusion at the end
    *they return an ITERATOR
    **********************************/
    cout<<"Now printing the upperbound and lowerbound\n";
    cout<<*upper_bound(v.begin(),v.end(),1)<<"    "<<*lower_bound(v.begin(),v.end(),5)<<endl;

    /**********************************
     *This is the erase function 
     *this erases the container from a given iterator 
     *to the end iterator provided by the user
     * *******************************/
    cout<<"Now erasing the array from mid to begin"<<endl;
    vector<int>vec={1,2,3,4,5,6,7,8,9,10};
    vec.erase(vec.begin()+4) ;
    print(vec);

    /**********************************
     *if to remove the occureance of any number 
     *unique()
     *vec.erase(unique(vec.begin(),vec.end()),vec.end());
     * *******************************/
     vec={1,2,2,2,3,4,5,65};
     cout<<"with occurences"<<endl;
     print(vec);
     unique(vec.begin(),vec.end());
     cout<<"Now replacing the "<<endl;
     print(vec);

    /**********************************
     *next_permutations(it,it)
     *prev_permutations(it,it)
     * *******************************/
     cout<<"Now generating the permuations"<<endl;
     vec={1,2,3,4,5,6,7,8,9,10};
     next_permutation(vec.begin(),vec.end());
     print(vec);
     cout<<endl;
     prev_permutation(vec.begin(),vec.end());
     print(vec);
     cout<<endl;
     
    /**********************************
     *distance returns the distance of 
     *required iterator 
     * *******************************/
      int d=distance(vec.begin(),find(vec.begin(),vec.end(),5));
      cout<<"The distance of 5 from the start : "<<d<<endl;



    return 0;

}
