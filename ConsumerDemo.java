import java.util.*;
import java.util.function.*;
public class ConsumerDemo{
	public static void main(String args[]){
		Consumer<Integer> x = a -> System.out.println(a);
		x.accept(10);
		
		Consumer<List<Integer>> modify = ll -> {
					for(int i = 0; i < ll.size(); i++){
						ll.set(i, 3 * ll.get(i));
						System.out.println("Element is:  " + ll.get(i));
					}
				};
		List<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(6);
		al.add(9);
		al.add(15);
		al.add(25);
		modify.accept(al);
	}
}