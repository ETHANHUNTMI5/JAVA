package codeFORCES;

import java.util.Scanner;

public class Anton {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	scn.nextLine();
	String s = scn.nextLine();
	
	int a =0;
	int d=0;
	
	for(int i =0;i<n;i++)
	{
		if(s.charAt(i)=='A')
		{a=a+1;}
		
		else
		{d=d+1;}
		
	}
		
	if(a>d)
	{System.out.println("Anton");}
	else if(d>a)
	{System.out.println("Danik");}
	else
	{System.out.println("Friendship");}
		
	}

}
