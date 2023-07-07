package nestedClassDemo;

public class Outer
{
	int x=10;
	static int y=20;
	
	
	
	static class Inner{
		int p=30;
		static int r =40;
		
		void show()
		{
			System.out.println(y);

			System.out.println("show ");
		}
	static void disp()
 {
		System.out.println("disp");
 
 }

	}
	
	public static void main(String[] args) {
		Outer o=new Outer();
		System.out.println(o.x);
		
		//Inner i=new Inner();
		
		//System.out.println(i.p);

		Outer.Inner oi=new Outer.Inner();
		oi.show();
		oi.disp();
	}

}
