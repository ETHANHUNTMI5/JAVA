package code;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int a=1;a<=t;a++)
        {
        	long n = scn.nextLong();
        	
        	if(n==0)
        	{System.out.println("0");
        	continue;}
        	long m = n;
        	
        	long b=0;
        	long u=0;
        	long rev=0;
        	long ans=0;
        	while(n!=0)
        	{
        		u=n%10;
        		rev=rev*10+u;
        		b++;
        		n=n/10;
        		
        	}
        	ans=(b-1)*9;
  	       	
        	
        	
        	long get=0;
        	for(int s=1;s<=b;s++)
        	{
        		get=get*10+u;
        	}
        	
        	if(m>=get)
        	{ans=ans+u;}
        	
        	else
        	{ans = ans+u-1;}
        	System.out.println(ans);
        	
       
        }
	}
}
