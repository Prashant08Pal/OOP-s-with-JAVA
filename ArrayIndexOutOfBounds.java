package exceptionalHandlingDemo;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		try {
			int a[]=new int[10];
			a[10]=8;
			System.out.println("array : "+a[10]);
	}catch(Exception e)
		{
		System.out.println("exception is handled ");
		}
	}
}
