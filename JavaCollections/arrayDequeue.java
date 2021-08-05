import java.util.*;
/* Theye are the double ended queues which offer adding elements form
	both the ends 
	used in many sliding windows techiniques
*/
public class arrayDequeue{
	public static void main(String[] args) {
		ArrayDeque<Integer> adq= new ArrayDeque<>();
		//OFFER()
		//offerLast() : adds the element in the last 
		// offerFirst() : adds the elements in the first positions 	(same as the offer())
		adq.offerFirst(100);
		adq.offerLast(30);

		// peek() : gives the first element 
		// peekFirst() : gives the first element of the list
		// peekLast() :	gives the last element of the list
		System.out.println(adq.peek());
		System.out.println(adq.peekLast());
		System.out.println(adq.peekFirst());

		// Poll() :
		//	pollLast() : removes the last element
		// pollFirst() : removes the first element
		adq.poll();
		adq.pollFirst();
		adq.pollLast();
		System.out.println(adq);

	}
}