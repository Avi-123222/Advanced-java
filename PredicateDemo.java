import java.util.*;
import java.util.function.*;
public class PredicateDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :  ");
		int num = sc.nextInt();
		Predicate<Integer> p = x -> (x > 10);
		System.out.println("is input is more than 10 : " + p.test(num));
	}
}
