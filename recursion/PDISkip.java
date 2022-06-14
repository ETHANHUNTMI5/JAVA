package recursion;

public class PDISkip {

	public static void main(String[] args) {
		int n =5;
		PDISkip(n);
	}
  
	public static void PDISkip(int n)
	{
		if(n==0)
		{return;}
		
		if(n%2!=0)
		{System.out.println(n);}
		PDISkip(n-1);
		if(n%2==0)
		System.out.println(n);
		
		
		
	}
}
