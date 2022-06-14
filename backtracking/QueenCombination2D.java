package backtracking;

public class QueenCombination2D {

	public static void main(String[] args) {
	
 QueenBox2DRec(new boolean[2][2], 0,0, 0, 2, "");
 System.out.println("******************");
 QueenBox2D(new boolean[2][2], 0,0, 0, 2, "");
	}

	
	public static void QueenBox2DRec(boolean[][] arr,int col,int row,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{System.out.println(ans);
		return;}
		
		if(row==arr.length)
		{return;}
		
		if(col==arr[row].length)
		{QueenBox2DRec(arr, 0, row+1, qpsf, tq, ans);
			return;
			}
		
				
		arr[row][col]=true;
		QueenBox2DRec(arr, col+1,row, qpsf+1, tq, ans+"r"+row+"c"+col+" ");
		arr[row][col]=false;
		
		
		QueenBox2DRec(arr, col+1,row, qpsf, tq, ans);
		
	}
	
	public static void QueenBox2D(boolean[][] arr,int col,int row,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{System.out.println(ans);
		return;}
		
		if(col==arr[0].length)
		{row++;
		col=0;}
		
		if(row==arr.length)
		{		return;
			}
		
				
		arr[row][col]=true;
		QueenBox2DRec(arr, col+1,row, qpsf+1, tq, ans+"r"+row+"c"+col+" ");
		arr[row][col]=false;
		
		
		QueenBox2DRec(arr, col+1,row, qpsf, tq, ans);
		
	}

}



