import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo{
	public static void main(String args[]){
		ArrayList aa = new ArrayList();
		System.out.println("Size is:   " + aa.size());
		aa.add("Python");
		aa.add("Java");
		aa.add("C++");
		aa.add(".Net");
		aa.add("React");
		System.out.println("Size is:   " + aa.size());
		Iterator ii = aa.iterator();
		while(ii.hasNext()){
			Object data = ii.next();
			System.out.println(data);
			ii.remove();
		}
		System.out.println("Size is:   " + aa.size());

	}
}			