package inheritanceProgram;
class A{
	int x=10;
	
	void show()
	{
		System.out.println("show of Parent ");

	}
	
 static void disp()
{
		System.out.println("disp of parent  method ");

}
}

public class B extends A{
	int x=100;
	
	void show()
	{
		System.out.println("show of child ");

	}
	
	static void disp()
	{
			System.out.println("disp of child" ); 

	}
public class BindingRuntime {

	public static void main(String[] args) {
		 
		try {
		Class c=Class.forName(args[0]);
		Parent d=(Parent)c.newInstance();
		
		Parent d=new Derived();
		System.out.println(d.x);
		d.show();
		d.disp();
		}
			
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		
	}


