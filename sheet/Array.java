package sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Array {

	public static void main(String[] args) {
	
		int [] arr = {1,2,3,4,5,6,7};
		
		int k =3;
		int n = arr.length;
		
		k = k%n;
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a=0;a<n;a++)
		{
			map.put(a,arr[a]);
		}
		
		for(int a=0;a<n;a++)
		{
			arr[a]= map.get((n-k+a)%n);
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		// to reverse
		//Collections.reverse(Arrays.asList(arr));
		
	}

}
