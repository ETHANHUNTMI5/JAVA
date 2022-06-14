package twoD_Array;

public class PRACTICE {

	public static void main(String[] args) {
		
		/*
		 * int arr[][] = new int [3][];
		 * 
		 * System.out.println(arr[0]); arr[0]=new int [1]; arr[1]=new int [2];
		 * 
		 * System.out.println(arr[1]);
		 */
		
		int [][] arr = new int [3][3];
		arr[0][0]=1;
		arr[1][1]=1;
		arr[2][2]=1;
				System.out.println("IDENTITY MATRIX");
       display(arr);
	}

	public static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{System.out.print(arr[row][col] + " ");}
			
		System.out.println();
		
		
	}
}
}