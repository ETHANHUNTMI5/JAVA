package backtracking;

public class QueenCombBOX {

	public static void main(String[] args) {
		
 
		QueenBox(new boolean[4], 0, 0, 2, "");
		
	}

	
	public static void QueenBox(boolean[] arr,int col,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{System.out.println(ans);
		return;}
		
		if(col==arr.length)
		{return;}
		
		
		arr[col]=true;
		QueenBox(arr, col+1, qpsf+1, tq, ans+"b"+col+" ");
		arr[col]=false;
		
		
		QueenBox(arr, col+1, qpsf, tq, ans);
		
	}

}
