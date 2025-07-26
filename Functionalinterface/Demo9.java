@FunctionalInterface
interface X{
	Message getMessage(String msg);
}
class Message{
	Message(String s){
		System.out.println("Message is:  " + s);
	}
}
public class Demo9{
	public static void main(String args[]){
		X aa = Message :: new;
		aa.getMessage("I love Java Technocrat");
	}
}