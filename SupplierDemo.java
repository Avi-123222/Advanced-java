import java.util.*;
import java.util.function.*;
public class SupplierDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		String s = new String(name);
		Supplier<String> kk = () -> s.toUpperCase();
		System.out.println("content is: " + kk.get());
		Supplier<Integer> ss = () -> s.length() + 20;
		System.out.println("content is: " + ss.get());
	}
}