package leetCode;

public class Prac {

	public static void main(String[] args) {
		String s = "a1c1e1";
		String ans ="";
		char pre = s.charAt(0);
		for(int a=0;a<s.length();a++)
		{
			char cc = s.charAt(a);
			
			if((int)cc>=97 && (int)cc<=122 )
			{
				ans = ans +cc;
			}
			else
			{
				int y =cc;
				y=y-48;
				int x = (int)pre +y;
				
				ans = ans +(char)x;
			}
			
			
		pre=cc;
		}
		System.out.println(ans);

	}

}
