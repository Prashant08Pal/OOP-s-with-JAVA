package guiProgramming;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui  extends Frame implements ActionListener{
	
	
	Frame f;
	Button b,b1;
	TextField tf;
	
	

	public MainGui(String string) {
		
		super(string);
	
		this.setVisible(true);
		this.setSize(400,500);
		this.setLocation(25,50);
		this.setLayout(new FlowLayout());
		b=new Button("OK");
		this.add(b);
	
		b1=new Button("Cancel");
		this.add(b1);
		
		tf=new TextField(10);
		this.add(tf);
		
		//tf2=new TextField(10);
		//this.add(tf2);

		
		OuterClassGui og=new OuterClassGui(this);
		b.addActionListener(og);
		b1.addActionListener(og);
	

		}

	public static void main(String[] args) {
 
		
		MainGui mg=new MainGui("Presentation Logic");

		
		}

	 

}
