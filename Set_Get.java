package thread;

public class Set_Get extends Thread {

	public void run()
	{
			System.out.println(Thread.currentThread().threadId());
	}

	public static void main(String[] args) {
 Thread t1=new Thread();
 Thread t2=new Thread();
 Thread t3=new Thread();
 
 t1.setName("Prashant MG");
 t2.setName("ANSH PAL SINGH ");
 t3.setName("ALOK KANUJIYA ");
 
 System.out.println("Thread1 name: "+t1.getName());
 System.out.println("Priority of thread : "+t1.getPriority());
 
 System.out.println("Thread1 name: "+t2.getName());
 System.out.println("Priority of thread : "+t2.getPriority());

System.out.println("Thread1 name: "+t3.getName());
System.out.println("Priority of thread : "+t3.getPriority());

t1.start();
 t2.start();
 t3.start();

	}

}
