package exceptionalHandlingDemo;

import java.util.Scanner;

public class ExceptionB {

	public static void main(String[] args) {
				
				Scanner s= new Scanner(System.in);
				System.out.println("Enter the first number ");
				int i=s.nextInt();
				System.out.println("Enter the Second number  ");
				int j=s.nextInt();
		 
//	Perform all the arithmatic operation 	 
		 int z=i+j;
		System.out.println("sum="+z);
		try 
		{
		   int z1=i/j;
		   System.out.println("div="+z1);
		}
		catch(ArithmeticException r)
		{
			System.out.println("exception handle");
		}

		int z2=i*j;
		System.out.println("mul="+z2);
		 int z3=i-j;
		System.out.println("div="+z3);

			}

		

	}

//key learning from the above code :
//we use try block only we may think that it may exception code on this code .
// after catch is followed by try block .
// if you do not have any idea about which types of runtime error is occured then you include parent class i.e catch(ArithmeticException r)
