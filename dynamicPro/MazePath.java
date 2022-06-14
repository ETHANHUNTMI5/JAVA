package dynamicPro;

public class MazePath {

	public static void main(String[] args) {
		int n=2;
		System.out.println(MazeRec(0, 0, n, n));
		System.out.println(MazeTD(0, 0, n, n, new int[n+1][n+1]));
		System.out.println(MazeBU(n, n));
		System.out.println(MazeBUSE(n, n));
	}
	public static int MazeRec(int cr,int cc, int er,int ec)
	{
		if(cr>er || cc>ec)
		{return 0;}
		
		if(cc==ec && cr==er)
		{return 1;}
		
		int ch= MazeRec(cr, cc+1, er, ec);
		int cv = MazeRec(cr+1, cc, er, ec);
		
		return ch+cv;
		
	}
	
	public static int MazeTD(int cr,int cc, int er,int ec,int[][] arr)
	{
		if(cr>er || cc>ec)
		{return 0;}
		
		if(cc==ec && cr==er)
		{return 1;}
		
		if(arr[cr][cc]!=0)  // reuse
		{return arr[cr][cc];}
		
		int ch= MazeTD(cr, cc+1, er, ec,arr);
		int cv = MazeTD(cr+1, cc, er, ec,arr);
		
		arr[cr][cc]=ch+cv;  // store the values
		return ch+cv;
		
	}
	public static int MazeBU(int er,int ec)
	{
		int [][] arr = new int[er+2][ec+2];
		
		arr[er][ec]=1;
		
		for(int row=er;row>=0;row--)
		{
			for(int col=ec;col>=0;col--)
			{
				if(row==er && col==ec)
				{
					arr[row][col]=1;
				}
				else
				{
				arr[row][col]= arr[row+1][col]+arr[row][col+1];
				}
			}
		}
		return arr[0][0];
	}
	public static int MazeBUSE(int er,int ec)
	{
		int [] arr = new int[ec+1];
		
		for(int a=0;a<=ec;a++)
		{arr[a]=1;}
		
		for(int slide=1;slide<=er;slide++)
		{
			for(int a=ec-1;a>=0;a--)
			{arr[a]=arr[a]+arr[a+1];}
		}
		
		return arr[0];
	}

}
