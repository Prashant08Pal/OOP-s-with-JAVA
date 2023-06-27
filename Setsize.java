package guiProgramming;

import java.awt.Frame;

class Gui extends Frame 
{

	public Gui(String title) 
	{
		super(title);
		this.setVisible(true);
		this.setSize(200,500);
		
		
 	}

}


public class Setsize {

	public static void main(String[] args) {
		Gui d1=new Gui("setSize");
	}

}
