package challenges_Backtracking;

import java.util.Scanner;

public class ClassAssignment {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int [] arr = new int [t];
		
		for(int a=0;a<arr.length;a++)
		{
			arr[a]= scn.nextInt();
		
		}
		
		for(int a=0;a<arr.length;a++)
		{
			int k = a+1;
			System.out.println("#"+k+" : "+answer(arr[a], ""));		
		}
		
		
	
		
	}

	
	public static int answer(int length,String s)
	{
		if(s.length()==length)
		{
		return 1;
		}
		
	int a1=0;
	int b1 =0;
	
	a1=a1+	answer(length, s+"a");
		
		if(s.length()==0 || s.charAt(s.length()-1)!='b')
	b1=b1+answer(length, s+ "b");
		
		return a1+b1;
	}
}

