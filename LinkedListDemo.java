import java.util.LinkedList ;
import java.util.Iterator;
public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList() ;
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.addFirst("O");
		ll.addLast("V");
		System.out.println("First element is : "+ll.peekFirst());
		System.out.println("Last element is : "+ll.getLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println("See the elements.");
		Iterator ii = ll.iterator() ;
		while(ii.hasNext())	 {
			System.out.println(ii.next());
			}
		}
	}