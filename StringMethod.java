package string;

public class StringMethod {

	public static void main(String[] args) {
 String name= "     Prashant  pal    ";
 String name1= " Alok ";
 String name2= "     prashant  pal    ";


 String email= "prashantpal23@gmail.com";
// System.out.println(name.length());  //8
 System.out.println(name.isEmpty());  // false
 System.out.println(name.length());//22
 System.out.println(name.trim());  //  trim method is used to remove the space from the start and end of the string
 System.out.println(name.equals(name1));
 System.out.println(name.equals(name2)); //if the string is in lower case then also is tells that not equal 
 System.out.println(name.equalsIgnoreCase(name2)); // true
 System.out.println(name.compareTo(name2));
 
 System.out.println(name.compareToIgnoreCase(name2)); // both are equal 0




 
 
 
 
 
 
 
 
 

// if (name.isEmpty()== true)
// {
//	 System.out.println("name is not  empty");
//
// }
// else
// {
// System.out.println("name is their");
//
// }
// int i= name.length();
// if(i==0)
// {
//	// System.out.println();
//	 System.out.println("name is empty");
//
// }
// else 
// {
//		 System.out.println("valid username ");
//
// }
//
 
 
 
	}

}
