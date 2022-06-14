package recursionGet;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		int cr=0,cc=0,lr=2,lc=2;
		
		System.out.println(getMaze(0, 0, 2, 2));
		
	}
	public static ArrayList<String> getMaze(int cr,int cc,int lr,int lc)
	{
		if(cr==lr && cc ==lc)
		{
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
			
		}
		if(cr>lr || cc >lc)
		{
			ArrayList<String> br = new ArrayList<>();
			return br;
			
		}
		
		
		ArrayList<String> mr = new 	ArrayList<>();  
		ArrayList<String> rr = getMaze(cr+1, cc, lr, lc);
		
		for(int a=0;a<rr.size();a++)
		{
			String str = rr.get(a);
			mr.add("V"+str);
			
		}
		
	ArrayList<String> rr2 = getMaze(cr, cc+1, lr, lc);
		
		for(int a=0;a<rr2.size();a++)
		{
			String str = rr2.get(a);
			mr.add("H"+str);
			
		}
		
		return mr;
		
		
		
	}
//{{"O","X","O","O"},{"O","O","O","X"},{"O","O","X","O"},{"X","O","O","O"},{"X","X","O","O"}};
}
