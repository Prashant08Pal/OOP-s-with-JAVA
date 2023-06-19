/**
 * 
 */
package exceptionalHandlingDemo;

import java.util.Scanner;


public class NestedCatchdemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int i=s.nextInt();
		System.out.println("enter the Second number");
		int j=s.nextInt(); 
		
		int z=i+j;
		System.out.println("SUM"+z);
		try
		{
		int z1=i/j;
		System.out.println("DIV"+z1);
		}
		catch(Exception hathi)
		{
			if(hathi instanceof NullPointerException)
			System.out.println("exception is handled NullPointerException ");
			else if (hathi instanceof ArithmeticException)
			System.out.println("exception is handled in ArithmeticException ");

		}
		finally{
			System.out.println("exception is handled ");
		}
		
		int z2=i*j;
		System.out.println("Mul"+z2);
		int z3=i-j;
		System.out.println("Subs"+z3);
		try {
			int z4=i%j;
			System.out.println("Rem"+z4);
		}catch(ArithmeticException r) {
		System.out.println("module exception comes under ArithmeticException ");
		}


	}


}
