package inheritanceProgram;
class ParDadaje
{
	int x =200;
}
class Dadaje extends ParDadaje
{
	int x=100;
}

class Papaje extends Dadaje
{
	int x=50;
}
public class Son extends Papaje 
{
	int x =22;
	void show(Son s1,Papaje s2,Dadaje s3,ParDadaje s4)
	{
		System.out.println(x);
		//System.out.println(super.x);
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
		System.out.println(s4.x);
		System.out.println();

	
	}
	public static void main(String[] args) {
 Son s=new Son();
 s.show(s,s,s,s);
  
	}

}

/*  
key learning from the above program 
1.without the super keyword we are able to print the data 
2. without object creation of any parent class we are able to print the data . 

3.this is only possible with the help of concept  known as Upcasting(
*/