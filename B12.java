package inheritanceProgram;
class k1
{
	k1()
	{
		System.out.println("k1 constructor ");

	}
	
	k1(int x)
	{
		this();
		System.out.println(x);

	}
	
	
}
class L1 extends k1
{
	L1(int x)
	{
		this();
		System.out.println("L1  parameterized constructor "+""+x);
	}
	L1()
	{
		this(34,6);
		System.out.println("L1 constructor ");
	}
	L1(int x ,int y)

	{
		super(25);
		System.out.println("L1 parameterized constructorwith 2 pm "+""+y);
		System.out.println("L1  parameterized constructor "+""+x);

	}
}
public class B12 extends L1{
	B12()
	{
		super(22);
		System.out.println("default constructor ");
	}

	public static void main(String[] args) {
			new B12();
	}

}
