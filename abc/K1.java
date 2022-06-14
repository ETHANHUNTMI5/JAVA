package abc;

import java.util.ArrayList;
import java.util.Scanner;

public class K1 {

	public static void main(String[] args) {
		String s1 = "axxxxyyyyb";
		String s2 = "xy";
		
		
		StringBuilder x = new StringBuilder(s1);
		
		
		int l = s2.length();
        int idx=x.indexOf(s2);
		
        
		while(idx!=-1) 
		{
		
			x.delete(idx, idx+l);
			
			
			
			
				idx = x.indexOf(s2);
				}
		
	
		System.out.println(x);
		
	}
}