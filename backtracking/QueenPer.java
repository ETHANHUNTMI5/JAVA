package backtracking;

public class QueenPer {

	public static void main(String[] args) {
		 boolean [] box= new boolean[4];
		Perm(0, 2,box, "");
		
	}

	public static void Perm(int qpsf,int tq , boolean [] box,String ans)
	{
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
			
			
		}
		
		for(int a=0;a<box.length;a++)
		{
			if(box[a]==false)
			{
				box[a]=true;
				Perm(qpsf+1, tq, box, ans+"q"+qpsf+" at b"+a +"   ");
				box[a]=false;
			}
			
			
			
		}
		
		
		
	}
}
