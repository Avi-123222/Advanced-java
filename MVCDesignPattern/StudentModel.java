public class StudentModel{
	private String name;
	private int roll;
	public StudentModel(){
		System.out.println("Object of Student is constructed");
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setRoll(int roll){
		this.roll = roll;
	}
	public int getRoll(){
		return roll;
	}
}