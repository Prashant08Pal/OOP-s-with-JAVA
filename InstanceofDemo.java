package inheritanceProgram;
class AA
{
	
}
public class InstanceofDemo {

	public static void main(String[] args) {
		InstanceofDemo d=new InstanceofDemo();
		InstanceofDemo d1=null;
		System.out.println(d instanceof InstanceofDemo);
		System.out.println(d instanceof Object);
		System.out.println(d1 instanceof InstanceofDemo);
		AA a=new AA();
		
		System.out.println(a instanceof Object);
		System.out.println(a instanceof AA);



	}

}
