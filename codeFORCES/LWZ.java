package codeFORCES;

import java.util.Scanner;

public class LWZ {

	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
      long a = scn.nextLong();
      long b = scn.nextLong();
    
 long ans1 = a+b;
 long g2 = NZ(ans1);
 
 long a2 = NZ(a);
 long b2 = NZ(b);
 
 long ans2 = a2+b2;
 
 NZ(ans2);
 
 
 if(ans2==g2)
 {System.out.println("YES");}
 else
 {System.out.println("NO");}
      
	  
		
	}
public static long NZ(long n)
{
	long t=0;
	long an=0;
	long p=0;
	while(n!=0)
    {
  	  t= n%10;
  	  if(t!=0)
  	  {
  		  an= (long) (an+(t*Math.pow(10, p)));
  		  p++;
  	  }
  	  
  	  n=n/10;
    }


return an;



}
}
