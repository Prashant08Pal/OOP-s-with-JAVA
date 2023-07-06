package nestedClassDemo;

public class NonstaticNestedClass {
int x=10;
static int y=20;

class B
{
	int p=30;
	void show() 
	{
		System.out.println(x);
		System.out.println(y);

		
	}
}
	public static void main(String[] args) {
 A a=new A();
 B a=a.new B();
 System.out.println(b.p);
 b.show();
 
 
	}

}
