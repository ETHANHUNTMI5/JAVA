package atCoder;

import java.util.Scanner;

public class ABC3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		
		String s = scn.nextLine();
		StringBuilder sb = new StringBuilder(s);
		
		int q = scn.nextInt();
		
		for(int a=1;a<=q;a++)
		{
			
			int t = scn.nextInt();
			int l= scn.nextInt();
			int m = scn.nextInt();
			char cc1=' ';
			char cc2=' ';
			
			if(t==1)
			{
				cc1 = sb.charAt(l-1);
				cc2 = sb.charAt(m-1);
				
				sb.setCharAt(l-1, cc2);
				sb.setCharAt(m-1, cc1);
			}
			
			else
			{
				
				sb=sb.append(sb);
				sb.delete(0,n);
				sb.delete(2*n,3*n);
				
			}
			
		}
		System.out.println(sb);	

	}

	}
