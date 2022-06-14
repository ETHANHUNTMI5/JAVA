package codeFORCES;

import java.util.Scanner;

public class IceCream {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		long x =scn.nextInt();
		
		
		long sum=x;
		long num=0;
		scn.nextLine();
		for(int a=0;a<n;a++)
		{
    
       char cc= scn.next().charAt(0);
       //char cc2=scn.next().charAt(0);
       long snum = scn.nextLong();
			if(cc=='+')
			{sum=sum+snum;}
			
			else
			{
				if(sum-snum>=0)
				{sum= sum-snum;}
				else
				{num++;}
					
			}
			
		}
		System.out.println(sum+" "+num);

	}

}
