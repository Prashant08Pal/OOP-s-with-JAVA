package inheritanceProgram;
class HardDisk
{
	HardDisk(){
		System.out.println("hard is strong ");

	}
}

class Ram
{
	Ram(){
		System.out.println("ram is strong ");

	}
}
class Speaker
{
	void sp()
	{
			System.out.println("speaker is weak ");

	}
}

class Monitor 
{
	void mv()
	{
			System.out.println("monitor is weak ");

	}

}
public class Computer {
	Monitor monitor;
	HardDisk hardDisk;
	Speaker speaker;
	Ram ram;
	
	Computer()
	{
		monitor =new Monitor();
		hardDisk = new HardDisk();
		ram= new Ram();
		speaker=new Speaker();
		
	}
	

	public static void main(String[] args) {
		Computer c=new Computer();  
 c.speaker.sp();
	} 

}
