package challenges_Array;

import java.util.Scanner;

public class Chewbacca1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
     int a=0,b=0,d=0,m=n;
	  
     d=length(n);
     
     int [] arr =null;
	  arr = new int [d];
		int c=d-1;
			while(m!=0 && c>=0)
			{
				b=m%10;
				if(b>=9-b)
				{arr[c]=9-b;}
				else 
				{arr[c]=b;}
			m=m/10;
			c--;}
		
		display(arr);
	}
	 public static int length(int n)
	 {
		 int a=0,b=0,m=n;
			while(n!=0)
			{
				b=n%10;	
			n=n/10;
			a++;}
			return a;
		
	 }
	 
	
	
	
	 public static void display(int [] arr)
	    {for(int a=0;a<arr.length;a++)
	    	{System.out.print(arr[a]);}
	    }


}
