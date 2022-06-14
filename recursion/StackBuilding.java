package recursion;

public class StackBuilding {

	public static void main(String[] args) {
		
		int n = 10;
		PD(n);
		
	}

	public static void PD(int n)
	{
		if(n==0)
		{return;}
		
		System.out.println(n);
		
		PD(n-1);
		
		
	}
}
