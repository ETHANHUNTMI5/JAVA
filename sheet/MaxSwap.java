package sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxSwap {

	public static void main(String[] args) {

		int n =29932215;
	
		 char[] digits = Integer.toString(n).toCharArray();
	        
	        int[] buckets = new int[10];
	        for (int i = 0; i < digits.length; i++) {
	            buckets[digits[i] - '0'] = i;
	        }
	       
	        
	       
	        z:for (int i = 0; i < digits.length; i++) 
	        { for (int k = 9; k > digits[i] - '0'; k--) {
	                if (buckets[k] > i) {
	                    char tmp = digits[i];
	                    digits[i] = digits[buckets[k]];
	                    digits[buckets[k]] = tmp;
	                    break z;
	                }
	            }
	}
	        System.out.println(Integer.valueOf(new String(digits)));        
		
	}
}