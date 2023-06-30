package initBlockDemo;

public class MultibleInit {
	
	int x=20;
	
	{
		System.out.println("IB1");
	}
	
	{
		System.out.println("IB2");

	}
	MultibleInit()
	{
		System.out.println("constructor1");
	}
	MultibleInit(int x)
	{
		System.out.println("constructor2    "+ x);

	}
	{
		System.out.println("IB3");

	}

	public static void main(String[] args) {
		MultibleInit mib=new MultibleInit();
		MultibleInit mib1=new MultibleInit(8);

	}

}
