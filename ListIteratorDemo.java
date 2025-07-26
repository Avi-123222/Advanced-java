import java.util.ArrayList;
import java.util.ListIterator ;
public class ListIteratorDemo {
	public static void main(String args[])	 {
		ArrayList aa = new ArrayList() ;
		aa.add("India");
		aa.add("Japan");
		aa.add("Nepal");
		aa.add("China");
		aa.add("Korea");
		System.out.println("See the elements in forward direction.");
		ListIterator li = aa.listIterator() ;
		//List interface
		//public abstract ListIterator listIterator()
		while(li.hasNext()) {
			String n = (String)li.next() ;
			System.out.println(n);		
			}
		li.add("Cuba");
		System.out.println("See the elemnents in backword direction.");
		while(li.hasPrevious()) {
			String p = (String)li.previous() ;
			System.out.println(p);
			}
		}
	}