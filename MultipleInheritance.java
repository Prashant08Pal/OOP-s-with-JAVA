package inheritance;

class Base1
{
	void run() {
	System.out.println("i am in base 1 class ");}
}

class Derived1 extends Base1
{
	void disp() {
	System.out.println("i am in derived1 class ");
	}
}

class Derived2 extends Derived1
{
	void show() {
	System.out.println("i am in derived2 class ");}
}


public class MultipleInheritance {

	public static void main(String[] args) {
		Derived2 obj=new Derived2();
		obj.run();
		obj.disp();
		obj.show();
		
	}

}
