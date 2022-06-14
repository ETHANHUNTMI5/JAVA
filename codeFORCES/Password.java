package codeFORCES;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		char[] arr = new char[k];
		
		for(int a=0;a<k;a++)
		{
			arr[a]=(char)(97+a);
		}
		
		for(char cc : arr)
		{System.out.print(cc+" ");}
		
		String s="";
	
		int b = n/k;
		int c=0;
		while(c!=b+1)
		
		{for(int a=0;a<n;a++)
		{
			if(a==k || s.length()==n)
			{
			break;
			}
			s=s+arr[a];
		}
		c++;}
		System.out.println(s);
	}

}
