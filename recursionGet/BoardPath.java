package recursionGet;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		
		System.out.println(getBoard(0, 10));
	}

	
	public static ArrayList<String> getBoard(int s,int end)
	{ArrayList<String> mr = new ArrayList<>() ;
		
	if(s==end)
	{ArrayList<String> br = new ArrayList<String>() ;
	br.add("");
	return br;}
	
	if(s>end)
	{ArrayList<String> br = new ArrayList<String>() ;
	return br;}
	
	
	
		for(int dice=1;dice<=6;dice++)
		{
			ArrayList<String> rr = getBoard(s+dice, end);
			
			for(int a =0;a<rr.size();a++)
			{
				String str = rr.get(a);
				
				
				mr.add(dice + str);
			}
			
		}
		
		return mr;
		
		
		
	}
	
}
