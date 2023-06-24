package thread;

public class ThreadExClass extends Thread{
	public ThreadExClass(String string) {
		System.out.println(string);
 	}

	public void run()
	{
		int x=5;
		for(int i=1;i<=20;i++) {
			int y=x*i;
			System.out.println(y);
		}
			
	}

	public static void main(String[] args) {
		ThreadExClass t1=new ThreadExClass("MG");
		t1.start();
	}

}
