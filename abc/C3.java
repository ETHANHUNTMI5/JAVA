package abc;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
	    
	    for(int w=1;w<=t;w++)
	    {
	    	long n = scn.nextLong();
	    	
	    	
	    	if(n==2)
	    	{System.out.println("1");}
	    	
	    	
	    	else {
	    	long tans=1;
	    	
	    	while(tans<=n)
	    	{
	    		tans=tans<<1;
	    		
	    	}
	    	
	    	
	    	
	    	System.out.println(tans/2-1);
	    	}
	    	}
	}

}
