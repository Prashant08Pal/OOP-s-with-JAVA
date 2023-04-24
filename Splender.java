package inheritanceProgram;

class Vehicle
{
	void run()
	{
		System.out.println("vehicle is running ");
	}
}
class Bike extends Vehicle
{
	void run()
	
	{
		super.run();
		System.out.println("bike  is running");

	}
}
public class Splender extends Bike
{
	void run()
{
		super.run();
		System.out.println("splender is running");
}


	public static void main(String[] args) {
		Splender s= new Splender();
		s.run();
	}

}
