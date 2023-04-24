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
public class Son1 extends Papaje 
{
	int x =22;

	
	void show()
	{
	System.out.println(this.x);
	System.out.println(((Papaje)this).x);
	System.out.println(((Dadaje)this).x);
	System.out.println(((ParDadaje)this).x);


	}
	public static void main(String[] args) {
 Son1 s=new Son1();
 s.show();
	}

}

/*  
key learning from the above program 

*/