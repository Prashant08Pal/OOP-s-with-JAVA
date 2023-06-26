package thread;

public class ThreadSuspend  implements Runnable{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		sleep(500);
	}

	public static void main(String[] args) {
		ThreadSuspend ts1=new ThreadSuspend();
		Thread g1=new Thread(ts1);
		Thread g2=new Thread(ts1);
		Thread g3=new Thread(ts1);


		g1.start();
		g2.start();

		g3.start();
		
	}

}
