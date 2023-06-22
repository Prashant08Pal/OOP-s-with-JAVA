package inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout=new FileOutputStream("D:\\IO documentaion\\myfirstfile.txt");
			fout.write(65);
			fout.close();
			System.out.println("you have successfully created file and write a data in a file ");
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
		}
	}

}
