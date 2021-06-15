import java.util.*;
public class queue{
	/*
		The queue is an interface which is implemented by linkedlist
		so alll the methods that we discribe in the queue will also be there in liked list as well
	*/
	public static void main(String[] args) {
		Queue<Integer> list = new LinkedList<>();
		//offer(Object o) : it pushes the element in the back of the queue
			// --> it returns true of false if the element is added or not the list
		//poll() : it removes the element form the front of the linked list
			// ---> it returns null if the list is empty()
		// peek() : it returns the element which is next in line to be polled 
			// ---> it returns null if the list is empty()
		list.offer(56);
		list.offer(23);
		list.offer(59);
		list.offer(12);
		list.poll();
		System.out.println("The next ready to be polled is " + list.peek());
		System.out.println(list);
		//add(Object o) : it pushes the element in the back of the queue
			// --> it returns true or exception if the element is not found in the list
		//remove() : it removes the element form the front of the linked list
			// ---> it returns exception if the list is empty()
		// element() : it returns the element which is next in line to be polled 
			// ---> it returns exception if the list is empty()

	}
}