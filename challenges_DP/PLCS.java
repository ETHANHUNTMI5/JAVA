package challenges_DP;

import java.util.Scanner;

public class PLCS {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		System.out.println(LCSBU(s1, s2));
	}
	public static String LCSBU(String s1,String s2)
	{
	  int [][] arr = new int[s1.length()+1][s2.length()+1];	

	  String ans="";
	  for(int row = s1.length()-1;row>=0;row--)
	  {
		  for(int col = s2.length()-1;col>=0;col--)
		  {
			  
			  if(s1.charAt(row)==s2.charAt(col))
			  {
				  
				  arr[row][col]=arr[row+1][col+1]+1;
			  }
			  else
			  {
				  arr[row][col]= Math.max(arr[row+1][col], arr[row][col+1]);
				  
			  }
			  
		  }
		  
	  }
	  
	  int i = 0;
	  int j = 0;
	  
	   while(i!=s1.length() && j!=s2.length())
	  {
		  if(arr[i][j]==arr[i+1][j])
		  {i++;}
		 
		  else if(arr[i][j]==arr[i][j+1])
		  {j++;}
		  
		  else
		  {
			  ans = ans+s1.charAt(i);
			  i++;
			  j++;
			  
		  }
			  
		  
	  }
	  
	  return ans;


	}

}
