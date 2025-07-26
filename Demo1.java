import java.util.ArrayList;
public class Demo1{
	public static void main(String args[]){
		ArrayList aa = new ArrayList();
		System.out.println("Size of an ArrayList is :   " + aa.size());
		aa.add("Java");
		aa.add("Python");
		aa.add("PHP");
		aa.add("C++");
		aa.add("Angular JS");
		aa.add("React JS");
		System.out.println("\n See all the elements \n");

		for(int i = 0; i > aa.size(); i++ ){
			String name = (String)aa.get(i);
			System.out.println(name);
		}

		String s = (String)aa.remove(3);
		System.out.println("Removed element is :   " + s);
		
		for(Object obj : aa){
			System.out.println(obj);
		}
	}
}
