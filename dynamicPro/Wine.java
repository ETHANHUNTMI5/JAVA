package dynamicPro;

public class Wine {

	public static void main(String[] args) {

		int [] arr = {2,3,5,1,4};
//       System.out.println(WineRec(0,arr.length-1, arr, 1));
//       System.out.println(WineTD(0, arr.length-1, arr, 1, new int[5][5]));
       System.out.println(WineBU(arr));
	}

	public static int WineRec(int si,int ei , int[] arr,int yr)
	{
		
		if(si==ei)
		{
			return arr[0]*yr; 
		}
		int profit=0;
		
		
		int a = WineRec(si+1, ei, arr, yr+1)+arr[si]*yr;
		int b = WineRec(si, ei-1, arr, yr+1)+arr[ei]*yr;
	   
		profit = Math.max(a, b);
		
		return profit;
	}

	
	public static int WineTD(int si,int ei , int[] arr,int[][]arr2)
	{
		
		int yr = arr.length-(ei-si+1)+1;
		if(si==ei)
		{
			return arr[0]*yr; 
		}
		
		if(arr2[si][ei]!=0)
		{return arr2[si][ei];}
		int profit=0;
		
		
		int a = WineTD(si+1, ei, arr, arr2);
		int b = WineTD(si, ei-1, arr, arr2);
	   
		profit = profit+Math.max(a+arr[si]*yr, b+arr[ei]*yr);
		arr2[si][ei]=profit;
		return profit;
	}
	public static int WineBU(int [] arr)
	{
		int n = arr.length;
		
		int[][] strg = new int[n][n];
		
		for(int slide=0;slide<n;slide++)
		{
			for(int si=0;si<=n-slide-1;si++)
			{
				int ei = si+slide;
				
				// logic same as TD
				int yr = arr.length-(ei-si+1)+1;
				if(si==ei)
				{
					strg[si][ei]= arr[0]*yr; 
				}
				
				else {
				
				int a = strg[si+1][ei]+arr[si]*yr;
				int b = strg[si][ei-1]+arr[ei]*yr;
			   
				int profit = Math.max(a, b);
				strg[si][ei]=profit;
				
				}
			}
		}
		return strg[0][n-1];
	}

}
