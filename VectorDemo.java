import java.util.Vector;
import java.util.ArrayList;
public class VectorDemo{
	public static void main(String args[]){
		Vector vv = new Vector();
		System.out.println("Initial size is:    " + vv.size() +"    Capacity is:  "+ vv.capacity());
		vv.add("Java");
		vv.add("Python");
		vv.add(".Net");
		vv.add("Java Script");
		vv.add("HTML");
		vv.add("CSS");
		System.out.println("Initial size is:    " + vv.size() +"     Capacity is:  "+ vv.capacity());
		ArrayList aa = new ArrayList();
		aa.add("Cloneable");
		aa.add("Runnaable");
		aa.add("Random Access");
		aa.add("Serializable");
		aa.add("Comparable");	
		vv.addAll(aa);
		System.out.println("Initial size is:    " + vv.size() +"    Capacity is:  "+ vv.capacity());
		System.out.println("See all the elements");
		for(int i = 0; i < vv.size(); i++){
			String name = (String)vv.get(i);
			System.out.println(name);
		}
	}
}

		