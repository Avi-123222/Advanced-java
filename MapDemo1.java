import java.util.*;
import java.util.stream.*;
public class MapDemo1{
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(56);
		al.add(36);
		al.add(46);
		al.add(44);
		al.add(36);
		al.add(49);
		al.add(50);
		al.add(29);
		
		System.out.println("Original mark is: " + al);
		List<Integer> grace = al.stream().map(i -> i+15).collect(Collectors.toList());
		System.out.println("after mark is: " + grace);
	}
}