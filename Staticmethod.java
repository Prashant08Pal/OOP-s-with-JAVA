// static method 222 feb 2023 

package lectureEx;

public class Staticmethod {
	int rollno;
	String name;
	static String college="UPES";
	static void change() {
		college="UPES dehradun";
	}
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(college);


		
	}

	public static void main(String[] args) {
		Staticmethod.change();
		Staticmethod s1=new Staticmethod(1,"mg");
		s1.display();
	}

}
