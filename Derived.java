package inheritanceProgram;
class Parent{
	int x=10;
	
	void show()
	{
		System.out.println("this is parents class method ");

	}
	
 static void disp()
{
		System.out.println("this is parents class   static method ");

}
}

public class Derived extends Parent{
	int x=100;
	
	void show()
	{
		System.out.println("this is child  class method ");

	}
	
	static void disp()
	{
			System.out.println("this is child class static method "); 

	}

	public static void main(String[] args) {
		Parent p=new Derived();
		System.out.println(p.x);
		p.show();
		p.disp();
	}

}




///* key learning from the above program   24.04.2023
// *  data memeber are statically bind at compile time 
// things which are statiscally bind :-
// */ data member, static method, private method,final method,constructor,inintializer,method call via a super keyword 
// // things which are statiscally bind :-
//non -static method 

//
//*/