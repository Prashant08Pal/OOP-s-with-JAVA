package lectureEx;

public class thiskeyword {
void m()
{
	System.out.println("hello m");
}
void n() 
	{
		System.out.println("hello n");
		this.m();
	}
class Testthis4{
public static void main(String[] args) {
	
 thiskeyword a=new thiskeyword();
 a.n();
	}}

