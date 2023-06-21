package exceptionalHandlingDemo;

public class ClasssNotFoundDemo {

	public static void main(String[] args) {
 
		try {
			Class.forName("Prashantpal");
		} catch (ClassNotFoundException e) {
 			System.out.println("class not found exception:"+e);
		}
	}

}
/* class not found exception gets generated because we tried to get a 
		instance of the class ,which does not exist.
*/