//READ ALL CHARACTER FROM THE FILE 
package inputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {

	public static void main(String[] args) throws IOException {
 try {
	FileInputStream fin=new FileInputStream("D:\\IO documentaion\\myfilestring_data.txt");
	while(true)
	{
		int i=fin.read();
		if(i==-1)
			break;
		//System.out.println((char)i);
		System.out.print((char)i);

		
	}
}
 catch (FileNotFoundException e) {
 	e.printStackTrace();
}
	}

}
