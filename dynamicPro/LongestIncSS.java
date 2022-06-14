package dynamicPro;

public class LongestIncSS {

	public static void main(String[] args) {
		int [] arr = {10,9,2,5,3,7,101,18};
	
		
		System.out.println(Lss(arr));
	}
	public static int Lss(int[] arr)
	{
		int n = arr.length;
		
		int[] ans = new int[n];
		for(int a=0;a<n;a++)
		{ans[a]=1;}
		
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					
					if(ans[i]<ans[j]+1)
					ans[i]=ans[j]+1;}
				}
			}
			
		
		for(int k : ans)
		{System.out.print(k+" ");}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(ans[i]>max)
			{max=ans[i];}
		}
		System.out.println();
		return max;

	}

}
