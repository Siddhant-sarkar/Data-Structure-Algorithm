/*
  A set is an interesting data structure which only allows only one entry of the 
  given element

  ==> It maintains the order in which the elements are added into the set
  -==> while keeping the order sorted 
  ==> it is implemented form the tree type of implementation .
*/
import java.util.*;
public class treeSet{
  public static void main(String[] args) {
   Set<Integer> set = new TreeSet<>();
   //add function adds the elements to the hashset and finall
   set.add(78);
   set.add(8);
   set.add(7);
   set.add(877777777);
   set.add(78);
   set.add(78);

   //set(Object o) : set removes the element form the given hashset() 
   set.remove(8);
   System.out.println(set);
   //  contains() : returns true or false depending on the fact that the element to be searched on there or not
   System.out.println(set.contains(78));
   //isEmpty()  : returns ture or false if the set contains 
   System.out.println(set.isEmpty());

   //size() : returns the size of the hashset (The number off elements it contains)
   System.out.println("The nubmer of element the set constains :"+ set.size());

    // clear() : removes the elements form the set and leaves the set with an null 
    set.clear();
    System.out.println(set);
  }
}

