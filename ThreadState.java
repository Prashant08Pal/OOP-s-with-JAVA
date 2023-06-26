package thread;

public class ThreadState extends Thread{
	public void run()
	{
		try
		{
		Thread.State  ts = Thread.currentThread().getState();
		System.out.println(ts);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		ThreadState t1=new ThreadState();
		ThreadState t2=new ThreadState();
		ThreadState t3=new ThreadState();

		
		
		t1.start();
		 t2.start();
		 t3.start();

		
	}

}
