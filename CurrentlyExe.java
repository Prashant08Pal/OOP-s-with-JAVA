package thread;

public class CurrentlyExe extends Thread {
public void run()
{
	System.out.println(Thread.currentThread());
}
	public static void main(String[] args) {
		CurrentlyExe e1=new CurrentlyExe();
		CurrentlyExe e2=new CurrentlyExe();

		CurrentlyExe e3=new CurrentlyExe();
		
		
		e1.setName("ABHAY");
		e2.setName("SHOBHIT");
		e3.setName("TANU ");
		
		e1.setPriority(1);
		e2.setPriority(2);
		e3.setPriority(3);
		
		e1.start();
		e2.start();
		e3.start();
	}

}
