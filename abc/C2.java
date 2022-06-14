package abc;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
	    
	    for(int w=1;w<=t;w++)
	    {
	    int n = scn.nextInt();
	    scn.nextLine();
		String s = scn.nextLine();
	    int a=kar(s, 0, 0, 0, 1);
	    
	   // int b=kar2(s, 0, 0, 0, 1);
	    
	   
	    }
		
	    
	}
	public static int kar(String s,int t,int a , int b,int r)
	{
		
		if(tell(s))
		{
		if(a>b)
		{System.out.println("BOB");}
		else if(a<b)
		{System.out.println("ALICE");}
		else
		{System.out.println("DRAW");}
			
			
			
		return 0;
		}
		
		int i=0;
		int j=0;
		if(t%2!=0)
		{
			i=-1;
			j=-1;
		}
		
		else
		{
			i=100;
			j=100;
		}
		
		if(t%2==0)
		{
			if(!isPalRec(s, 0, s.length()-1) && r!=0)
			{  // System.out.print(t+"->"+s+" ");
				s= reverseString(s);
				//System.out.println(s+" "+r);
				i=kar(s, t+1, a+0, b+0, 0);
				
			}
			
		if(isPalRec(s, 0, s.length()-1) || r==0)
			{
			int min=1000000;
			int p=0;
			//System.out.print(t+"->"+s+" ");
				z:for(int m=0;m<s.length();m++)
				{
					if(s.charAt(m)=='0')
					{
					   if(m<min)
					   {min=m;}
						String ll=s.substring(0,m)+'1'+s.substring(m+1);
					   
						if(isPalRec(ll, 0, ll.length()-1))
						{
							s=ll;	
							p++;
							break z;
						}
						
						
						
						
						
						
					}
				}
			if(p==0)
			{s=s.substring(0,min)+'1'+s.substring(min+1);}
			//System.out.println(s+" "+r);
			j=kar(s, t+1, a+1, b, 1)+1;
			}
			
			
			
		}
		else
		{
			if(!isPalRec(s, 0, s.length()-1) && r!=0)
			{
			//System.out.print(t+"->"+s+" ");	
				s= reverseString(s);
				//System.out.println(s+" "+r);
				i=kar(s, t+1, a+0, b+0, 0);
				
			}
		
			
			
			 if(isPalRec(s, 0, s.length()-1) || r==0)
			{
				 int min=1000000;
					int p=0;
					//System.out.print(t+"->"+s+" ");
						z:for(int m=0;m<s.length();m++)
						{
							if(s.charAt(m)=='0')
							{
							   if(m<min)
							   {min=m;}
								String ll=s.substring(0,m)+'1'+s.substring(m+1);
							   
								if(isPalRec(ll, 0, ll.length()-1))
								{
									s=ll;	
									p++;
									break z;
								}
								
								
								
								
								
								
							}
						}
					if(p==0)
					{s=s.substring(0,min)+'1'+s.substring(min+1);}
					//System.out.println(s+" "+r);
					j=kar(s, t+1, a, b+1, 1)+1;
			}	
			
		
			
			

			
		}
		if(t%2==0)
		return Math.min(i, j);
		else
			return Math.max(i, j);
		
	}
	
	public static int kar2(String s,int t,int a , int b,int r)
	{
		
		if(tell(s))
		{
		return 0;
		}
		
		int i=0;
		int j=0;
		if(t%2==0)
		{
			i=-1;
			j=-1;
		}
		
		else
		{
			i=100;
			j=100;
		}
		
		if(t%2!=0)
		{
			
		 if(isPalRec(s, 0, s.length()-1) || r==0)
			{
				z:for(int m=0;m<s.length();m++)
				{
					if(s.charAt(m)=='0')
					{
						s= s.substring(0,m)+'1'+s.substring(m+1);
						break z;
					}
				}
				
			j=kar2(s, t+1, a+1, b, 1)+1;
			}
			
		  if(!isPalRec(s, 0, s.length()-1) && r!=0)
			{
				s= reverseString(s);
				i=kar2(s, t+1, a+0, b+0, 0);
				
			}
		
			
		}
		else
		{
			
			if(!isPalRec(s, 0, s.length()-1) && r!=0)
			{
				s= reverseString(s);
				i=kar2(s, t+1, a+0, b+0, 0);
				
			}
		 if(isPalRec(s, 0, s.length()-1) || r==0)
			{
				z:for(int m=0;m<s.length();m++)
				{
					if(s.charAt(m)=='0')
					{
						s= s.substring(0,m)+'1'+s.substring(m+1);
						break z;
					}
				}
				
			j=kar2(s, t+1, a, b+1, 1)+1;
			}
			
			

			
		}
		if(t%2!=0)
		return Math.min(i, j);
		else
			return Math.max(i, j);
		
	}

	
	public static boolean isPalRec(String str, int s, int e)
{

if (s == e)
return true;

if ((str.charAt(s)) != (str.charAt(e)))
return false;

if (s < e + 1)
return isPalRec(str, s + 1, e - 1);

return true;
}

	public static boolean tell(String s)
	{
		for(int a=0;a<s.length();a++)
		{
			if(s.charAt(a)=='0')
			{return false;}
		}
		
	
	return true;}
	
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty()){
	
		 return myStr;
		}
				
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
}
