// by abstracting frame class 
package guiProgramming;

//import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class GuiAbs {
	// identify the components which you want display over the frame
	
	
	
	Frame f;
	Button b1,b2;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	
	
	
	GuiAbs(String title)
	{
		//super(title);
		f=new Frame(title);
	

	f.setVisible(true);
	f.setSize(400,400);
	f.setLocation(400, 400);
	//f.setResizable(false);
	f.setBackground(Color.ORANGE);
	
	// button object 
	b1=new Button("ADD(+)");
	b2=new Button("SUBSTRACTION (-)");
	l1=new Label("Enter First number ");
	l2=new Label("Enter Second number ");
	l3=new Label("Result");
	tf1=new TextField(10);
	tf2=new TextField(10);

	tf3=new TextField(10);



	//f.setLayout(new FlowLayout());
	f.add(l1);
	f.add(tf1);
	f.add(l1);
	f.add(tf2);
	f.add(l3);
	f.add(tf3);
	f.add(b1);
	f.add(b2);
	
	f.setLayout(null);
	l1.setBackground(Color.CYAN);
	l1.setBounds(100, 100, 100, 50);
	tf1.setBounds(160, 100, 100, 50);


	
	
	}	
	public static void main(String[] args) {
 //f=new Frame("abstraction");
		GuiAbs g=new GuiAbs("practive Gui");
		
	}

}
