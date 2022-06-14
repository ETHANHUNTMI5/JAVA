package backtracking;

public class QueenComb {

	public static void main(String[] args) {
		Comb(0, 2, new boolean [4], "", 0);
		
		
	}

	public static void Comb(int qpsf,int tq , boolean [] box,String ans,int lastqueen)
	{
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
			
			
		}
		
		for(int a=lastqueen;a<box.length;a++)
		{
			if(box[a]==false)
			{
				box[a]=true;
				Comb(qpsf+1, tq, box, ans+"q" + " at b"+a  +"   ",a);
				box[a]=false;
			}
			
			
			
		}
		
		
		
	}
}
