package sheet;

public class MaxProductSubset {

	public static void main(String[] args) {
		
		int [] arr = {1,1,2,3,4,0};
		
		int n = arr.length;
		int ze=0;
		int po=0;
		int neg=0;
		int min_neg = Integer.MIN_VALUE;
		
		for(int a=0;a<n;a++)
		{
			if(arr[a]==0)ze++;
			else if(arr[a]>0)po++;
			else
			{
				neg++;
				min_neg = Math.max(min_neg, arr[a]);
			}
		}
		int ans=1;
		if(neg%2==0)
		{
			for(int a=0;a<n;a++)
			{if(arr[a]!=0)ans*=arr[a];}
		}
		
		else if(neg%2!=0 && po>0)
		{
			for(int a=0;a<n;a++)
			{if(arr[a]!=0)ans*=arr[a];
			
			ans = ans/min_neg;
			}
		}
		else
		{ans=0;}
	System.out.println(ans);
	}

}
