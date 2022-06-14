package cptricks;

public class Bits {

	public static void main(String[] args) {
		int n =12;
	int s=	setithbit(n, 1);
	int c=	clearithbit(n, 2);
	int u = update(8, 2, 1);
	
			
	System.out.println(s);
	System.out.println(c);
	System.out.println(u);
	System.out.println(clearlastithbits(15, 3));
	}
	

	public static int clearithbit(int n , int i)
	{
		int mask=1;
		mask = mask<<i;
		
		mask= ~(mask); 
		n = n&mask;
		
		return n;
		
	}
	
	public static int setithbit(int n , int i)
	{
		int mask=1;
		mask = mask<<i;
		
		n = n|mask;
		
		return n;
		
	}
	
	public static int update(int n , int i , int v)
	{
		
		 n = clearithbit(n, i);
		
		int mask = (v<<i);
		
		return (n | mask);
	}
	
	public static int clearlastithbits(int n , int i)
	{
		// start with -1
 
		int mask =-1;
		
	// left shift mask i times
		
		mask = (mask<<i);
		
		return (n&mask);
		
		
	}
}
