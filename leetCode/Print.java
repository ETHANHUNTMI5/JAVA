package leetCode;

public class Print {

	public static void main(String[] args) {
		
		String s ="PAYPALISHIRING";
		int rows =3;
		int t =rows-2;
		
		if(rows==1 || rows>=s.length())
		{System.out.println(s);}
		else
		{
		
		int n= (s.length()/rows);
	    System.out.println(n);
		int cols = 3*s.length()/2;
		System.out.println(cols);
		
		char [][] arr = new char[rows][cols];
		
		for(int col=0;col<cols;col++)
		{
			for(int row=0;row<rows;row++)
			{
		    arr[row][col]='*';
	
			}
		}
		for(int col=0;col<cols;col++)
		{
			for(int row=0;row<rows;row++)
			{
				if(col%(rows-1)==0)
				{
					int n2 = col/(rows-1)+1;
					int n3=n2*(rows-1)*2;
					//System.out.println(n3+row-(rows-1)*2);
					
					if(n3+row-(rows-1)*2<s.length())
					{
					arr[row][col]=s.charAt(n3+row+-(rows-1)*2);
				}
				}
			}
		}
		
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
		    System.out.print(arr[row][col]+"  ");
	
			}
			System.out.println();}
		
	
		
		// diagonal left
		if(n==0)
		{n=1;}
		int m=n;
		int k=0;
		while(n!=0)
		{k=0;
		int rown=rows-2;
		 int coln=1+(rows-1)*(m-n);
	
		System.out.println(n+"--"+m);
		 int a=0;
			while(k<t && rown>0 && rows+(rows+rows/2)*(m-n)+a<s.length())
			{
				if(coln<cols)
			arr[rown][coln]=s.charAt(rows+(2*rows-2)*a+a);
		
			rown--;
			coln++;
			a++;
			k++;}
			
		n--;}
		
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
		    System.out.print(arr[row][col]+"  ");
	
			}
			System.out.println();}
		
		String ans = "";
		
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				if(arr[row][col]!='*')
				{ans=ans+arr[row][col];}
				
			}
		}
		
		System.out.println(ans);
	}}
	
}
//"PAHNAPLSIIGYIR"
//"PAHNAPLSIIGYIR"