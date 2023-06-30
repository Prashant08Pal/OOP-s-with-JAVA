package initBlockDemo;

public class InstanceInitBlock {
	int num;
	
	{
		num=200;
	}

	
	InstanceInitBlock()
	{
		System.out.println("Number is :"+num);
	}
	public static void main(String[] args) {
		InstanceInitBlock nb=new InstanceInitBlock()
	}

}
