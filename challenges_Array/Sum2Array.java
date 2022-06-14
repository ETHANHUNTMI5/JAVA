package challenges_Array;

import java.util.Scanner;

public class Sum2Array {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int [] arr1 = new int [n];
		takeinput(arr1);
		
		int m = scn.nextInt();
		int [] arr2 = new int [m];
		takeinput(arr2);
	   Sum(arr1, arr2);
	   
		
	}

	public static void takeinput(int [] arr)
	{
		for(int a=0;a<arr.length;a++)
		{arr[a]=scn.nextInt();
			}
		}
 
	 public static void Sum(int [] arr1,int[] arr2)
	 {
		 int n1=arr1.length;
		 int n2=arr2.length;
		 
		 int[] sum=null;
		 
		 if(n1>n2)
		 {sum= new int [n1];}
		 
		 else
	     {sum= new int [n2];}
		 
		 int n = n1-1;
		 int m = n2-1;
		 int p=sum.length-1;
		
		 while(n>=0 && m>=0)
		{
			sum[p]=arr1[n]+arr2[m];
			
			if( p!=sum.length-1 && sum[p+1]>9 )
			{
				sum[p]=sum[p]+1;
				sum[p+1]=sum[p+1]-10;
			}
		
		n--;
		m--;
		p--;}
		 
		
		if(n==-1)
		{
			while(m!=-1)
			{
				
				sum[p]=arr2[m];
				
				if( p!=sum.length-1 && sum[p+1]>9 )
				{
					sum[p]=sum[p]+1;
					sum[p+1]=sum[p+1]-10;
				}
				p--;
				m--;
				
			}
			
			
		}
		 
		if(m==-1)
		{
			while(n!=-1)
			{
				sum[p]=arr1[n];
				
				if( p!=sum.length-1 && sum[p+1]>9 )
				{
					sum[p]=sum[p]+1;
					sum[p+1]=sum[p+1]-10;
				}
				
				p--;
				n--;
				
			}
			
			
		}
		 
		 display(sum); 
	 }
	 
	 public static void display(int [] sum)
	 {
             if(sum[0]>9)
             {	int k =sum[0]-10;	 
            	System.out.print("1"+", "+k+", " );

            	for(int a =1;a<sum.length;a++)
            	{System.out.print(sum[a]+", ");}
             
             }
             
		 
             else 
             {for(int a =0;a<sum.length;a++)
             { 
            	 System.out.print(sum[a]+", ");}
             }
		 System.out.println("END");
		 
	 }
}