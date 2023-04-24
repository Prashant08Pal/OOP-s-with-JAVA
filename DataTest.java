package inheritanceProgram;

class Base1
{
int x =10;
}

public class DataTest extends Base1
{
	int x=22;
	void show ()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
 DataTest t =new DataTest();
 t.show();
	}

}
