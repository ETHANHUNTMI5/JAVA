package sheet;

import java.util.ArrayList;

public class ReverseVowel {

	public static void main(String[] args) {
		
		String s = "leetcode";
		char [] arr = s.toCharArray();
		
		ArrayList<Character> ll = new ArrayList<Character>();
		
		int n = arr.length;
				
		for(int a=0;a<n;a++)
		{
			if(arr[a]=='a' ||arr[a]=='e'||arr[a]=='i' ||arr[a]=='o' ||arr[a]=='u')
			{
				ll.add(arr[a]);}
		}
	
		int b = ll.size()-1;
		
		for(int a=0;a<n;a++)
		{
			if(arr[a]=='a' ||arr[a]=='e' ||arr[a]=='i' ||arr[a]=='o' ||arr[a]=='u')
			{arr[a]=ll.get(b);
			b--;}
			
		}
		String ans =new String(arr);
		System.out.println(ans);
	}

}
