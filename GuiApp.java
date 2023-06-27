package guiProgramming;

import java.awt.Frame;

public class GuiApp  extends Frame{

	public GuiApp(String title) {
		super(title);
		
	this.setVisible(true);
	//this.setSize(200, 600);
 	}

	public static void main(String[] args) {
		GuiApp g=new GuiApp("FirstGUI");
	}

}
