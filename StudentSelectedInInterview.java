package lectureEx;

public class StudentSelectedInInterview {
	String name,clgname,cmpname;
	int age,roll;
	float sal;

	StudentSelectedInInterview(String n,String cl,String cm,int a,int r,float s)
	{
		name=n;
		clgname=cl;
		cmpname=cm;
		age=a;
		roll=r;
		sal=s;
		
	}

	void show()
	{
		System.out.println("");
		System.out.println(name);
		System.out.println(clgname);
		System.out.println(cmpname);
		System.out.println(age);
		System.out.println(roll);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		StudentSelectedInInterview d = new StudentSelectedInInterview("Prashant","UPES","IBM",22,500104887,94.02f);
		d.show();
		StudentSelectedInInterview d2=new StudentSelectedInInterview("Akarsh","UPES","IBM",24,5289764,85.02f);
		d2.show();
		StudentSelectedInInterview d3=new StudentSelectedInInterview("aditya","upes","IBM",25,24686,45.5f);
		d3.show();

			//	StudentSelectedInInterview d4=new StudentSelectedInInterview("");

			//	StudentSelectedInInterview d5=new StudentSelectedInInterview("");

	}

}

//My learning from the above program is 
//the attribute which are same for each object make it static










