package aatCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prac {
public static ArrayList<String> fans = new ArrayList<>();
	public static void main(String[] args) {
		 String s = "abcde";
		 int n = 3;
	        char [] arr = s.toCharArray();
	        Arrays.sort(arr);

	        System.out.println(s);
	      s ="";
	        for(char c : arr)
	        {
	        s=s+c;	
	        }
	        kar(arr, 0, n, arr.length, "");
	        System.out.println(s);
	        System.out.println(fans);
	        
	}
	public static void kar(char[] arr,int idx,int n ,int maxlen,String f)
	{
		if(f.length()==n)
		{fans.add(f);
		return;}
		
		if(f.length()>n || idx==maxlen)
		{
			return;
		}
		
		kar(arr,idx+1,n,maxlen,f+arr[idx]);
		kar(arr,idx+1,n,maxlen,f);
		
		
	}
}