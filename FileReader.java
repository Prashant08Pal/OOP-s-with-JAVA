package inputoutputstream;

public class FileReader {

	public static void main(String[] args) {
 try {
	 FileReader fr=new  FileReader("D:\\IO documentaion\\myfilestring_data.txt");
	 while(true)
	 {
		int i=fr.read();
		if(i==-1)
			break
		System.out.println((char)i);
	 }
	 
 }catch(Exception e) {
	 e.printStackTrace();
 }
 
	}

}
