import java.util.Stack;
public class StackDemo{
	public static void main(String args[]){
		Stack ss = new Stack();
		
		ss.push("Stack");
		ss.push("Queue");
		ss.push("Linked List");
		ss.push("Parse Tree");
		System.out.println("Extracted element is :   "+ ss.peek());
		System.out.println("Index position of the element is:   "+ ss.search("Stack"));
		System.out.println("Index position of the element is :   "+ ss.search("Linked List"));
		System.out.println("Remove the element is :  " + ss.pop());
	}
}