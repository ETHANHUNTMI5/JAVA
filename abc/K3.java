package abc;


public class K3 {

	public static void main(String[] args)
	{
		int [] arr = {6,2,1,2,4,5};
		
		int n = arr.length;
		
		long[] add = new long[n];
		long[] sub= new long[n];
		
		add[0]= arr[0];
		
		for(int a=1;a<n;a++)
		{
			add[a] = Math.max(add[a-1], sub[a-1]+arr[a]);
			sub[a] = Math.max(sub[a-1], add[a-1]-arr[a]);
		}
		
		System.out.println(Math.max(add[n-1], sub[n-1]));
		
	}
	
}