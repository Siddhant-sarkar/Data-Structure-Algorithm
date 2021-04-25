#include<bits/stdc++.h>
using namespace std;

void print(vector<int> v,string n){
  cout<<n<<endl;
    for(auto i : v) cout<<i<<"   ";
    cout<<endl;
}

int main(){
  vector<int> v={1,2,3,4,5,6,7,8,9,10};

    /**********************************
     * ITERATORS
     
     * begin() – Returns an iterator pointing to the first element in the vector
     * end() – Returns an iterator pointing to the theoretical element that follows the last element in the vector
     * rbegin() – Returns a reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element
     * rend() – Returns a reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end)
     * cbegin() – Returns a constant iterator pointing to the first element in the vector.
     * cend() – Returns a constant iterator pointing to the theoretical element that follows the last element in the vector.
     * crbegin() – Returns a constant reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element
     * crend() – Returns a constant reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end)

     * *******************************/
  auto it=v.begin();
  cout<<"This is the begining iterator of the vector  "<<*it<<endl;
    
    /**********************************
     * FUNCTIONS
     *
     * size()        - This return the size of the vector.
     * max_size()    - This returns the max of elements that vector can hold. 
     * capacity()    - This returns the max size of in the number of elements.
     * resize()      - It resizes the vector to a given ammount.
     * empty()       - BOOL if empty or not 
     * shrink_to_fit()- it shrinks the vector to fit into a smaller sized vector
     * reserve()     - Requests the vector must of the required quantitiy(AT LEAST)
     *
     * *******************************/
  cout<<"using size() "<<v.size()<<endl;
  cout<<"using max_size() "<<v.max_size()<<endl;
  //even if we pop out capacity will show the intial size
  v.pop_back();
  cout<<"using size() "<<v.size()<<endl;
  cout<<"capacity "<<v.capacity()<<endl;

  v.resize(8);
  print(v,"ON resizing the vector to 8 ");

  v.reserve(15);
  cout<<"Now modifying the capacity of the vector "<<v.capacity()<<endl;

    /**********************************
     * reference operator [g] – Returns a reference to the element at position ‘g’ in the vector ***THIS DOES NOT DOES BOUND CHECKING***
     * at(g) – Returns a reference to the element at position ‘g’ in the vector
     * front() – Returns a reference to the first element in the vector
     * back() – Returns a reference to the last element in the vector
     * data() – Returns a direct pointer to the memory array used internally by the vector to store its owned elements.
     * *******************************/
  cout<<" using the refrence operator "<<v[5]<<endl;
  cout<<" using the .at() opearator "<<v.at(5)<<endl;
  cout<<"front back "<<v.front()<<"  "<<v.back()<<endl;


    /**********************************
     * assign()  It assigns new value to the vector elements by replacing old ones
     * push_back()  It push the elements into a vector from the back
     * pop_back()  It is used to pop or remove elements from a vector from the back.
     * insert()  It inserts new elements before the element at the specified position
     * erase()  It is used to remove elements from a container from the specified position or range.
     * swap()  It is used to swap the contents of one vector with another vector of same type. Sizes may differ.
     * clear() It is used to remove all the elements of the vector container
     * emplace()  It extends the container by inserting new element at position
     * emplace_back()  It is used to insert a new element into the vector container, the new element is added to the end of the vector*
     * *******************************/

  vector<int> vec;
  vec.assign(5,10);
  print(vec,"used assign fuction to assign 10 to 5");
  vec.push_back(21);
  print(vec,"used to add a number to the end of the vector ");
  vec.pop_back();
  print(vec,"used to remove the element from the back");
  vec.insert(vec.begin(),99);
  print(vec,"insert to the head");
  vec.erase(next(vec.begin(),3));
  print(vec,"now after replacign the 4th element from the array");

  vec.clear();
  print(vec,"The vector is cleared now\n");
  v.emplace(next(v.begin(),3),19);
  v.emplace_back(9999);
  print(v,"using the emplace function");




  return 0;
}
