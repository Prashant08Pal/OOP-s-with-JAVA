package inheritance;

 class Flower{
 	void pluck(){
 {
	System.out.println("i am in the flower class");
}
 }
 class Rose  extends Flower {
 void thorn() 
{
	 System.out.println("i am in the rose class");
}

 }
public class SingleInheritance 
{

	public static void main(String[] args)
	{
		Rose r=new Rose();
		r.thorn();
		r.pluck();
	}

}
