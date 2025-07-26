public class Demo{
	public static void main(String ards[]){
		MealBuilder mb = new MealBuilder();
		Meal veg = mb.prepareVegMeal();
		System.out.println("Bill of the veg Item is: ");
		veg.showItems();
		System.out.println("Final bill is :  "+ veg.getCost());
		
		Meal nonveg = mb.prepareNonvegMeal();
		System.out.println("Bill of the Non-veg Item is: ");
		nonveg.showItems();
		System.out.println("Final bill is :  "+ nonveg.getCost());
	
	}
}