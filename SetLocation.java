package guiProgramming;

import java.awt.Button;
import java.awt.Frame;

class GuiApps extends Frame 
{

	public GuiApps (String title) {
		
	super(title);
	this.setVisible(true);
	this.setSize(400,400);
	//this.setLocation(200,200);
	//System.out.println(getLocation());
	Button b=new Button("Click me");
	add(b);
	setLayout(null);
		
 	}
	
}

public class SetLocation {

	public static void main(String[] args) {
		GuiApps a1=new GuiApps("set Location ");
	}

}
