package exceptionalHandlingDemo;

public class MultipleExceptiondemo {

	public static void main(String[] args) {
 try {
	 int a=10/0;
	 
 }catch (ArithmeticException e)
 {
	 System.out.println(e);
 }
	try {
		int a[]=new int[25];
		a[25]=800;
	}catch(ArrayIndexOutOfBoundsException e)
	{
		 System.out.println(e);

	}
	
	try {
		String s=null;
		int len=s.length();
		System.out.println(len);
	}catch(NullPointerException e)
	{
		 System.out.println(e);

	}
	
	
	}

}
