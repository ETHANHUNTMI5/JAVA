package recursionPrint;

public class BoardPath {

	public static void main(String[] args) {
		Board(0,"", 10);
		System.out.println(boardNum(0, 10));
	}
	
	public static void Board(int s,String ans,int data)
	{
		if(s==data)
		{System.out.println(ans);
			return;}
	
		if(s>data)
		{return;}
	
		for(int dice=1;dice<=6;dice++)
		{
			Board(s+dice, ans+dice, data);
				
		}
		
		
		
		
	}
	
	public static int boardNum(int s,int data)
	{
		if(s==data)
		{
			return 1;}
	
		if(s>data)
		{return 0;}
	int count =0;
		for(int dice=1;dice<=6;dice++)
		{
			count = count+boardNum(s+dice,data);
				
		}
		
		return count;
		
	}

}
