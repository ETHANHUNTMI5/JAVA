package challenges_Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumItUP {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=scn.nextInt();
			
		}
		
		bubble(arr);
		
		
		int target = scn.nextInt();
		

		ArrayList<String> ans=Combi(arr, target, 0,0);
 
		Collections.sort(ans);
	  
		System.out.println(ans.get(0));
		 for(int a=1;a<ans.size();a++)
		 {
			 if(!ans.get(a).equals(ans.get(a-1)))
			 	 System.out.println(ans.get(a));
			 
		 }
	
	}
	
	public static void bubble(int [] arr)
	{
		for(int a=0;a<arr.length-1;a++)
		
			for(int j=0;j<arr.length-1-a;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
						}
	
	}
	
	
	public static ArrayList<String > Combi(int [] arr , int amount, int lastindex,int present)
	{
  
		if(amount==present)
		{
			ArrayList<String > br = new ArrayList<String>();
			br.add("");
			return br;
			
		}
		 
		if(present>amount)
		{
			ArrayList<String > br = new ArrayList<String>();
			
			return br;
			
		}
		
		 ArrayList<String > mr = new ArrayList<String>();  
		
		 for(int i =lastindex;i<arr.length;i++)
		 {
			 
			 ArrayList<String > rr = Combi(arr, amount, i+1,present + arr[i]);
			 

			
			 
			 
				for(int a =0;a<rr.size();a++)
				{
					String str = rr.get(a);
					
					
					mr.add(arr[i] +" "+ str);
				}
			 
		 }
	
	
	
	
	
	
	return mr;}
	

}