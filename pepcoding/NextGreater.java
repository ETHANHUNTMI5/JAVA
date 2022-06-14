package pepcoding;


public class NextGreater {

	public static void main(String[] args) {
		int [] arr = {2 ,5 ,9 ,3 ,1, 12, 6, 8 ,7};
	
		int [] ans = solve(arr);
		
		for(int i : ans)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] solve(int[] arr){
		   
		   int n = arr.length;
		   int [] ans = new int[n];
		   
		   ans[n-1]=-1;
		   java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		   stack.push(arr[n-1]);
		   
		   
		   for(int a=n-2;a>=0;a--)
		   {
		      
		      if(stack.isEmpty())
		      {
		          ans[a]=-1;
		          stack.push(arr[a]);
		          continue;
		      }
		      
		      int p = stack.peek();
		      
		      
		      if(p<arr[a])
		      {
		    	  
		    	  while(! stack.isEmpty() && p<=arr[a])
		          {
		        	  stack.pop();
		        	  if(stack.isEmpty())
		        	  {
		        		  break;
		        	  }
		        	  p = stack.peek();
		             
		          }
		          
		          if(!stack.isEmpty())
		          {
		              ans[a]=stack.peek();
		          }
		          
		          else
		          {
		              ans[a]=-1;
		          }
		      }
		      
		      else
		      {
		          ans[a]=p;
		      }
		      
		      stack.push(arr[a]);
		       
		   }
		   
		   
		   
		   return ans;
		 }

		}