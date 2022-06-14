package codeFORCES;

import java.util.Scanner;

public class Oath {

	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     int [] arr = new int[n];
     
     int min=Integer.MAX_VALUE;
     int max =0;
     for(int a=0;a<n;a++)
     {
     arr[a]= scn.nextInt();
     
     if(arr[a]<min)
     {	 min= arr[a];}
     
     if(arr[a]>max)
     {max= arr[a];}     
     }
     
     if(n<=2)
     {System.out.println("0");}
     
     else
     {
    	 int sum=0;
    	 for(int a=0;a<n;a++)
    	 {
    		 if(min<arr[a]&& arr[a]<max)
    		 {sum=sum+1;}
    	 }
    	 
    	 System.out.println(sum);
     }
	     
	
	}

}
