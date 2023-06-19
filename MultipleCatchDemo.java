package exceptionalHandlingDemo;

import java.util.Scanner;

public class MultipleCatchDemo {

		 public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number ");
		int i=s.nextInt();
		System.out.println("Enter the Second number  ");
		int j=s.nextInt();
 
 
		int z=i+j;
		System.out.println("sum="+z);
		try {
			int z1=i/j;
			System.out.println("div="+z1);
		}
		
		catch(ArrayIndexOutOfBoundsException r){
			System.out.println("ArrayIndexOutOfBounds");
		}
		catch(ArithmeticException r)
		{
	System.out.println("exception handle is one arithematic exception ");
		}
		catch(Exception r)
		{
			System.out.println(" i am in parent class of exception");
		}
			int z2=i*j;
			System.out.println("mul="+z2);
			int z3=i-j;
			System.out.println("div="+z3);
			
			System.out.println("rest of the code ");
	}
}


