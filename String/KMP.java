package String;

public class KMP {

	public static void main(String[] args) {
		
		String s = "abcabcd";
		String t = "abc";
		
		int n = s.length();
		int [] pre = new int[n];
		
		for(int a=1;a<n;a++)
		{
			int b = pre[a-1];
			char c1 = s.charAt(a);
			char c2 = s.charAt(b);
			
			while(b!=0 && c1!=c2)
			{
				b--;
			}
			
			if(c1==c2)
			{
				b++;
				pre[a]=b;
				
			}
			
		}
		
		for(int i : pre)
		{System.out.print(i+" ");}
	}

}


