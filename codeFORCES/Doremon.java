package codeFORCES;

import java.util.Scanner;

public class Doremon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		int pos =0;
		int plus=0;
		int minus=0;
		for(int a=0;a<s1.length();a++)
		{
			char cc = s1.charAt(a);
			
			if(cc=='+')
			{pos++;
			plus++;}
			else
			{pos--;
			minus++;}
			
		}
		
		
		int re=0;
		int que=0;
		int plus2=0;
		int minus2=0;
		
		for(int a=0;a<s2.length();a++)
		{
			char cc = s2.charAt(a);
			if(cc=='+')
			{
				re++;
				plus2++;
			}
			else if(cc=='-')
			{
				re--;
				minus2++;
			}
			else
			{
				que++;
			}
		
			
			
		}
		
		boolean b =true;
		if(que==0 && plus==plus2 && minus==minus2 && b )
		{
			System.out.println("1.000000000000");
			b=false;
		}
		
		if((plus<plus2 || minus<minus2) && b)
		{
			System.out.println("0.000000000000");
			b=false;
		}
		

		while(b)
		{
			int gap = Math.abs(re-pos);
	
			if(que%2==0)
			{
				
				
				if(gap%2!=0)
				{System.out.println("0.000000000000");
				b=false;
				break;
				}
				
				else
				{
					
						int base = (que-gap)/2;
						int ways=Comb(que, base);
						double fav = ways;
						
						double total=Math.pow(2, que);
						
						double ans = fav/total;
						
						
						System.out.println(String.format("%.12g", ans));
						b= false;
						break;
						
					
					
				}
				
				
				
			}
			else
			{
				if(gap%2==0)
				{System.out.println("0.000000000000");
				b=false;
				break;
				}
			
				else
				{
					
					int base = (que-gap)/2;
					int ways=Comb(que, base);
					double fav = ways;
					
					double total=Math.pow(2, que);
					
					double ans = fav/total;
					System.out.println(String.format("%.12g", ans));
					b= false;
					break;
					
					
					
					
					
				}
				
				
			}
		
			
		}
		
	
	}
	public static int fact(int n)
	{
		if(n==0 || n==1)
		{return 1;}
		
		int fnm1= fact(n-1);
		
		return fnm1*n;
		
	}
	
	public static int Comb(int up,int base)
	{
		
		int num = fact(up);
		int de = fact(up-base)*fact(base);
	
		return num/de;
	}

}
