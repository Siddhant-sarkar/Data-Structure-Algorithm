import java.util.*;
public class priorityQueue{
	public static void main(String[] args) {
		// it gives the priority to the elements that are stored in it 
		Queue<Integer> queue= new PriorityQueue	<>(Comparator.reverseOrder());
		// Queue<Integer> queue= new PriorityQueue	<>();
		//	offer adds the new element in the queue here the priority is given to the smalles number
		queue.offer(89);
		queue.offer(8);
		queue.offer(9);
		queue.offer(57);
		queue.offer(0);

		// poll() removes the element which gives the highest priority
		queue.poll();

		//peek() gives the element which is at top 
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}