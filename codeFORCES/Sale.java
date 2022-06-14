package codeFORCES;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	long n = scn.nextLong();
	long f = scn.nextLong();
	
	long [] pro= new long[(int)n];
	long [] cus =new long[(int)n];
	
	for(long a=0;a<n;a++)
	{
	pro[(int)a]= scn.nextLong();
	cus[(int)a]= scn.nextLong();
		
	}
//	long [][] arr = new long[(int)n+1][(int)f+1];
		
	//System.out.println(kar1(pro, cus, 0, 0, f,arr));
		
	//System.out.println(BU(pro, cus, 0, f));
	long [][] dp = new long[pro.length+1][(int)f+1];
	   
	   for(long j =f;j>=0;j--)
	   {
	   
	   for(long si=pro.length-1;si>=0;si--)
	   {
		  
			   
			   long p=0;
				
				long i=0;
				long e=0;
				
				if(j<f)
				{ i = dp[(int)si+1][(int)j+1];
				
				if(2*pro[(int)si]>=cus[(int)si])
				{
					i=i+cus[(int)si];
				}
				
				else
				{
					i=i+2*pro[(int)si];
				}
				}
				
				else
				{
					if(pro[(int)si]>=cus[(int)si])
					{
						i=i+cus[(int)si];
					}
					
					else
					{
						i=i+pro[(int)si];
					}
					
				}
				 e = dp[(int)si+1][(int)j];
				
				if(pro[(int)si]>=cus[(int)si])
				{
					e=e+cus[(int)si];
				}
				
				else
				{
					e=e+pro[(int)si];
				}
				
				p = Math.max(i, e);
				
				dp[(int)si][(int)j]=p;
			   }
		    }

	   System.out.println(dp[0][0]);

	   for(long i=0;i<=pro.length;i++)
	   {
		   for(long j=0;j<=f;j++)
		   {System.out.print(dp[(int)i][(int)j]+" ");}
		   System.out.println();
		   
	   }

	
		
	}
	
	public static long kar(long [] pro,long [] cus,long si,long f,long fin)
	{
		if(si==pro.length)
		{
			return 0;
		}
		
		
		long p=0;
		
		long i=0;
		long e=0;
		
		if(f<fin)
		{ i = kar(pro, cus, si+1, f+1,fin);
		
		if(2*pro[(int)si]>=cus[(int)si])
		{
			i=i+cus[(int)si];
		}
		
		else
		{
			i=i+2*pro[(int)si];
		}
		}
		
		else
		{
			if(pro[(int)si]>=cus[(int)si])
			{
				i=i+cus[(int)si];
			}
			
			else
			{
				i=i+pro[(int)si];
			}
			
		}
		 e = kar(pro, cus, si+1, f,fin);
		
		if(pro[(int)si]>=cus[(int)si])
		{
			e=e+cus[(int)si];
		}
		
		else
		{
			e=e+pro[(int)si];
		}
		
		p = Math.max(i, e);
		
		
		
		return p;
	}
	public static long kar1(long [] pro,long [] cus,long si,long f,long fin, long[][]arr)
	{
		if(si==pro.length)
		{
			return 0;
		}
		
		
		if(arr[(int)si][(int)f]!=0)
		{return arr[(int)si][(int)f];}
		
		long p=0;
		
		long i=0;
		long e=0;
		
		if(f<fin)
		{ i = kar1(pro, cus, si+1, f+1,fin,arr);
		
		if(2*pro[(int)si]>=cus[(int)si])
		{
			i=i+cus[(int)si];
		}
		
		else
		{
			i=i+2*pro[(int)si];
		}
		}
		
		else
		{
			if(pro[(int)si]>=cus[(int)si])
			{
				i=i+cus[(int)si];
			}
			
			else
			{
				i=i+pro[(int)si];
			}
			
		}
		 e = kar1(pro, cus, si+1, f,fin,arr);
		
		if(pro[(int)si]>=cus[(int)si])
		{
			e=e+cus[(int)si];
		}
		
		else
		{
			e=e+pro[(int)si];
		}
		
		p = Math.max(i, e);
		
		arr[(int)si][(int)f]=p;
		
		return p;
	}

public static long BU(long [] pro,long[] cus,long f,long fin)
{
   long [][] dp = new long[pro.length+1][(int)fin+1];
   
   for(long j =fin;j>=0;j--)
   {
   
   for(long si=pro.length-1;si>=0;si--)
   {
	  
		   
		   long p=0;
			
			long i=0;
			long e=0;
			
			if(j<fin)
			{ i = dp[(int)si+1][(int)j+1];
			
			if(2*pro[(int)si]>=cus[(int)si])
			{
				i=i+cus[(int)si];
			}
			
			else
			{
				i=i+2*pro[(int)si];
			}
			}
			
			else
			{
				if(pro[(int)si]>=cus[(int)si])
				{
					i=i+cus[(int)si];
				}
				
				else
				{
					i=i+pro[(int)si];
				}
				
			}
			 e = dp[(int)si+1][(int)j];
			
			if(pro[(int)si]>=cus[(int)si])
			{
				e=e+cus[(int)si];
			}
			
			else
			{
				e=e+pro[(int)si];
			}
			
			p = Math.max(i, e);
			
			dp[(int)si][(int)j]=p;
		   
		   
		   
		   
		   
		   
	 
	   }
	   
   }
   

//   for(long i=0;i<=pro.length;i++)
//   {
//	   for(long j=0;j<=fin;j++)
//	   {System.out.print(dp[(int)i][(int)j]+" ");}
//	   System.out.println();
//	   
//   }


   return dp[0][(int)f];

}
}
