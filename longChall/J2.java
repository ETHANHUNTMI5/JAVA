package longChall;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int D = scn.nextInt();
			int d = scn.nextInt();
			int P = scn.nextInt();
			int Q = scn.nextInt();
			
			
			int ans =0;
			int a=1;
			int b=0;
			int mul=P;
		
		while(a<=D)
		{
			if(b==d)
			{
				mul=mul+Q;
				b=0;
			}
			
			ans = ans+ mul;
			
			
			
		a++;
		b++;
		
		
		}
		
		System.out.println(ans);
		}
		
	}

}
