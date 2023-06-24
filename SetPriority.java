package thread;

public class SetPriority implements Runnable {
	
	
	public void run()
	{
		// System.out.println( Thread.currentThread().threadId());
	}

	public static void main(String[] args) {
		//OBJECT CREATION OF RUNNABLE INTERFACE 
		SetPriority sp=new SetPriority();
		Thread t1=new Thread(sp);
		Thread t2=new Thread(sp);
		Thread t3=new Thread(sp);
		
// set priority of a thread	
		t1.setPriority(3);
		t2.setPriority(2);
		t3.setPriority(1);
		
		
	//get priority of a thread	
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

		
		
		//invoke thread
		t1.start();
		t2.start();
		t3.start();
	}

}
