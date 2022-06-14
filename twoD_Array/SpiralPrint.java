package twoD_Array;

public class SpiralPrint {

	public static void main(String[] args) {
		int [][] arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		
		Spiral(arr);
		
	}
   public static void Spiral(int [][] arr) {
	  
	   int n= arr.length;

	   int left=0,right=n-1,top=0,bottom=n-1,counter=n*n,d=1;
	   while(counter>0 && top<=bottom&& left<=right)
	   
	   
	   {
		   
		   if(d==1)
		   {for(int a=left;a<=right;a++)
			   {System.out.print(arr[top][a] + ", ");
			   counter--;}
		   
		        d=2;
		        top++;}
		   
		   if(d==2)
		   {for(int a=top;a<=bottom;a++)
		   {System.out.print(arr[a][right] + ", ");
		   counter--;}
	   
	        d=3;
	        right--;}
	   
		   if(d==3)
		   {for(int a=right;a>=left;a--)
		   {System.out.print(arr[bottom][a] + ", ");
		   counter--;}
	   
	        d=4;
	        bottom--;}
	   	   
		   if(d==4)
		   {for(int a=bottom;a>=top;a--)
		   {System.out.print(arr[a][left] + ", ");
		   counter--;}
	   
	        d=1;
	        left++;}
	      
		   
			   
		   }
		   
		   
	   }
 	   
	   
	   
	   
	   
	   
   
   
   
   }
   
   

