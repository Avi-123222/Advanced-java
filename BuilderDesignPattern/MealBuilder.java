public class MealBuilder{
	public Meal prepareVegMeal(){
		Meal m = new Meal();
		m.addItem(new VegBurger());
		m.addItem(new VegBurger());
		m.addItem(new Pepsi());
		return m;
	}
	public Meal prepareNonvegMeal(){
		Meal m = new Meal();
		m.addItem(new ChickenBurger());
		m.addItem(new ChickenBurger());
		m.addItem(new Cocacola());
		m.addItem(new Cocacola());
		return m;
	}
}