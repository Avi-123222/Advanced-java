import java.util.Scanner;
interface Area{
	void area();
}
class Circle implements Area{
	
	@Override
	public void area(){
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = ss.nextDouble();
		System.out.println("The area of the circle is :    " + (3.14 * r * r));
	}
}
class Rectangle implements Area{
	@Override
	public void area(){
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Length");
		double l = ss.nextDouble();
		System.out.println("Enter the Breadth");
		double b = ss.nextDouble();
		System.out.println("The area of the Rectangle:   " + (l * b));
	}
}
class Square implements Area{
	@Override 
	public void area(){
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the length" );
		double l = ss.nextDouble();
		System.out.println("The area of the Square :   " + (l * l));
	}
}
class Factory{
	public static Area getArea(String name){
		if(name.trim().equals("Circle")){
			
			return new Circle();
		}else if(name.trim().equals("Rectangle")){
			return new Rectangle();
		}else if(name.trim().equals("Square")){
			return new Square();
		}else{
			return null;
		}
	}
}
public class Demo1{
	public static void main(String args[]){
		try{	
		 	Area aa = Factory.getArea(args[0]);
			aa.area();
		}catch(NullPointerException ne){
			System.out.println("Invaild");
		}
	}
}	
		
		