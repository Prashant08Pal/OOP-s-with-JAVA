package inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStringDemo {

	public static void main(String[] args) throws IOException {
 try {
	FileOutputStream fout=new FileOutputStream("D:\\IO documentaion\\myfilestring_data.txt");
	String s="My name is Prashant pal S/O Prem Shanker Pal";
	byte b[]=s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("you have successfully create a file ");
	
} catch (FileNotFoundException e) {
 	e.printStackTrace();
}
	}

}
