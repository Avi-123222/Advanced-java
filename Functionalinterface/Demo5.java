import java.awt.*;
import java.awt.event.*;



public class Demo5 extends Frame{
	Button b1, b2, b3;
	public Demo5(String title){
		ActionListener al = (ae) -> 
				{
					Button bb = (Button) ae.getSource();
					if(bb == b1){
						setBackground(Color.red);
					}
					else if(bb == b2){
						setBackground(Color.green);
					}
					else{
						setBackground(Color.blue);
					}
				};
				b1 = new Button("Red");
				b2 = new Button("Green");
				b3 = new Button("Blue");
				setLayout(new FlowLayout());
				b1.addActionListener(al);
				b2.addActionListener(al);
				b3.addActionListener(al);
				add(b1);
				add(b2);				
				add(b3);
				setSize(400,400);
				setVisible(true);
				addWindowListener(new WindowAdapter(){
					@Override
					public void windowClosing(WindowEvent we){
						System.exit(0);
					}
				});
		}
	public static void main(String args[]){
		new Demo5("Lambda Expression");
		}
	}
	



						




































