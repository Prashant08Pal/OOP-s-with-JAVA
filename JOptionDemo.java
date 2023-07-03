package guiProgramming;
import javax.swing.*;

public class JOptionDemo {

	public static void main(String[] args) {
 String str=JOptionPane.showInputDialog(null,"enter your name");
 if(str!=null) {
	 JOptionPane.showMessageDialog(null,"your name is : "+str);
	 int i=JOptionPane.showConfirmDialog(null,"Swing is better than AWT ?");
	 if (i==JOptionPane.YES_OPTION)
		 JOptionPane.showMessageDialog(null,"you are Right ");
	 else if(i==JOptionPane.NO_OPTION)
	 JOptionPane.showMessageDialog(null,"you are wrong just revise the concept again ");
	 else
		 JOptionPane.showMessageDialog(null,"You are here for learning just main the pace of learninhg ");
	 }
 else
	 JOptionPane.showMessageDialog(null,"you pressed cancel button ");
	 
	}

}
