package longChall;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			int x1= scn.nextInt();
			int y1= scn.nextInt();
			int x2= scn.nextInt();
			int y2= scn.nextInt();
				
			int ans = (x2/x1+ y2/y1);
		
		System.out.println(ans);
		}
		
		
	}

}
