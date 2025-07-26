import java.util.ArrayList;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;

class Emp{
	int empid;	
	String empname;
	double sal;   
	String pos;
	@Override
	public String toString(){
		return "Emp id:     " + empid + "Emp name:      " + empname + "Salary:     " + sal + "Designation is:     " + pos;
	}
	public Emp(int empid, String empname, double sal, String pos){
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
		this.pos = pos;
	}
}
public class Demo3{
	static ArrayList aa = new ArrayList();
		public static void main(String args[])throws IOException {
		while(true) {
			System.out.println("**********See the Demo of Dynamic Array.*********");
			System.out.println("*********See the Option.**************")	;
			System.out.println("1>Add the element in dynamic Array.");
			System.out.println("2>Retrive the elements from dynamic Array.");
			System.out.println("3>Delete an element from dynamic array.");
			System.out.println("4>Update name in the dynamic array.");
			System.out.println("5>Quit.");
			System.out.println("Enter your choice.");
			int ch = get() ;
			switch(ch) {
				case 1:
					addItem();
					break;
				case 2:
					retrieve();
					break;
				case 3:
					delete();
					break;
				case 4:
					update();
					break;	 
				case 5:
					System.out.println("Thank u for using my application.");
					System.exit(0);
					break;
				default:
					System.out.println("*Invalid Choice.*");
					break;
				}
			}
		}
		public static int get(){
			return new Scanner(System.in).nextInt();
		}
		public static void addItem()throws IOException{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the EMP id");
			int id = Integer.parseInt(dis.readLine());
			System.out.println("Enter emp name");
			String name = dis.readLine();
			System.out.println("Enter salary");
			double sal = Double.parseDouble(dis.readLine());
			System.out.println("Enter Designation");
			String pos = dis.readLine();
			Emp ee1 = new Emp(id,name,sal,pos);
			aa.add(ee1);
		}
		public static void retrieve(){
			System.out.println("See the data of dyanamic array");
			for(int i = 0; i < aa.size(); i++){
				Emp kk = (Emp)aa.get(i);
				System.out.println(kk);
			}
		}
		public static void delete(){
			System.out.println("Enter the emp id whom u delete");
			int id = get();
			for(int i = 0; i < aa.size(); i++){
				Emp jj = (Emp)aa.get(i);
				if(jj.empid == id) {

					System.out.println("Employee is deleted.");
					Emp ll = (Emp)aa.remove(i);
					System.out.println(ll);
				}
				


			}
		}
				
		public static void update(){
			System.out.println("Enter thr emp id whom u update");
			int id = get();
			for(int i = 0; i < aa.size(); i++){
				Emp jj = (Emp)aa.get(i);
				if(jj.empid == id){
					System.out.println("Employee name is updated");
					System.out.println("Enter the employee name");
					Scanner ss = new Scanner(System.in);
					jj.empname = ss.nextLine();
				}
			}
		}
	
}	
			
			
			
			
			
			
			 

	
