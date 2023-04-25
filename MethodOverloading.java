// java program to implement method overloading bases on no of arguments 

package lectureEx;

public class MethodOverloading {
	
	static int sum(int a,int b)
	{
		int s=0;
		s=a+b;
		return s;
	}

	static int sum (int a,int b,int c)
	{
		int s=0;
		s=a+b+c;
		return s;
	}
	static int sum (int a,int b,int c,int d)
	{
		int s=0;
		s=a+b+c+d;
		return s ;
	}
	public static void main(String[] args) {
	int result =0;
	
	result=sum(10,20);
	System.out.println("sum :"+result);
	
	result=sum(10,20,30);
	System.out.println("sum :"+result);

	result=sum(10,20,30,40);
	System.out.println("sum :"+result);

	}

}
