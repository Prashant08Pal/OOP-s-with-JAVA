// CHECK THREAD IS ALIVE OR NOT 
package thread;

public class ThreadIsAlive extends Thread {

	public void run()
	{
				System.out.println("Thread is Running");
		
	}
	
	public static void main(String[] args) {
		ThreadIsAlive alv=new ThreadIsAlive();
		
		System.out.println("Thread isAlive "+alv.isAlive());
		alv.start();
		System.out.println("Thread isAlive "+alv.isAlive());

	}

}
