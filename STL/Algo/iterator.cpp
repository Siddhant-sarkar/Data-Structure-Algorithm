k#include<bits/stdc++.h>
using namespace std;


int main() {
  vector<int> v = {1, 4, 5, 7, 8, 9, 3, 6, 7};

  /**********************************
   * begin() return an iterator that points
   * to the beginning of the colllection
   *
   * end() return an iterator that points
   * to the end of the collection
   * *******************************/
  vector<int>::iterator it = v.begin();
  vector<int>::iterator it1 = v.end();


  /**********************************
   * advance() it advances the iterator
   * to a number specified
   * *******************************/
  advance(it, 4);
  cout << *it << endl;

  /**********************************
   * next() and prev() return the
   * iterators to the previous and next
   * element pointed by the provided iterator
   * *******************************/
  vector<int>::iterator a = next(it, 5);
  vector<int>::iterator b = prev(it, 2);

  /**********************************
   * inserter is used to insert the
   * form the container to the position
   * *******************************/

  //THIS INSERTER FUCTION HAS SOME BUGS TO BE SOLVED
  vector<int> var = {1, 5, 6, 7, 8, 98, 3, 5};
  copy(var.begin(), var.end(), inserter(v, it));
  for (auto i : var) cout << i << "    ";
  return 0;
}
