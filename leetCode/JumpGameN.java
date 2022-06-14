package leetCode;

public class JumpGameN {

	public static void main(String[] args) {
		
		int [] arr = {1,0,0,3};
		
		int n = arr.length;
		
		boolean [] ans = new boolean[n];
		
		ans[n-1]=true;
		
		for(int a=n-2;a>=0;a--)
		{
			z:for(int b=0;b<=arr[a];b++)
			{
				if(ans[a+b])
				{
					ans[a]=true;
					break z;
				}
				
			}
			
		}
		
		for(boolean b : ans)
		{System.out.print(b+" ");}
		
		System.out.println();
		System.out.println(ans[0]);
		
	}

}
