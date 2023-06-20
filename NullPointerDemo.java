package exceptionalHandlingDemo;

public class NullPointerDemo {

	public static void main(String[] args) {
 try {
	 String str=null;
	 int len=str.length();
	 System.out.println("NULL pointer exception is handled");
}catch(Exception e)
 {
	 System.out.println("exception: "+e);
 }
	}

}
