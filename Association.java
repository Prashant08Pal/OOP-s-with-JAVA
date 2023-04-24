package inheritanceProgram;

public class Association {
	String name;
	int age;
	Address adr;  //aggregation (weak relation )
	
	Association(String name,int age,Address adr)
	{
		this.name=name;
		this.age=age;
		this.adr=adr;
	}
	
	void show()
	{
		System.out.println();
		System.out.println(name);
		System.out.println(age);
		System.out.println(adr.city);
		System.out.println(adr.state);
		System.out.println(adr.country);
	}

	public static void main(String[] args) {
	//	new Address(); //composition---------> (strong relation)
	//	Address adr=new Address(); //association 

		Association a=new Association("Prashant",22,new Address("lucknow","UP","india"));
		a.show();
	}

}
class Address{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}







/* key learning from this program  (66)
new Address -----> composition
Address adr------>aggregation 
	Address adr=new Address();   ------->       //association */


