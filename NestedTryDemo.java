package exceptionalHandlingDemo;

public class NestedTryDemo {

	public static void main(String[] args) {
 //OUTER TRY
		try {
			//ARRAY INDEX OUT OF BOUND
				try {
					int a[]=new int[25];
					 a[26]=100;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBound error is handled "+e);
				}
		
				try {
					int div=5/0;
					}
				catch(ArithmeticException e) 
				{
					System.out.println(" ArithmaticException is handled :"+e);
				}
		}catch(Exception e)
		{
			System.out.println("Outer catch to handle other exception ");
		}
	}

}
