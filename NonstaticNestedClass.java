package nestedClassDemo;

public class NonstaticNestedClass {
int x=10;
static int y=20;

class B  //Non static nested class
{
	int p=30;
	void show() 
	{
		System.out.println(x);
		System.out.println(y);

		
	}
}
	public static void main(String[] args) {
		NonstaticNestedClass a=new NonstaticNestedClass();
 B b=a.new B();
 System.out.println(b.p);
 b.show();
 
 
	}

}
