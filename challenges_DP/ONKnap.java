package challenges_DP;

import java.util.Scanner;

public class ONKnap {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cap= scn.nextInt();
		int [] wt = new int[n];
		int [] arr= new int[n];
		
		for(int a=0;a<n;a++)
		{wt[a]=scn.nextInt();}
		
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		
		int [] strg =new int[cap+1];
  	System.out.println(Knap(wt, arr, cap, 0));
  	//System.out.println(KnapTD(wt, arr, cap, 0, strg));--> RECHECK
  	
  	for(int x:strg)
  	{System.out.print(x+" ");}
  	System.out.println();
  	System.out.println("++++++++++++");
  	System.out.println(KnapBU(wt, arr, cap, n));
  	
//  	for(int i:strg)
//  	{System.out.print(i+" ");}
//  	
//	}
	}
	public static int Knap(int [] wt,int [] arr,int cap,int vi)
	{
		if(cap==0 || vi==wt.length)
		{return 0;}
		
		int e = Knap(wt, arr, cap,vi+1);
		
		int i=0;
		
		if(cap>=wt[vi])
		{
			i = Knap(wt, arr, cap-wt[vi], vi)+arr[vi];
		}
		
		int ans = Math.max(i, e);
		
		
		return ans;
				
		
		
	}

	public static int KnapTD(int [] wt,int [] arr,int cap,int vi,int [] strg)
	{
		if(vi==arr.length || cap==0)
		{return 0;}
		
		if(strg[cap]!=0)
		{return strg[cap];}
		
		int e=KnapTD(wt, arr, cap, vi+1, strg) ;
		
		int i=0;
	
		
		if(cap>=wt[vi])
		{
		i = KnapTD(wt, arr, cap-wt[vi], vi, strg)+arr[vi];
		
	    
		}
		
		int ans = Math.max(i, e);

		if(cap>=0)
		{strg[cap]=Math.max(ans, strg[cap]);}
		
		return ans;
		}
		
public static int KnapBU(int [] wt,int [] val,int W,int n)
{
 
	 int dp[] = new int[W + 1];
     
    
     for(int i = 0; i <= W; i++){
         for(int j = 0; j < n; j++){
             if(wt[j] <= i){
                 dp[i] = Math.max(dp[i], dp[i - wt[j]] +val[j]);
             }
             
         }
         }
     for(int l : dp)
     {System.out.print(l+" ");
     }
     System.out.println();
     return dp[W];
    
	 
}
		
	
}