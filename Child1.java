package inheritanceProgram;
class Base2
{
	void show()
	{
		System.out.println("show of Base1");
	}
}

public class Child1 extends Base2{
	
	void show()
	{
		System.out.println("show of child1");
	}

	public static void main(String[] args) {
	Base2 c = new Child1();
		c.show();
	}

}



// key learning 
// this program belong to  run time polymorphism 
// in THis scenerio method call parent Class 
//  but execute child Class.
//
//

