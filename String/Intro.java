package String;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
	
		//Part 1
		String s1= "Hello";
		String s2="Hello";
		System.out.println(s1);

		//Part 2
		System.out.println(s1.length());
	    System.out.println(s1.charAt(4));
	
	    //Part 3
	    System.out.println(s1.substring(1));
	    
	    //Part 4
    String s3;
	s3=s2+s1;
	System.out.println(s3);
	
	System.out.println(s1.concat(s1));
	
	//Part 5
	System.out.println(s1.indexOf("ll"));
	System.out.println(s1.indexOf("E"));
	
	//Part 6
	
	System.out.println(s1.startsWith("h"));
	System.out.println(s1.startsWith("H"));
	
  //Part 7 equals
   
    String s4;
    s4=s2;
    String s5;
    s5 = new String("Hello");
    
    System.out.println((s2==s3) + " " + s2.equals(s3));
    System.out.println((s2==s4) + " " + s2.equals(s4));
    System.out.println((s2==s5) + " " + s2.equals(s5));
	
	
 // Part 8 Input String
	
 	Scanner scn = new Scanner(System.in);
     String str2 = scn.nextLine();
    String str3="Hello";
     for(int i=0;i<=str2.length()-1;i++)
     {System.out.println(str2.charAt(i));}
     
     
	}
	
}