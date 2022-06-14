package recursion;

public class Power {

	public static void main(String[] args) {
	
		int n = 2;
		int p= 5;
	
		System.out.println(pow(n,p));
	}

	public static int pow(int n , int p)
	{
	if(p==0)
	{return 1;}
		
		int pnm1=pow(n,p-1);
		int ans = pnm1*n;
		return ans;
		
		
	}
	
}
