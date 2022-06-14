package code;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int a=1;a<=t;a++)
        {
        	int n = scn.nextInt();
        	
        	if(n==1)
        	{System.out.println("1");
        	continue;}
        	else if(n==2)
        	{System.out.println("-1");}
        	
        	else
        	{
        		int [][] arr = new int[n][n];
        		
        		int x=1;
        		for(int slide=0;slide<n-1;slide++)
        		{
        			
        		for(int row=0,col=slide;row<n && col<n;row++ , col++)
        		{
        		arr[row][col]=x;
        		x++;
        			
        		}
        		
        		}
        		
        		for(int slide2 =0;slide2<n-2;slide2++)
        		{
        		
        			for(int row=slide2+1,col=0;row<n && col<n;row++ , col++)
            		{
            		arr[row][col]=x;
            		x++;
            			
            		}
        			
        		}
        		
        		arr[0][n-1]=n*n-1;
        		arr[n-1][0]=n*n;
        		
        	for(int i=0;i<n;i++)
        	{for(int j=0;j<n;j++)
        		{
          System.out.print(arr[i][j]+" ");        		
        		}
        	System.out.println();}
        	
        	System.out.println();    	
        }
        
	}

	}
}
