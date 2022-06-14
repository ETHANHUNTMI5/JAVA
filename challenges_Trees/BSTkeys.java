package challenges_Trees;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;









public class BSTkeys {

	private class Node{
		int data;
		Node left;
		Node right;
		
	
	

	}



Node root = null;
int size = 0;

	
	
	
	public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
	
     int t = scn.nextInt();
     for(int a=1;a<=t;a++)
     {
    	 int n = scn.nextInt();
    	 int [] arr = new int[n];
    	 int [] pre = new int [n];
    	 
    	 for(int b=0;b<arr.length;b++)
    	 {arr[b]= scn.nextInt();
    	 pre[b]=arr[b];
    	}
    	 
    	 
    	bubble(arr);
    	BSTkeys tree = new BSTkeys();
    	Node root=tree.Build(arr, 0, arr.length-1);
    	
    	 int k1 = scn.nextInt();
    	 int k2 = scn.nextInt();
    	
    	 ArrayList<Integer> ans = new ArrayList<Integer>();
    	 tree.Dis(k1, k2, root, ans);
         Collections.sort(ans);
         System.out.print("# Preorder : ");
        
//         for(int c=0;c<pre.length;c++)
//         {System.out.print(pre[c]+" ");}
//         
          tree.preOrder(root);
         
         System.out.println();
         System.out.print("# Nodes within range are : ");
         
        for(int i=0;i<ans.size();i++)
        {System.out.print(ans.get(i)+" ");}
        	
    	 
     }

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


	   public void Dis(int k1,int k2,Node node,ArrayList<Integer> ans)
	   {
		   if(node ==null)
		   {
			   return;
			  }
		  
		   if(node.data>=k1 && node.data<=k2)
		   {ans.add(node.data);}
		   
		   Dis(k1, k2, node.left, ans);
		   Dis(k1, k2, node.right, ans);
		   
		   
		   
	   }
	   private Node Build(int [] in,int lo,int hi)
		{
			if(lo>hi)
			 {return null; }
			
			int mid = (lo+hi)/2;
			
			Node nn = new Node();
			nn.data=in[mid];
			
			
			nn.left=Build(in, lo, mid-1);
			nn.right=Build(in, mid+1, hi);
			
			return nn;
			
			
			
			
			
		}


	   private void preOrder(Node node)
	    {
	    	if(node == null)
	    	{return;}
	    	
	    	System.out.print(node.data+" ");
	    	preOrder(node.left);
	    	preOrder(node.right);
	    
	   }
	   
	   
	   
}