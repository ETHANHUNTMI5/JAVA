package dynamicPro;

import java.util.Scanner;

public class KnapSack {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cap= scn.nextInt();
		int [] wt = new int[n];
		int [] price= new int[n];
 
		for(int a=0;a<n;a++)
		{wt[a]=scn.nextInt();}
		
		for(int a=0;a<n;a++)
		{price[a]=scn.nextInt();}
	System.out.println(KSBU(wt, price, cap));
		
	}

	public static int KSRec(int [] wt,int [] price,int vidx,int cap)
	{
		if(vidx==wt.length || cap==0)
		{return 0;}
		
		
		
		
		//exclude
		int e = KSRec(wt, price, vidx+1, cap);
		
		int i=0;
		// include only if condition is true
		if(cap>=wt[vidx])
		{
			i= KSRec(wt, price, vidx+1, cap-wt[vidx])+price[vidx];
		}
	   
		int ans = Math.max(i, e);
	
	return ans;}

	public static int KSTD(int [] wt,int [] price,int vidx,int cap,int [][] arr)
	{
		if(vidx==wt.length || cap==0)
		{return 0;}
		
		
		
		
		if(arr[vidx][cap]!=0)
		{return arr[vidx][cap];}
		//exclude
		int e = KSTD(wt, price, vidx+1, cap,arr);
		
		int i=0;
		// include only if condition is true
		if(cap>=wt[vidx])
		{
			i= KSTD(wt, price, vidx+1, cap-wt[vidx],arr)+price[vidx];
		}
	   
		int ans = Math.max(i, e);
	
		arr[vidx][cap]=ans;
	return ans;}

public static int KSBU(int [] wt, int [] price,int cap)
{
	int n = wt.length;
   int [][] arr = new int[n+1][cap+1];
	
   for(int row=n-1;row>=0;row--)
   {
	   for(int col=1;col<=cap;col++)
	   {
		   int e = arr[row+1][col];
		   int i=0;
		  
		   if(col>=wt[row])
		   {
			   i = arr[row+1][col-wt[row]]+price[row];
		   }
		   arr[row][col]= Math.max(i, e);
		   
		  
		   
	   }
	   
   }
   
   
   return arr[0][cap];}
}

