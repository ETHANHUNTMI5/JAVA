package challenges_BitMaking;

import java.util.Scanner;

public class UniqueNums {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		int ans=0;
		for(int a=0;a<n;a++)
		{
	   int m = scn.nextInt();
	   ans = ans^m;
		}
		
		System.out.println(ans);
	}

}
