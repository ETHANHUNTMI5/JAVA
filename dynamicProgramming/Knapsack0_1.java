package dynamicProgramming;

public class Knapsack0_1 {

	public static void main(String[] args) {
		
		int n = 4;
		int [] wt = {1,3,4,5};
		int [] price = {1,4,5,7};
		int cap=7;
		System.out.println(KR(0, wt, price, cap, 0, n));
		System.out.println(KTD(0, wt, price, cap, 0, n, new int[n][cap+1]));
		System.out.println(KBU(wt, price, cap));

	}
	
	public static int KR(int i, int[] wt , int [] price, int tc, int oc,int n)
	{
		if(oc>=tc || i==n) 
		{return 0;}
	
		
		int in =0;
		if(oc+wt[i]<=tc)
		in = KR(i+1, wt, price, tc, oc+wt[i], n)+price[i];
		
		int ex=KR(i+1, wt, price, tc, oc, n);
		
		return Math.max(in, ex);
	}
	
	public static int KTD(int i, int[] wt , int [] price, int tc, int oc,int n,int [][] strg)
	{
		if(oc>=tc || i==n) 
		{return 0;}
	
		if(strg[i][oc]!=0)return strg[i][oc];
		int in =0;
		if(oc+wt[i]<=tc)
		in = KTD(i+1, wt, price, tc, oc+wt[i], n,strg)+price[i];
		
		int ex=KTD(i+1, wt, price, tc, oc, n,strg);
		
		return strg[i][oc]=Math.max(in, ex);
	}
	
	public static int KBU(int [] wt, int [] price,int cap)
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

