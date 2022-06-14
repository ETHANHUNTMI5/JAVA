package abc;

import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
		
	 	Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        int x =0;
        int o=0;
        int un=0;
        
        for(int a=0;a<s.length();a++)
        {
        	char cc = s.charAt(a);
        	
        	if(cc=='x')
        	{
        		x++;
        	}
        	
        	else if(cc=='o')
        	{
        		o++;
        	}
        	else
        	{
        		un++;
        	}
        	
        }
        
        
        if(o>4)
        {System.out.println("0");}
        
        else if(o==4)
        {System.out.println("24");}
        
        else
        {
        	int ans=0;
        if(o==3)
        {
        	ans = ans+36;
        	ans = ans + 24*un;
        }
        
        else if(o==2)
        {
        	ans = ans + 14;
        	ans = ans + 2*un*24/2;
        	ans = ans +un*12;
        	ans = ans+((un)*((un-1)/2)*24);
         }
        
        else
        {
        	ans = ans +1;
        	ans = ans +4*un;
        	ans = ans+un*6;
        	ans = ans+((un)*((un-1)/2)*12);
        	ans = ans +un*4;
        	ans =ans+((un)*((un-1)/2)*2*12);
        	ans =ans+((un)*((un-1)*(un-2)/6)*24);
        	
        }
        
        System.out.println(ans);}
        
        
	 }
		
	

}
