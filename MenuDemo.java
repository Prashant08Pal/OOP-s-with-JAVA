package guiProgramming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuDemo  implements ActionListener{

	public static void main(String[] args) {
 JFrame jf=new JFrame();
 jf.setTitle("Notepad");
 jf.setSize(600,600);
 jf.setVisible(true);
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 JTextArea txt=new JTextArea();
 
 
 JMenuBar mb=new  JMenuBar();
 
 JMenu file =new JMenu("File");
 JMenu edit =new JMenu("Edit");
 
 mb.add(file);
 mb.add(edit);
 
 JMenuItem nw=new JMenuItem("new");
 JMenuItem open=new JMenuItem("open");
 
 
 MenuDemo md=new MenuDemo();
 nw.addActionListener(md);
 
 JMenuItem save=new JMenuItem("Save");
 JMenuItem exit=new JMenuItem("exit");
 
 


 exit.addActionListener(md);
 
 
 
 JMenu sm=new JMenu("others");
 sm.add(new JMenuItem("a"));
 sm.add(new JMenuItem("b"));
 sm.add(new JMenuItem("c"));


 
 file.add(nw);
 file.add(open);
 file.add(save);
 file.addSeparator();
 

 file.add(exit);
 file.addSeparator();
 file.add(sm);
 jf.setJMenuBar(mb);
 jf.add(new JScrollPane(txt));
 
 
 
	}

	public void actionPerformed(ActionEvent e) {
 String click=e.getActionCommand();
 if(click.equals("exit"));
 System.exit(0);
 else
 {
	 try
	 {
		 RunTime rt=Runtime.getRuntime();
		 MenuDemo.main(null);
		 
	 }catch(Exception e) {
		 
	 }
 }
 
	}

  		
	

}
