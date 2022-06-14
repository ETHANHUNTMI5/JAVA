package basics;

import java.util.Scanner;

public class TryHCF {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		   int n = scn.nextInt();

		int [] arr = new int[n];
		   for(int a=0;a<n;a++)
		   {
		   arr[a]=scn.nextInt();
		   }

		
		  
		int ans=arr[0];
		  for(int a=0;a<n;a++)
		  {
		      ans = GCD(ans,arr[a]);
           }
		  System.out.println(ans);


		    }
			public static int GCD(int a , int b)
			{
				int r=0;
		      while(a%b!=0)
				{r=a%b;
				a=b;
				b=r;
			     }
			
			return b;

			}
		}