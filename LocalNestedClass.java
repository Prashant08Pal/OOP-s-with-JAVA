package nestedClassDemo;

public class LocalNestedClass {
	
	int x=10;     //variable
	static int y=20;			//variable 
	
	void display()   //method
	{
		final int z=56;
	
	class Inner					//Local nested class are made inside method ,constructor,block
	{
		void show()
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}

	Inner i=new Inner();
	System.out.println("display");
	i.show();
}

	public static void main(String[] args) {
		LocalNestedClass o=new LocalNestedClass();
		o.display();
		
	}

}
