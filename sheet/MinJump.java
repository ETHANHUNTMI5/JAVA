package sheet;

public class MinJump {

	public static void main(String[] args) {
		
		int n = 0;
		String s="kk";
		char [] arr = new String(s).toCharArray();
		
		
	n = Math.abs(n);
	int a=1;
	
	while(sum(a)<n || ((sum(a)-n)&1)>0)
	{	
		a++;
	}
	
System.out.println(a);
		
	}
	public static int sum(int n)
	{
		return (n*(n+1))/2;
	}

}
