package guiProgramming;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableDemo  implements ListSelectionListener {
	 static JTable jt;
	 static JTextField jtf;

	public static void main(String[] args) {
 jtf=new JTextField(10);
 JFrame jf=new JFrame();
 jf.setLayout(new FlowLayout());
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 String column[]={"name","age","id"};
 String data [][]= {{"ram","20","1001"},{"Akarsh","25","2001"},{"Alok","24","3001"}};
 
 jt=new JTable(data,column);
 ListSelectionModel m=jt.getSelectionModel();
 m.addListSelectionListener(new TableDemo());
 jf.add(jtf);
 jf.add(new JScrollPane(jt));
 jf.setSize(400,400);
 jf.setVisible(true);
 jt.setCellSelectionEnabled(true);
	}

	public void valueChanged(ListSelectionEvent e) {
 int r=jt.getSelectedRow();
 int c=jt.getSelectedColumn();
 Object o=jt.getValueAt(r, c);
 jtf.setText(o.toString() );
	}

}
