package dynamicProgramming;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		
		String s1 = "abcded";
		String s2 = "adecds";
		System.out.println(lcs(s1, s2));
		System.out.println(lcsVIDX(s1, s2,0, 0));
		int[][] strg = new int[s1.length()][s2.length()];
		for(int [] arr : strg)
		{
			Arrays.fill(arr, -1);
		}
		System.out.println(lcsVIDXTop(s1, s2, 0, 0, strg));
		System.out.println(LCSBU(s1, s2));

	}
	public static int lcs(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)return 0;
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		int get = 0;
		if(c1==c2)
		{get = 1+lcs(s1.substring(1), s2.substring(1));}
		else
		{
		get= Math.max(lcs(s1.substring(1), s2), lcs(s1, s2.substring(1)));
		}
		
		return get;
	}

	public static int lcsVIDX(String s1,String s2,int vidx1 ,int vidx2)
	{
		if(s1.length()==vidx1 || s2.length()==vidx2)return 0;
		char c1 = s1.charAt(vidx1);
		char c2 = s2.charAt(vidx2);
		int get = 0;
		if(c1==c2)
		{get = 1+lcsVIDX(s1, s2,vidx1+1,vidx2+1);}
		else
		{
		get= Math.max(lcsVIDX(s1,s2,vidx1+1,vidx2), lcsVIDX(s1, s2,vidx1,vidx2+1));
		}
		
		return get;
	}

	public static int lcsVIDXTop(String s1,String s2,int vidx1 ,int vidx2, int [][] strg)
	{
		if(s1.length()==vidx1 || s2.length()==vidx2)return 0;
		char c1 = s1.charAt(vidx1);
		char c2 = s2.charAt(vidx2);
		
		if(strg[vidx1][vidx2]!=-1)return strg[vidx1][vidx2];
		
		int get = 0;
		if(c1==c2)
		{get = 1+lcsVIDXTop(s1, s2,vidx1+1,vidx2+1,strg);}
		else
		{
		get= Math.max(lcsVIDXTop(s1,s2,vidx1+1,vidx2,strg), lcsVIDXTop(s1, s2,vidx1,vidx2+1,strg));
		}
		
		return strg[vidx1][vidx2]=get;
	}
	public static int LCSBU(String s1,String s2)
	{
	  int [][] arr = new int[s1.length()+1][s2.length()+1];	

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
	  return arr[0][0];


	}
}
