package sheet;

public class SurviveOnIsland {

	public static void main(String[] args) {
		int n = 16;
		int s = 10;
		int m=  2;
		
		if(m>n || (6*n<7*m && s<7)) 
		{System.out.println("No");}
		
		
		else 
		{System.out.println("Yes");
		System.out.println((int)Math.ceil((double)(s*m)/n));}
		
		
		
		
		

	}

}
