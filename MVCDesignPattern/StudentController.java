public class StudentController{
	private StudentModel model;
	private StudentView view;
	public StudentController(StudentModel model, StudentView view){
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String s){
		model.setName(s);
	}
	public String getStudentName(){
		return model.getName();
	}
	public void setStudentRoll(int r){
		model.setRoll(r);
	}
	public int getStudentRoll(){
		return model.getRoll();
	}
	public void update(){
		view.display(model.getName(),model.getRoll());
	}
}
	