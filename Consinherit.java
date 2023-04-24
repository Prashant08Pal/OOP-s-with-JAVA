package inheritanceProgram;
class A
{
	A()
	{
	System.out.println("A constructor is calling ");	
	}
}

class B extends A
{
	B(int x)
	{
		System.out.println(x);	
	}
	
	B()
	{		
		System.out.println("b constructor is calling ");	
	}
}
public class Consinherit extends B
{
	
	Consinherit()
	{
		//super(22);
		System.out.println("Consinherit constructor is calling ");	
	}
	public static void main(String[] args){
	new Consinherit();
	}
}


//
///* key learning from the above program is 
// * when during constructor calling in 
// * inheritance we pass parameterized constructor
// * cons. so in order to run we have to pass a parameter 
// * in super keyword so that 
// */
//
//*/