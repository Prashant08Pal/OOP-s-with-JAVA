//java program to handle a generated exception
package exceptionalHandlingDemo;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {
	try {	
		int a =10;
		int b=0;
		int c;
		c=a/b;
		System.out.println("division is :"+c);
		}catch(Exception e)
				{
					System.out.println("exception is handled ");
				}
	System.out.println(" program is finished ");
	}
}

