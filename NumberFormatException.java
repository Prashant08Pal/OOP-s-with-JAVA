package exceptionalHandlingDemo;

public class NumberFormatException {
public static void main(String[] args){
		
	try {

			 String s="Prashant Pal";
			 int num= Integer.parseInt(s);
			 System.out.println("number format exception is handled ");
			}
		catch (Exception e)
			{
				System.out.println(e);
			}
			}
	}



/*  key learning from the program 
 *  int num= Integer.parseInt(s);
how to convert string into num 
 */

*/