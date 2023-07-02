package guiProgramming;
import javax.swing.*;
public class Menu1 {
	
	

	public static void main(String[] args) {
		JFrame jf=new JFrame();
		 jf.setTitle("My NOTE  PAD");
		 jf.setSize(300,300);
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 JTextArea txt=new JTextArea(); 

		
		 
		 JMenuBar mb1=new  JMenuBar();
		 
		 JMenu fl =new JMenu("File");
		 JMenu et =new JMenu("Edit");
		 mb1.add(fl);
		 mb1.add(et);
		 
		 
		 jf.setJMenuBar(mb1);
		 
		 

	}

}
