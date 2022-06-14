package leetCode;

import java.util.ArrayList;

public class NQueen {

	public static ArrayList<ArrayList<String>> lla= new ArrayList<ArrayList<String>>(); 
	public static ArrayList<String> ll = new ArrayList<String>();
	public static int count=0;
	public static void main(String[] args) {
		
		int n =4;
		boolean [][] arr = new boolean[n][n];
		Queen(0,arr, n, 0, 0, "");
		
		
		
		for(int a=0;a<ll.size();a++)
		{
			String s = ll.get(a);
			ArrayList<String> base = new ArrayList<String>();
			
			String dot2="";
			
			for(int k=0;k<n;k++)
			{
				dot2=dot2+".";
			}
			StringBuilder dot = new StringBuilder(dot2);
			
			
			int t=0;
			for(int b=0;b<s.length();b++)
			{
				char cc=' ';
				
				cc= s.charAt(b);
				
				if(cc==',')
				{
					int si = b;
					char cc2 = s.charAt(si+1);
					int ei=si;
					
					while(cc2!=')')
					{
						ei++;
						cc2=s.charAt(ei);
					}
					
					
					String op = s.substring(si+1,ei);
					int get = Integer.parseInt(op);
					
					dot.setCharAt(get, 'Q');
					base.add(dot.toString());
					dot.setCharAt(get, '.');
					
				t++;}
				
			}
			
              lla.add(base);}
		
		System.out.println(lla);
		System.out.println(count);
	}
	
	public static void Queen(int qpsf,boolean[][]arr,int n,int row,int col,String ans)
	{
	
		
		if(qpsf==n)
		{	count++;
			ll.add(ans);
			return;
		}
		
		if(col==n)
		{
			col=0;
			row=row+1;
		}
		
		if(row==n)
		{
		return;
		}
			
		
		
		
		if(isItSafe(arr, row, col))
		{
			arr[row][col]=true;
			Queen(qpsf+1,arr, n, row+1,0,ans+"("+row+","+col+")");
			arr[row][col]=false;
		}
		
		
		Queen(qpsf,arr, n, row, col+1,ans);
		
	}

	public static boolean isItSafe(boolean[][] board,int row,int col)
	{
		for(int i=row,j=col;i>=0;i--)
		{
			if(board[i][j])
			{return false;}
			
		}
		
		for(int i =row,j=col;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j])
			{return false;}
			
		}
		
		for(int i = row,j=col;i>=0 && j<board[row].length;i--,j++)
		{
			
			if(board[i][j])
			{return false;}
		
		}
		
		
		
	return true;}


}
