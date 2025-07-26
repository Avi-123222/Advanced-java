public class Demo{
	public static void main(String args[]){
		StudentModel model = retriveStudent();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,view);
		controller.update();
		view.display(model.getName(), model.getRoll());
		controller.setStudentName("Avishek Das");
		controller.update();
		view.display(model.getName(), model.getRoll());
	}
	private static StudentModel retriveStudent(){
		StudentModel sm = new StudentModel();
		sm.setName("Ajit Kumar");
		sm.setRoll(134);
		return sm;
	}
}