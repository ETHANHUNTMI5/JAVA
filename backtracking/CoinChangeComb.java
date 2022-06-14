package backtracking;

public class CoinChangeComb {

	public static void main(String[] args) {
		int [] arr = {2,3,5,6};
		
	Combi(arr, 10, 0, "");
	}

	public static void Combi(int [] arr , int amount, int lastindex,String ans)
	{
	 
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		
		
		for(int i = lastindex;i<arr.length;i++)
		{
			if(arr[i]<=amount)
			{
				Combi(arr, amount-arr[i],i, ans+arr[i]);
			
				
				
			}
			
			
		}
		
	
	}
}
