package dynamicPro;

public class MCM {

	public static void main(String[] args) {
		int [] arr = {4,2,3,5,1};
		System.out.println(McmREC(arr, 0, arr.length-1));
		System.out.println(McmTD(arr, 0, arr.length-1,new int[arr.length][arr.length]));
		System.out.println(McmBU(arr));
	}
	public static int McmREC(int [] arr,int si, int ei)
	{
		if(si+1==ei)
		{return 0;}
		
		
		int min = Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++)
		{
			int fp = McmREC(arr, si, k);
			int sp =McmREC(arr, k, ei);
			
			int sw = arr[si]*arr[ei]*arr[k];
			
			int total = fp+sp+sw;
			
			if(total<min)
			{min = total;}
		}
		
		return min;
		
	}

	
	public static int McmTD(int [] arr,int si, int ei,int [][] strg)
	{
		if(si+1==ei)
		{return 0;}
		if(strg[si][ei]!=0)
		{return strg[si][ei];}
		int min = Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++)
		{
			int fp = McmTD(arr, si, k,strg);
			int sp =McmTD(arr, k, ei,strg);
			
			int sw = arr[si]*arr[ei]*arr[k];
			
			int total = fp+sp+sw;
			
			if(total<min)
			{min = total;}
		}
		
		strg[si][ei]=min;
		return min;
		
	}

	public static int McmBU(int [] arr)
	{
		int n = arr.length;
		
		int [][] strg = new int[n][n];
		
		for(int slide=1;slide<=n-1;slide++)
		{
			for(int si=0;si<=n-slide-1;si++)
			{
				int ei = si+slide;
				if(si+1==ei)
				{strg[si][ei]=0;}
				else
				{//logic from TD
					
					int min = Integer.MAX_VALUE;
					for(int k=si+1;k<=ei-1;k++)
					{
						int fp = strg[si][k];
						int sp =strg[k][ei];
						
						int sw = arr[si]*arr[ei]*arr[k];
						
						int total = fp+sp+sw;
						
						if(total<min)
						{min = total;}
					}
					
					strg[si][ei]=min;
					
				}
			}
			
			
		}
		
	return strg[0][n-1];}

}
