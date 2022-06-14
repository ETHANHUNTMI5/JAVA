package sheet;

public class KnightProb {

	public static int fk=0;
	public static void main(String[] args) {
		int n = 8;
		int cr=0;
		int cc=0;
		fk=3;
		System.out.println(tell(0, 0, 8, 0));

	}

	public static double tell(int cr, int cc, int n,int k)
	{
		
		if(cr>=n || cc>=n || cr<0 || cc<0 || k>fk)return 0;
		
		if(k==fk)return 1;
		
		
		
		
		double a1 = tell(cr-2, cc+1, n, k+1);
		double a2 = tell(cr-1, cc+2, n, k+1);
		double a3 = tell(cr+1, cc+2, n, k+1);
		double a4 = tell(cr+2, cc+1, n, k+1);
		double a5 = tell(cr+2, cc-1, n, k+1);
		double a6 = tell(cr+1, cc-2, n, k+1);
		double a7 = tell(cr-1, cc-2, n, k+1);
		double a8 = tell(cr-2, cc-1, n, k+1);
		
		double sum = a1+a2+a3+a4+a5+a6+a7+a8;
		System.out.println(sum);
		
		return sum/8;
	}
}
