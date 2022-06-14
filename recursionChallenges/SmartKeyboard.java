package recursionChallenges;

import java.util.Scanner;

public class SmartKeyboard {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		String[] arr = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
		int b=0,rev=0;
		while(n!=0)
		{b=n%10;
		rev=rev*10+b;
		
		n=n/10;}
		Smart(arr, rev, "", "");
	
			}

	 public static void Smart(String [] arr,int rev,String q,String ans)
	 {
		 if(rev==0)
		 {System.out.println(ans);
		 return;}
		 
		 int c=0;
		 if(rev!=0)
		 {
			 c=rev%10;
			q= arr[c]; 
			
			for(int a=0;a<q.length();a++)
			{char ch = q.charAt(a);
			Smart(arr, rev/10, " ", ans+ch);}
			 
			 }
		 
		 
		 
	 } 
	
	
}
