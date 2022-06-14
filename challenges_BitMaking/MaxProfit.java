package challenges_BitMaking;

import java.util.Scanner;

public class MaxProfit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         int b= scn.nextInt();
         
         int ans = a^b;
         
         for(int x=a;x<b;x++)
         {
        	 for(int y = a+1;y<=b;y++)
        	 {
        		 if((x^y)>ans)
        		 {
        			 ans = x^y;
        		 }
        	 }
         }
         
         System.out.println(ans);
	}

}
