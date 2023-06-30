package initBlockDemo;

public class InitBlock {
	
	
	
	{
		System.out.println("init block ");
	}
	InitBlock()
	{
		System.out.println("this is constructor ");

	}
	

	public static void main(String[] args) {
		InitBlock ib=new InitBlock();
	}

}
