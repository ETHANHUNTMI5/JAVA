package recursionChallenges;

import java.util.Scanner;

public class TilingPro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
      for(int a=1;a<=t;a++)	
		{int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(tiling(1, 1, n, m,m));
}
		
	}

	public static int tiling(int cr , int cc,int lr ,int lc,int m)
	{
		if(cr==lr+1 && cc==lc+1)
		{return 1;}
		
		else if(cr>lr+1 || cc>lc+1)
		{return 0;}
		
		int count =0;
		
		count = count+tiling(cr+1, cc+m, lr, lc,m);//h
		count = count+tiling(cr+m, cc+1, lr, lc,m);//v
	
	
	return count;
	}
}
