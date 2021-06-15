/*
arraylist are the java equivalent of the vector
they are the dynamically growing data structures

They are implemented form the list interface
*/
import java.util.*;
public class arrayList{
	public static void main(String[] args) {
		List<Integer> word = new ArrayList();
/*		size() : returns the number of elements that are presnt in the list
*/		// The add( object o) adds the number adds the number in the arraylist to the end of the list
		word.add(1);
		word.add(2);
		word.add(2);
		word.add(2);

		// The add(int index ,Object o) add the Object to the list at a given list
		word.add(2,99);

		// The get(int index ) return the objext from the list
		word.get(2);

/*		remove(int index ) : removes the element of the list from the arraylist
		remove(Object o)  : removes the object of the list by finding the element in the list
		this happens in O(n) time complexity
*/		word.remove(Integer.valueOf(99));

/*		clear(): it clears the list of all
		word.clear();
*/
/*		set(int index, Object o): it updates the new Integer to the list
		O(1)
*/		word.set(2,100);

/*		contains(object O) : returns true or false if the element is not there or not
*/		System.out.println(word.contains(Integer.valueOf(1000)));

		// using the for loop
		for(int i=0;i<word.size();i++)
			System.out.println(word.get(i));
		// for each loop
		for( Integer n : word)
			System.out.println(n);
		//using the iterators
		Iterator<Integer> it = word.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(word);
	}
}