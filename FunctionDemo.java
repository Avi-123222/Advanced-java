import java.util.*;
import java.util.function.*;
public class FunctionDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the institute Name");
		String name = sc.nextLine();
		

		Function<String , Integer> ff = x -> x.length();
		Integer size = ff.apply(name);
		System.out.println("size of " + name + "   is : " + size);
		
		Function<String , String> ff1 = a -> a.toUpperCase();
		String uc = ff1.apply(name);
		System.out.println("Content is "+ uc);
		

		

	}
}