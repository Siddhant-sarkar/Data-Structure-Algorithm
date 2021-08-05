import java.util.*;
/*
  A set is an interesting data structure which only allows only one entry of the 
  given element

  ==> all the elements are stored in any random order no particulars
*/
public class hashSet {
  public static void main(String[] args) {
   Set<Integer> set = new HashSet<>();
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
   
   //size() : returns the size of the hashset (The number off elements it contains)
   System.out.println("The nubmer of element the set constains :"+ set.size());

   //  contains() : returns true or false depending on the fact that the element to be searched on there or not
   System.out.println(set.contains(78));
   //isEmpty()  : returns ture or false if the set contains 
   System.out.println(set.isEmpty());

    // clear() : removes the elements form the set and leaves the set with an null 
    set.clear();
    System.out.println(set);
  }
}
