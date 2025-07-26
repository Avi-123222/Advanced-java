import java.util.Scanner;
@FunctionalInterface
interface A2{
	public String getMessage();
}
public class Demo1{
	public static void main(String args[]){
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the message:  ");
		String msg = ss.nextLine();
		A2 aa = () -> {return msg;};
		System.out.println("Today's message is :" + aa.getMessage());
	}
}	