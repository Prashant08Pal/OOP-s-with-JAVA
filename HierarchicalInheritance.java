package inheritance;


class Base2{
	void show()
	{
		System.out.println("");

	}
}
class Derived3 extends Base2
{
	void showInfo()
	{
		System.out.println(" i am in the derived1 class and inheriting property of base2");
	}
}
class Derived4 extends Base2
{
	void run()
	{
		System.out.println(" i am in the derived 2 class and inheriting property of base2");
	}
}




public class HierarchicalInheritance {

	public static void main(String[] args) {
		Derived4 dr=new Derived4();
		dr.run();
		
		
	}

}
