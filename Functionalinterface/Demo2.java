import java.util.Scanner;
@FunctionalInterface
interface A3{
	int add(int x, int y);
}
public class Demo2{
	public static void main(String args[]){
		Scanner ss = new Scanner(System.in);
		A3 aa = (x, y) -> {return x+y;};
		System.out.println("Sum is :  " + aa.add(13,24));
	}
}