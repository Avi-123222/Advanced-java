@FunctionalInterface
interface X<A,B>{
	Object call(A aa, B bb);
}
class Text{
	public static int add(int x, int y){
		return x + y;
	}
	public static double add(double d1, double d2){
		return d1 + d2;
	}
}
public class Demo7{
	public static void main(String args[]){
		X<Integer, Integer> ab = Text::add;
		X<Double, Double> aa = Text::add;
		System.out.println("Sum is:    " + ab.call(10, 20) + "    Sum is:    " + aa.call(10.20, 30.60) );
	}
}	