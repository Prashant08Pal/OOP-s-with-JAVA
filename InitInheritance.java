package initBlockDemo;

class A
{
	int num=8;
	{
		System.out.println("A : INIT Called ");
	}
	
	
	A()
	{
		System.out.println("A : CONSTRUCTOR Called ");

	}
}

class B extends A
{
	{
		System.out.println("B : INIT Called ");

	}
	B(){
		System.out.println("B : CONSTRUCTOR Called ");

	}
}




public class InitInheritance {

	public static void main(String[] args) {
 B obj=new B();
 
	}

}
