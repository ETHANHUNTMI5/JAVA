package twoD_Array;

public class WavePrint {

	public static void main(String[] args) {

		int [][] arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		
		Waveprint(arr);
	}
   public static void Waveprint(int [][] arr) {
	   int n= arr.length;
	   for(int a=0;a<n;a++)
	   {if(a%2==0)
	   {for(int b=0;b<n;b++)
	   {System.out.print(arr[a][b]+ " ");}
		   
	   }
	   
	   else
	   {for(int b=n-1;b>=0;b--)
	   {System.out.print(arr[a][b] + " ") ;}
		}
		   
	   System.out.println();}
	   
   }
   }

