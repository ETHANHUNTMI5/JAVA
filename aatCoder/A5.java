package aatCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A5 {
	public static void main(String[] args) {
		
		 int [] arr = {0,3,6,7,7};
		 Arrays.sort(arr);
		 System.out.println(binary(arr, 3));
    }
	
	public static int binary(int [] arr,int num)
	{
		int n = arr.length;
		int lo = 0;
		int hi = n-1;
		
		while(lo<hi)
		{
			int mid=((lo+hi)/2);
			if(arr[mid]==num)
			{hi=mid;}
			else if(arr[mid]<num)
			{lo = mid+1;}
			else
			{hi = mid-1;}
			System.out.println(lo+" "+hi);
		}
		
		return lo;
	}
	
}
