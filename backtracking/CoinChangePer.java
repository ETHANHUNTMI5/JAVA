package backtracking;

public class CoinChangePer {

	public static int yo=0;
	public static void main(String[] args) {
	
		int [] arr = {2,3,5,6};
		
		Permu(arr, 10,"");
		}

	public static void Permu(int [] arr , int amount,String ans)
	{
	 
		if(amount==0)
		{yo++;
			System.out.println(yo +" "+ans);
			return;
		}
		
		
		for(int i = 0;i<arr.length;i++)
		{
			
			if(arr[i]<=amount)
			{
				Permu(arr, amount-arr[i],ans+arr[i]);
				
			}
			
			
		}
		
	
	}
}
