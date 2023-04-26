// static  block  222 feb 2023 

package lectureEx;

public class StaticBlock {
	
	StaticBlock()
	{
		System.out.println("i am in the  default constructor");
	}
	
	static {
		System.out.println("i am in the block is invoked");

	}
	public static void main(String[] args) {
		
		System.out.println("java  main classs method hello ");
		
		StaticBlock a=new StaticBlock();
 
	}

}


/////learning from this program 
/*first static block will be call
 * main method is call
 * constructor call */
