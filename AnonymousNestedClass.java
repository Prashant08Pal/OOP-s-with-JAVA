package nestedClassDemo;


abstract class My
{
	abstract void show();
}

public class AnonymousNestedClass {
	int x=10;
	static int y=20;
	My display()
	{
		int x=30;
		My m=new My()
				{
			public void show()
			{
				//System.out.println(x);
				System.out.println(AnonymousNestedClass.this.x);
				System.out.println(AnonymousNestedClass.this.y);

				//System.out.println();
}
};
			return m;
				}
		
		public static void main(String[] args) {
			AnonymousNestedClass o=new AnonymousNestedClass();
			My m=o.display();
			m.show();
		}

}
