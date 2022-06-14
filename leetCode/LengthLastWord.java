package leetCode;

import java.util.Scanner;

public class LengthLastWord {

	public static void main(String[] args) {

		String s = "b  m   ";
				
		char cc=s.charAt(s.length()-1);
		
		if(cc==' ' && s.length()==1)
		{System.out.println("0");}
				
		else
		{
			int b=0;
			int a=0;
			
			if(cc==' ')
			{
				while(cc==' ' && s.length()-1-b>=0)
				{
					
					cc=s.charAt(s.length()-1-b);
					
					if(cc==' ')
					b++;

					System.out.println(b+"*");
				}
				
			}
			
			
			
			
			//System.out.println("-->"+cc);
			if(b==s.length())
			{System.out.println(0);}
			
			
			
			else
			{
				b=b+1;
				a=1;
				while(cc!=' ' && s.length()-1-b>=0)
				{
					cc= s.charAt(s.length()-1-b);
					b++;
					a++;
					
				}
				
				System.out.println(a);
			}
			
			
			
			
			
			
			
		}
	}
}