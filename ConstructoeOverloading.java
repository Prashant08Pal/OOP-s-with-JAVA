package lectureEx;

public class ConstructoeOverloading {
	String name,program,clgname;
	int age ,id;
	
	static {
		System.out.println("this is static block");
	}
	
	
	
	
	ConstructoeOverloading()
	{
		System.out.println("this is defautl constructor ");
	}
	
	{
	System.out.println(	"this is init block");
	}
	ConstructoeOverloading(String n,int a)
	{
		System.out.println("this is paramaterized constructor");
		name=n;
		age=a;
	}
	
	ConstructoeOverloading( String n,String pg,String cl,int a ,int i)
	{
		System.out.println("this is more than  paramaterized constructor");
			name=n;
			age=a;
			program=pg;
			clgname=cl;
			age=a;
			id=i;

	}
 void showDetail()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(program);
		System.out.println(clgname);
		System.out.println(id);


	}
	public static void main(String[] args) {
		ConstructoeOverloading c = new ConstructoeOverloading();
		ConstructoeOverloading c1 = new ConstructoeOverloading("Tushar",20);
		ConstructoeOverloading c2 = new ConstructoeOverloading("MG","MCA","UPES",22,10012);
		c.showDetail();
		c1.showDetail();
		c2.showDetail();
		
	}

}

/* In this program my learning are:
 * init block run before the object creation 
 * 
 * 
 * 
 * */
