package guiProgramming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButtonDemo  implements ActionListener {
	static JButton b1,b2;
	static ImageIcon img1,img2;
	boolean check=false; 

	public static void main(String[] args) {
	
		img1=new ImageIcon("java1.jpg");
		img2=new ImageIcon("java3.jpg"); 
	
	
	
	//JButton b1=new JButton("ok");
	//JButton b1=new JButton("ok",img1);
	
	
	b1=new JButton(img1);
	b2=new JButton("change Image");
	b2.addActionListener(new ImageButtonDemo());
	
	
	JFrame fr=new JFrame();
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.setLayout(new FlowLayout());
	
	
	
	fr.add(b1);
	fr.add(b2);
	fr.setSize(500,300);
	fr.setVisible(true);

	
	
	

 
	}

	public void actionPerformed(ActionEvent e) {
 		if(check==false)
 		{
 			b1.setIcon(img2);
 			check=true;
 			
 		}else
 		{
 			b1.setIcon(img1);
 			check=false;
 		}
	}
 

}
