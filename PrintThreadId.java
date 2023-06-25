package thread;

public class PrintThreadId implements Runnable {
	public void run()
	{
		System.out.println(Thread.currentThread().threadId());
	}

	public static void main(String[] args) {
		PrintThreadId p=new PrintThreadId();
		Thread t1=new Thread(p);
		t1.start();
	}

}
