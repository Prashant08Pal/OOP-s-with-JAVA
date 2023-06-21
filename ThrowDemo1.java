package exceptionalHandlingDemo;

public class ThrowDemo1 {
	int age;
	public void validate (int age){
		this.age=age;
	if(age<18) {
try {
	throw new ArithmeticException ("invalid age");
	
}catch(Exception e)
{
	System.out.println(e);
}
	}
	else {
		System.out.println("valid age go for voting ");
	}
	}
	public static void main(String[] args) {
  
		ThrowDemo1 t=new ThrowDemo1();
		t.validate(17);
 
	}

}
