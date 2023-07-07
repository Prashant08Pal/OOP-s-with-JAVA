package nestedClassDemo;


interface I 
{
	void disp();
}
public class OuterA {
	
	public I show()
	{
		final int l=8;
		class In implements I
		{
			int i=10;
			public void disp()
			{
				System.out.println("disp  ...."+(i+l));
			}}
				System.out.println(l);
				In obj=new In();		//object creation 
				obj.disp();	
				return obj;
				
	}
		
	

	public static void main(String[] args) {
		OuterA o=new OuterA();
		I obj =o.show();
		obj.disp();
		
	}

}
