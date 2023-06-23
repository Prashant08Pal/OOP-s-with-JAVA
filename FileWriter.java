package inputoutputstream;
import java.io.*;
public class FileWriter {

	public static void main(String[] args)
	{
		try {
	FileWriter fp =new FileWriter("D:\\IO documentaion\\myfilestring_data.txt",true);
	String s="My Younger  brother  name is APS";
	char ch[]=s.toCharArray();
	fp.write(ch);
	fp.close();
	System.out.println("data is stored in file ");
		}catch (Exception e)
		{
				e.printStackTrace();
		}
		}
}