//JAVA PROGRAM TO SET AND PRINT THREAD NAME
package thread;

public class SetThreadName {

	public static void main(String[] args) {
		String Prashant;
		Thread thrd1=new Thread("Prashant");
		thrd1.start();
		
		Prashant=thrd1.getName();
		System.out.println(Prashant);
 
	}

}
