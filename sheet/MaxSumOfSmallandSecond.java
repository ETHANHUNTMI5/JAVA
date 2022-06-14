package sheet;

public class MaxSumOfSmallandSecond {

	public static void main(String[] args) {
		
		int [] arr = {4,2,1,1,6};
		
		int n = arr.length;
		
		int ans = -1;
	
		for(int a=0;a<=n-2;a++)
		{
			ans = Math.max(ans, arr[a]+arr[a+1]);
		}
	
	System.out.println(ans);
	}
	

}
