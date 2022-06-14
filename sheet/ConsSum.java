package sheet;

import java.util.ArrayList;

public class ConsSum {

	public static void main(String[] args) {
		int n =15;
		
		if(n==2)
		{System.out.println(1);
		return;}
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(0);
		 for(int a=1;a<=n;a++)
	        {
	            ll.add(a*(a+1)/2);
	            }

	        int ans =0;
	        
	        for(int a=0;a<=n/2;a++)
	        {
	            int get = ll.get(a);
	            
	            if(ll.contains(get+n))
	            {ans++;}
	            
	        }
	        System.out.println(ans+1);
	}

}
