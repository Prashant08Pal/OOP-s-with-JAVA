package lectureEx;


public class StudentDetail {
	 String name,clgname,mobileno;
	 int rollno,age ;
	 
	 void showInfo() {
		 System.out.println("name="+name);
		 System.out.println("clgname="+clgname);
		 System.out.println("mobileno="+mobileno);
		 System.out.println("rollno="+rollno);
		 System.out.println("age="+age);
	 }
void read()
{
	System.out.println("");
	System.out.println(" student are reading ");

}
void write()
{
	System.out.println("student are writing ");
}

	public static void main(String[] args) {
 new StudentDetail();
	System.out.println( new StudentDetail());

	}

}
/* My Learning with this program  25.03.2023 
 *  a). with the help of new keyword we can create a object 
 *  b). if we pass the object in println statement we can one reference 
 *  is created in heap memory . in JVM
 */

/*
why we create object ?
to initialize the memory to the instance variable 
*/