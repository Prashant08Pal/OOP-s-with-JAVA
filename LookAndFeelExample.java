package guiProgramming;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
public class LookAndFeelExample {

	public static void main(String[] args) {
 try {
	 //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotiflookAndFeel");
	 JButton b=new JButton("SWING BUTTON");
	 JCheckBox ck=new JCheckBox("Swing...");
	 JLabel lb=new JLabel("This is swing Label..");
	 JTextField tf=new JTextField(10);
	 JFrame fr=new JFrame();
	
	 
	 
	// fr.setDefaultCloseOpeartion(JFrame.EXIT_ON_CLOSE);
	 fr.setLayout(new FlowLayout());
	 fr.add(b);
	 fr.add(lb);
	 fr.add(tf);
	 fr.add(ck);
	 fr.setSize(300,300);
	 fr.setVisible(true);

	 
 }catch(Exception e)
 {
	 e.printStackTrace();
 }
		
		
		
		
		
	}

}
