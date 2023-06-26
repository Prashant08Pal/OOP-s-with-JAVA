package thread;

public class SleepThread implements Runnable {
	
		public void run()
	{ 
			
		for (int i=1;i<=4;i++)
		{
			System.out.println("Thread :"+i);
		}
		try{
			Thread.sleep(5000);
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SleepThread a1=new SleepThread();
		Thread d1=new Thread(a1);
		Thread d2=new Thread(a1);

		Thread d3=new Thread(a1);

		d1.start();
		d2.start();
		d3.start();
	}

}
