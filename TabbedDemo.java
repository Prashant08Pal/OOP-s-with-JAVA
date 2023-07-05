package guiProgramming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedDemo {

	public static void main(String[] args) {
 JFrame jf=new JFrame();
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 JTabbedPane jtp=new JTabbedPane();
 
 JPanel tab1=new JPanel();
JButton jn1=new JButton("red");
JButton jn2=new JButton("white");
JButton jn3=new JButton("blue");

tab1.add(jn1);
tab1.add(jn2);
tab1.add(jn3);

JPanel tab2=new JPanel();


JButton jn11=new JButton("india");
JButton jn22=new JButton("aus");
JButton jn33=new JButton("japan");

tab2.add(jn11);
tab2.add(jn22);
tab2.add(jn33);


//JPanel tab3=new JPanel();
jtp.addTab("color",tab1);
jtp.addTab("cities",tab2);

jf.add(jtp);
jf.setSize(300,300);
jf.setVisible(true);


	}

}
