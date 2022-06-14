package challengesHashAndTries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String[] arr = new String[n];
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextLine();
			
		}
		
	
		
			int m = scn.nextInt();
		   scn.nextLine();
			
			ArrayList<String> list = new ArrayList<String>();
			for(int b=0;b<m;b++)
			{
				String s1 =scn.nextLine();
				
				
				for(int c=0;c<n;c++)
				{
					int l = s1.length();
					
					if(arr[c].substring(0,l).equals(s1))
					{
                        
						list.add(arr[c]);
						}
				}
					Collections.sort(list);
					
					for(String s : list)
					{
						System.out.println(b+ " "+ s);
					}
					
					list.clear();}
			
			}
	

}
