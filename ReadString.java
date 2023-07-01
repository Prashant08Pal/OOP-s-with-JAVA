package string;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
 int id;
 String name;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter employee id :");
 id=(sc.nextInt());
 
 System.out.println("enter employee name  :");
name=(sc.next());
System.out.println("id : "+id   +"Name :"+name);
	}

}
