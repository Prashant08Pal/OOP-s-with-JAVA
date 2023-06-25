//TO CREATE A MULTIPLE THREAD


package thread;

public class MultipleThread  implements Runnable{
	public void run()
	{
		System.out.println("my name is prashant lengend entrepreneur Prashant pal");
		System.out.println(Thread.currentThread().threadId()+"is running");
	}

	public static void main(String[] args) {
		MultipleThread a=new MultipleThread();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
