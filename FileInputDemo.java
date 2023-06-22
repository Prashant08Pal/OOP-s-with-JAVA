// READ SINGLE CHARACTER 
package inputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("D:\\IO documentaion\\myfilestring_data.txt");
			
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
			
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
		}
	}

}
