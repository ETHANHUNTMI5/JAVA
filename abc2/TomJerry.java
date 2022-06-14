package abc2;

import java.util.Scanner;

public class TomJerry {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int w=1;w<=t;w++)
        {
        	int x1= scn.nextInt();
        	int y1= scn.nextInt();
        	int x2 = scn.nextInt();
        	int y2 = scn.nextInt();
        	int k = scn.nextInt();
        	
        	int ans = Math.abs(y2-y1)+Math.abs(x2-x1);
        	
        	if(ans%2==0)
        	{
        		if(k%2==0 && k>=ans)
        		{System.out.println("YES");}
        		
        		else
        		{System.out.println("NO");}
        		
        	}
        	
        	else
        	{
        		if(k%2!=0 && k>=ans)
        		{System.out.println("YES");}
        		
        		else
        		{System.out.println("NO");}
        		
        		
        		
        	}
        	
        	
        	
        }
		
	}

}
