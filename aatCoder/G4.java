package aatCoder;
import java.util.Scanner;
import java.util.TreeSet;


public class G4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		TreeSet<Integer> lp = new TreeSet<Integer>();
	    
		lp.add(0);
		
		int l = scn.nextInt();
		int q = scn.nextInt();
		
		lp.add(l);
		int [][] arr = new int[(int) q][2];
		
		for(int w=0;w<q;w++)
		{
			int c= scn.nextInt();
			int x = scn.nextInt();
			
			arr[(int) w][0]=c;
			arr[(int) w][1]=x;
		}
		for(int w=0;w<q;w++)
		{
			if(arr[(int) w][0]==1)
			{
				
				lp.add(arr[(int) w][1]);
			}
			
			else
			{
			 
			 int prev= lp.floor(arr[w][1]);
			 int next= lp.ceiling(arr[w][1]);
			 
			 System.out.println(next-prev);
			  
	
			  
			}
			
		}
		
		
	}

}
