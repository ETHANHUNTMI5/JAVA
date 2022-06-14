package functions_Array;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int []array= {55,44,33,22,11};
		display(array);
		
		bubble(array);
	   }
	
    public static void bubble(int [] arr)
    {
    	for(int a=0;a<arr.length-1;a++)
    	{
    		for(int j=0;j<arr.length-1-a;j++)
    		{if(arr[j]>arr[j+1])
    		{int temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;}
    		
    		}
    	}
    	
    	
    }
    public static void display(int [] arr)
    {for(int a=0;a<arr.length;a++)
    	{System.out.print(arr[a] + " ");}
    System.out.println();}
    
}
