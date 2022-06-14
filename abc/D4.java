package abc;

public class D4 {

	public static void main(String[] args) {
		int A =4;
		int B=3;
		int k =30;
		
	   int c= ncr(A+B-1,B);
		System.out.println(c);
	   int a=1;
		while(c>=k)
		{
			
			c=ncr(A+B-1-a, B);
			System.out.println(a+" "+c);
		
		a++;}
		
		
	}
	public static int fact(int n)
	{
		if(n==0 || n==1)
		{return 1;}
		
		return fact(n-1)*n;
	}

	
	public static int ncr(int n, int r)
	{
		int ans =0;
		ans = fact(n);
		ans = ans/fact(n-r);
		ans = ans/fact(r);
		
		return ans;
		
	}
}
