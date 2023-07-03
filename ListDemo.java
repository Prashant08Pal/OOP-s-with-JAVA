package guiProgramming;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo  implements ListSelectionListener {
	
	static JTextField tf;
	static JList js;
	
	

	public static void main(String[] args) {
 JFrame jf=new JFrame();
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 jf.setLayout(new FlowLayout());
 
 js=new JList();
 tf=new JTextField(10);
 String item[]= {"keyboad","cpu","mouse","cabinet","speaker","Modem","Pendrive","floopy disk","Joystick","mic","camera","stand",};
 js.setListData(item);
 js.setVisibleRowCount(5);
 js.addListSelectionListener(new ListDemo());
		
 jf.add(new JScrollPane(js));
 jf.add(new JLabel("Selected Items :"));
 jf.add(tf);
 jf.setSize(500,600);
 jf.setVisible(true);
 
 
		
	}



	public void valueChanged(ListSelectionEvent e) {
 Object o[]=js.getSelectedValues();
 StringBuffer sb=new StringBuffer();
 for(int i=0;i<o.length;i++)
 {
	 sb.append((String)o[i]);
	 sb.append(" ,");
 }
 tf.setText(sb.toString());
	}

}
