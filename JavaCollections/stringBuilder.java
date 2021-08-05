public class stringBuilder{
	public static void main(String[] args){
		// string builder is a mutable class of string which does not
		// deteroit the perfomance of the string

		StringBuilder sb= new StringBuilder("Hello World");
		System.out.println(sb.charAt(1));  // getting the char at
		sb.setCharAt(0,'d'); // setting the char at
		sb.insert(2,"d"); // inserting at a certain position
		sb.deleteCharAt(2); //  delteing charAt
		System.out.println(sb.length());
		System.out.println(sb);

	}
}