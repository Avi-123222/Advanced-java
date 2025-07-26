public class Demo4{
	public static void main(String args[]){
		Runnable rr1 = () -> {System.out.println("Running Thread name is : " + Thread.currentThread().getName());};
		Thread t1 = new Thread(rr1);
		t1.setName("Java");
		t1.start();
	}
} 