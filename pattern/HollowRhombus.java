package pattern;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nsp=n-1,row=1,nst=1;
		


       while(row<=n)
       {
    	   for(int a=1;a<=nsp;a++)
    	   {System.out.print(" ");}
    	   
    	   for(int a=1;a<=nst;a++)
    	   {System.out.print("*");}
    	   
    	   for(int a=1;a<=n-2 && row>1 && row<n;a++)
    	   {System.out.print(" ");}
    	   
    	   for(int a=1;a<=n-2 && row==1;a++)
    	   {System.out.print("*");}
    	
    	   for(int a=1;a<=n-2 && row==n;a++)
    	   {System.out.print("*");}
    	
    	   for(int a=1;a<=1;a++)
    	   {System.out.print("*");}
    	
    	   
       System.out.println();
       row++;
       nsp--;
       }
		
		
	}

}
