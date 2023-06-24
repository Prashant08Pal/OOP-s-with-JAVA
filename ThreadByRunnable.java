package thread;

public class ThreadByRunnable implements Runnable {
	public void run() {
		int x=16;
		for(int i=1;i<=10;i++)
		{
			System.out.println(x*i);
		}
	}

	public static void main(String[] args) {
		ThreadByRunnable tr=new ThreadByRunnable();
		Thread t1=new Thread(tr);
		
		t1.start();
		
	}

}
