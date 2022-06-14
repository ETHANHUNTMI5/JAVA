package basics;

import java.util.Scanner;

public class NsDt {

	public static void main(String[] args) {
		
		int i=5;
		System.out.println(i);
		
		float f=10.2f;
		System.out.println(f);
		i=(int)f;
		System.out.println(i);
		
		f=i;
		System.out.println(f);
	
	  boolean bit =true;

	  if(i>0)
	  {System.out.println(true);}
	  else
	  {System.out.println(false);}
	
	char ch =67;
	ch=(char)(ch+4);
	System.out.println(ch);
	
	Scanner scn = new Scanner(System.in);
    char p=scn.next().charAt(0);
    System.out.println(p);
	}

}
