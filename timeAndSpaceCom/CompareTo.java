package timeAndSpaceCom;

public class CompareTo {

	public static void main(String[] args) {

		 String [] arr = {"Pujit","Manan","Himanshu","Anmol","Raj"}; 
		   display(arr);	 
		 bubble(arr);

	 }
 
	 public static void bubble(String [] arr)
	    {
	    	for(int a=0;a<arr.length-1;a++)
	    	{System.out.println(a);
	    		for(int j=0;j<arr.length-1-a;j++)
	    		{if(arr[j].compareTo(arr[j+1])>0)
	    		{String temp=arr[j];
	    		arr[j]=arr[j+1];
	    		arr[j+1]=temp;}
	    		display(arr);
	    				
	    		}
	    	}
	    	
	    	
	    }
	    public static void display(String [] arr)
	    {for(int a=0;a<arr.length;a++)
	    	{System.out.print(arr[a] + " ");}
	    System.out.println();}
	    
	}
 	

