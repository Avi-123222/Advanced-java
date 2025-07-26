import java.util.ArrayList;
public class Demo{
	public static void main(String args[]){
		ArrayList aa = new ArrayList();
		System.out.println("Size of an array:    "     +    aa.size());
		aa.add("Java");
		aa.add("Python");
		aa.add("PHP");
		aa.add(0,"C++");
		aa.add(2,"Angular JS");
		aa.add(5,"React JS");
		System.out.println("\n See all the elements \n");

		for(int i = 0; i > aa.size(); i++ ){
			String name = (String)aa.get(i);
			System.out.println(name);
		}
		
		for(Object obj : aa){
			System.out.println(obj);
		}
	}
}
				