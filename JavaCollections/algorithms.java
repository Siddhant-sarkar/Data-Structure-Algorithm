import java.util.*;
public class algorithms {
  public static void main(String[] args) {
   List<Integer> array= new ArrayList<>(); 
   array.add(1);
   array.add(2);
   array.add(3);
   array.add(4);
   array.add(5);
   // use collections.method we use the for the collections 
   // use the binarySearch(array,int index);
   System.out.println(Collections.binarySearch(array, 3));
  //  we use the sort method to sort the collection framework
  // we can pass the comparator to sort it in any order
   Collections.sort(array,Comparator.reverseOrder());
   System.out.println(array);
    // fill(collection,int in) : we use the number use as the fill to fill any array
  //  Collections.fill(array,8);
   System.out.println(array);

  //  min() : returns the minimum value of the elements present in the list
  // max() : returns the maximum element present in the list
  // frequency(Collecection c,element e) : returns the number of elements present in the list
   System.out.println(Collections.min(array));
   System.out.println(Collections.max(array));
   System.out.println("The number of times a 8 in the list is "+Collections.frequency(array, 8));

  }  
}
