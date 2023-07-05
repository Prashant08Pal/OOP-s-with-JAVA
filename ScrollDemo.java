package guiProgramming;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ScrollDemo {

	public static void main(String[] args) {
 JFrame jf=new JFrame();
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel jp=new JPanel();
 jp.setLayout(new GridLayout(10,3));
 JButton jb[]=new JButton[300];
 for(int i=0;i<300;i++) {
	 jb[i]=new JButton ("Button"+i);
	 jp.add(jb[i]);
 }
 JScrollPane sp=new JScrollPane(jp);
 jf.add(sp);
 jf.setSize(300,300);
 jf.setVisible(true);
	}

}
