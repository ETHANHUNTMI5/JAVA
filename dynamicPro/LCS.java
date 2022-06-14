package dynamicPro;

public class LCS {

	public static void main(String[] args) {
	
		String s1 ="aech";
		String s2 = "abcd";
		System.out.println(LCSRec(s1,s2));
		System.out.println(LCSRec2(s1,s2, 0, 0));
		System.out.println(LCSBU(s1,s2));
		int [][] arr = new int[s1.length()][s2.length()];
		
		for(int i=0;i<s1.length();i++)
		{for(int j=0;j<s2.length();j++)
			{
			arr[i][j]=-1;
			}
		}
		System.out.println(LCSTD(s1,s2, 0, 0, arr));
	}
	public static int LCSRec(String s1,String s2)
	{ //using substring as well
		
		if(s1.length()==0 || s2.length()==0)
		{return 0;}
		if(s1.charAt(0)==s2.charAt(0))
		{
			return 1 + LCSRec(s1.substring(1), s2.substring(1));
		}
		
		else
		{
			int f1 = LCSRec(s1.substring(1), s2);
			int f2 = LCSRec(s1, s2.substring(1));
			return Math.max(f1, f2);
			
			
		}
		
	}
	
	public static int LCSRec2(String s1,String s2, int vidx1,int vidx2)
	{// without using substring function as its complexity is 0(n)
		// concept of virtual index
		if(s1.length()==vidx1 || s2.length()==vidx2)
		{return 0;}
		if(s1.charAt(vidx1)==s2.charAt(vidx2))
		{
			return 1 + LCSRec2(s1, s2,vidx1+1,vidx2+1);
		}
		
		else
		{
			int f1 = LCSRec2(s1, s2,vidx1+1,vidx2);
			int f2 = LCSRec2(s1, s2,vidx1,vidx2+1);
			return Math.max(f1, f2);
			
			
		}
		
		
		
		
		
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

public static int LCSTD(String s1,String s2, int vidx1,int vidx2,int [][] arr)
{
	// there would be a problem if we store the value 0 every time as it would not know
	// that 0 indicates length (that is LCS) or it is actually not visited
	// Hence fill a value which cannot occur like -1
	if(s1.length()==vidx1 || s2.length()==vidx2)
	{return 0;}
	int ans=0;
	
	if(arr[vidx1][vidx2]!=-1)
	{
		return arr[vidx1][vidx2];
	}
	if(s1.charAt(vidx1)==s2.charAt(vidx2))
	{
		
		ans=1 + LCSTD(s1, s2,vidx1+1,vidx2+1,arr);
	}
	
	else
	{
		int f1 = LCSTD(s1, s2,vidx1+1,vidx2,arr);
		int f2 = LCSTD(s1, s2,vidx1,vidx2+1,arr);
		ans=Math.max(f1, f2);
		
	}
	
	arr[vidx1][vidx2]= ans;
	return ans;
}


	
}
