package recursionChallenges;

public class PowerFun {

	public static void main(String[] args) {
		System.out.println(power(3, 6));
	}

	public static int power(int x , int n)
	{
		if(n==0)
		{return 1;}
		
		int pnb2= power (x,n/2);
		
		
		if(n%2==0)
		{
			return pnb2*pnb2;
		}
		else
		{
			return pnb2*pnb2*x;
			
		}
		
		
	}
}
