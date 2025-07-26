import java.util.*;
public class Demo3{
	public static void main(String args[]){
		List<String> ll = new ArrayList<>();
		ll.add("PHP");
		ll.add("Python");
		ll.add("Java");
		ll.forEach((n) -> System.out.println(n));
	}
}