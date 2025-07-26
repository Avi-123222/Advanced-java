import java.util.Scanner;
@FunctionalInterface
interface A1{
	void cube();
}
public class Demo{
	public static void main(String args[]){
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ss.nextInt();
		A1 aa = () -> {System.out.println("cube of  "+ num + " is " +(num * num * num));};
		aa.cube();
	}
}