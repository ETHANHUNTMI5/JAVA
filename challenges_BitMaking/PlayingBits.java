package challenges_BitMaking;

import java.util.Scanner;

public class PlayingBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      
      for(int w=1;w<=t;w++)
      {
    	  int a = scn.nextInt();
    	  int b = scn.nextInt();
    	  
    	  int ans =0;
    	  
    	  
    
    	  for(int x=a;x<=b;x++)
    	  {
    		  int k=x;
    		  //Brian Kernighan’s Algorithm
    		  
         while(k!=0)
    	  {
    		  k=k&(k-1);
    		  ans++;
    	  }
    	  }
    	  System.out.println(ans);

    	  
    	  
    	  
      }
		
		
	}

}
