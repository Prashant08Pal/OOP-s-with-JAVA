//GET THREAD PRIORITY 
package thread;

public class GetPriority  implements Runnable{
	synchronized public void run()
	{
		System.out.println("my name is Lengend Entrepreneur Prashant pal");
		System.out.println(Thread.currentThread().threadId()+"is running");
	}

	public static void main(String[] args) {
		GetPriority gp=new GetPriority();
			Thread t1=new Thread(gp);
			Thread t2=new Thread(gp);
			Thread t3=new Thread(gp);
			
			
			 System.out.println("Priority of thread1 : "+t1.getPriority());
			 System.out.println("Priority of thread 2: "+t2.getPriority());
			 System.out.println("Priority of thread3 : "+t3.getPriority());

			
			
			
			t1.start();
			t2.start();
			t3.start();
	}

}


 
