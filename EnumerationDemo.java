import java.util.Vector ;
import java.util.Enumeration ;
public class EnumerationDemo {
	public static void main(String args[]) {
		Vector v = new Vector() ;
		v.add("Java");
		v.add("Python");
		v.add("Scala");
		v.add("PHP");
		v.add(".Net");
		System.out.println("Retrive the elements from legacy class.")	;
		Enumeration ee = v.elements() ;
		while(ee.hasMoreElements()){
			String s = (String)ee.nextElement();		
			System.out.println(s)	;
			}
		}
	}