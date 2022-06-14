package abc;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        
        for(long a=1;a<=t;a++)
        {
        	long l = scn.nextLong();
        	long r = scn.nextLong();
        	
        	long num1=0,num2=0,num3=0;

        	if( l>r && l%r==0)
        	{System.out.println("NO");
        	break;}
        	
        	if(l==r)
        	{System.out.println("NO");
        	break;}
        	        	
        	else if(r>l && r%l==0)
        	{
        		
        		num1 = 2*l*r;
            	num2= l*(r+1);
            	num3 = Math.abs(l*(r-1));
            	
            	System.out.println("YES");
            	
            	if(l>r)
            	{System.out.println(num1+" "+num3+" "+num2);}
            	else
            	System.out.println(num2+" "+num3+" "+num1);
            	       }

        		
        	
        	else
        	{
            num1 = 2*l*r;
        	num2= l*(r+l);
        	num3 = Math.abs(l*(r-l));
        	
        	System.out.println("YES");
        	
        	if(l>r)
        	{System.out.println(num1+" "+num3+" "+num2);}
        	else
        	System.out.println(num2+" "+num3+" "+num1);
        	       }
        }
	}
	}

