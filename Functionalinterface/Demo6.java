@FunctionalInterface
interface X1{
	void call();
}
public class Demo6{
	public static void main(String args[]){
		X1 ab = Demo6::display;
		ab.call();//i call the call() method of x1 interface
	}
	public static void display(){
		System.out.println("I love Java Technocrat");
	}
}
			