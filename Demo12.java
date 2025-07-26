import java.util.Scanner;
import java.util.Optional;
public class Demo12{
	static String msg = null;
	public static void main(String args[]){
		while(true){
			Optional<String> op = Optional.ofNullable(msg);
			if(op.isPresent()){
				System.out.println("Length of the String is: " + msg.length());
				System.out.println("Contents of the String is: " + op.get());
				break;
			}else{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Message");
				msg = sc.nextLine();

			}
		}
	}
}