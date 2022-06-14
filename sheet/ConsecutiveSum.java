package sheet;

public class ConsecutiveSum {

	public static void main(String[] args) {
		
	 int n = 9;
	 double d = 2*n+(1/4);
	 d = Math.sqrt(d);
	 
	 d=d+1/2;
	 int ans = (int)d;
	int fans=0;
	 for(int a=1;a<ans;a++)
	 {
		 if( (n-(a)*(a-1)/2)%a==0 )
		 {fans++;}
	 }
	 System.out.print(fans+" ");
	 
	}

}
