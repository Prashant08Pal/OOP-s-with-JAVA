package inheritanceProgram;

class k
{
	k()
	{
		System.out.println("k cons");
	}
}
class L extends k
{
	L()
	{
		System.out.println("L cons");

	}
	
}
public class B1  extends L
{
	B1()
	{
		System.out.println("B1 cons");

	}

	public static void main(String[] args) 
	{
				new B1();
	}
}







/*  key learning video no 84
 * before executing any child class constructor firstly 
 * execute its immediate parent default class constructor .
 * 
 * how ----> during compilation compiler add super keyword in every default
 * constructor .
 * 
 * why ----> in order to initialized the parent  data member 
 * 
 */

*/