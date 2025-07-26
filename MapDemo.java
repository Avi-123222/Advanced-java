import java.util.*;
import java.util.stream.*;
public class MapDemo{
	public static void main(String args[]){
		List<Integer> numbers = Arrays.asList(5,7,6,11,15);
		List<Integer> result = numbers.stream().map(x -> (x * x)).collect(Collectors.toList());
		System.out.println(result);
	}
}