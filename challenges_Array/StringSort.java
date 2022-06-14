package challenges_Array;


import java.util.Scanner;

public class StringSort {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
            int n = scn.nextInt();
            scn.nextLine();
            String [] arr = new String[n];
		
            take(arr);
            bubble(arr);
           
            display(arr);
    
            
            
            
           
	}

	public static void bubble(String [] arr)
	{
		 {
		    	for(int a=0;a<arr.length;a++)
		    	{
		    		for(int j=a+1;j<arr.length;j++)
		    		{
		    			
		    			int l1 = arr[a].length();
		    			int l2 = arr[j].length();
		    			
		   if(l1!=l2)//first check for word within word i.e bat in batman
		  				
   			{	int len = Math.min(l1, l2);
		    			
		    			
		    			String s1 = arr[a].substring(0,len);
		    			String s2 = arr[j].substring(0,len);
		    			
		    			if(s1.equals(s2))
		    			{
		    				if(l1<l2)// one with smaller length is treated as larger
		    				{
		    				String	temp=arr[a];
		                         arr[a]=arr[j];
		                         arr[j]=temp;
		                     
		    					
		    					
		    				}
		    				continue;// if we have swapped we escape from the inner for loop for
		    				         // next iteration
		    			}
		    			
		    			
		    			
		    			}
		    			
		    		if(arr[a].compareTo(arr[j])>0)
		    		{String temp=arr[j];
		    		arr[j]=arr[a];
		    		arr[a]=temp;}
		    				
		    		}
		    	}
		    	
		    	
		    }
		   
		
		
		
		
		
	}
	
	public static void take(String[] arr)
	{
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=scn.nextLine();
			//scn.nextLine();
		}
		
	}
	
	
	public static void display(String [] arr)
    {for(int a=0;a<arr.length;a++)
    	{System.out.println(arr[a]);}
    }
    
}

//String temp;
//Scanner sc = new Scanner (System.in);
//int n= sc.nextInt();
//String str [] = new String[n];
//for(int i=0;i<n;i++)
//{
//	str[i]= sc.next();
//}
//
//for(int i=0;i<n;i++)
//{
//	for(int j=i+1;j<n;j++)
//	{
//        int l1 = str[i].length();
//        int l2 = str[j].length();
//        if(l1 != l2)
//        {
//            int len = Math.min(l1, l2);
//            String s1 = str[i].substring(0, len);
//            String s2 = str[j].substring(0, len);
//            if(s1.compareTo(s2) == 0)
//            {
//                if(l1 < l2)
//                {
//                    temp=str[i];
//                    str[i]=str[j];
//                    str[j]=temp;
//                }
//                continue;
//            }
//        }
//        if(str[i].compareTo(str[j]) > 0)
//        {
//            temp=str[i];
//			str[i]=str[j];
//			str[j]=temp;
//        }
//	}
//}
//for(int i=0;i<n;i++)
//{
//	System.out.println(str[i]);
//}
//
//}
//
//}




