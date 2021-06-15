import java.util.*;
public class stack{
	public static void main(String[] args) {
		Stack<String> words= new Stack<>();

		//	push(Object o) : it pushes the Object into the stack
		//	pop() : it is used to remove the topmost element in the stack
		words.push("this");
		words.push("this");
		words.push("this");

		//	peek()	: returns the topmost element in the stack 
		System.out.println("the top most element in the list : "+words.peek());
		words.pop();
		System.out.println("the top most element in the list : "+words.peek());
		System.out.println(words.size());

		System.out.println(words);
	}
}