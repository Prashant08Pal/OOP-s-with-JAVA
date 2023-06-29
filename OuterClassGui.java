//BUSINESS LOGIC 

package guiProgramming;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClassGui implements ActionListener {
	MainGui mg;
	
	
	public OuterClassGui(MainGui mg) {
		
		this.mg=mg;
 	}

	public static void main(String[] args) {
 
	}

	public void actionPerformed(ActionEvent e) {
		
		System.out.println(" why made this file separate ?  to avoid complexity  we made two file one is for presentaion logic and "
				+ " one for busines logic");
		
		Button btn=(Button)e.getSource();		
		if(btn==mg.b)
		{
			mg.tf.setText("MG");
	 
		}
		else
		{
			mg.tf.setText("  ");
		}
 
 
 
 
	}

}
