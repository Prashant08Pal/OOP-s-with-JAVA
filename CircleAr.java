package classobject;

import java.util.Scanner;

class AreaOfCircle{
	private float radius=0.0f;
	private float area=0.0f;
	private float perimeter=0.0f;
	
	
	public void readradius()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS ");
		radius =sc.nextFloat();
		
	}
	public 	float getArea()
	{
		area= (float)Math.PI*radius*radius;
		return area;
	}


	public float getPerimeter()
	{
	perimeter= 2*(float)Math.PI*radius;
	return perimeter;
	}
}
public class CircleAr {

	public static  void main(String[] args)
	{
 
		AreaOfCircle area=new AreaOfCircle();
		area.readradius();
		System.out.println("area of circle : "+ area.getArea());
		System.out.println("perimeter of circle : "+area.getPerimeter());
		
		
	}

}
