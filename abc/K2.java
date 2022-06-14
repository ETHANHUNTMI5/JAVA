package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K2 {

		public static boolean check(int arr[], int n)
		{
		     
		    // Stores the count of numbers that
		    // are needed to be removed
		    int count = 0;
		 
		    // Store the index of the element
		    // that needs to be removed
		    int index = -1;
		 
		    // Traverse the range [1, N - 1]
		    for(int i = 1; i <= n - 1; i++)
		    {
		         
		        // If arr[i-1] is greater than
		        // or equal to arr[i]
		        if (arr[i - 1] >= arr[i])
		        {
		             
		            // Increment the count by 1
		            count++;
		 
		            // Update index
		            index = i;
		        }
		    }
		    System.out.println(count);
		 
		    // If count is greater than one
		    if (count > 1)
		        return false;
		 
		    // If no element is removed
		    if (count == 0)
		        return true;
		 
		    // If only the last or the
		    // first element is removed
		    if (index == n - 1 || index == 1)
		        return true;
		 
		    // If a[index] is removed
		    if (arr[index - 1] < arr[index + 1])
		        return true;
		 
		    // If a[index - 1] is removed
		    if (arr[index - 2] < arr[index])
		        return true;
		 
		    return false;
		}
		 
		public static void main(String args[])
		{
		    int []arr = { 100,21,3};
		    int N = arr.length;
		     
		    if (check(arr, N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
		}
		 