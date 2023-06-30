package initBlockDemo;

public class StaticInitBlock {
	

	{
		System.out.println("init block ");
	}
	static
	{
		System.out.println("this is static init block  ");

	}
	StaticInitBlock()
	{
		System.out.println(" i am in constructor ");
	}
void 	show()
	{
	System.out.println(" i am in show method  ");

	}
	

	public static void main(String[] args) {
		StaticInitBlock sb=new StaticInitBlock();
		sb.show();
	}

}
