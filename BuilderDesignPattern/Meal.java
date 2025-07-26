import java.util.*;
public class Meal{
	private List<Item> items = new ArrayList<Item>();
	public void addItem(Item obj){
		items.add(obj);
	}
	public double getCost(){
		double cost = 0.0;
		for(Item aa : items){
			cost += aa.price();
		}
		return cost;
	}
	public void showItems(){
		for(Item aa : items){
			System.out.println("Item :" + aa.name());	
			System.out.println("Packing is: " + aa.packing().toString());
			System.out.println("price is " + aa.price());
			System.out.println();
		}
	}
}