package bst;

public class BST {
	
	private class Node
	{
		int data ;
		Node left;
		Node right;
		
		
		
	}
	private Node root;
	
	public BST(int [] arr) {
		this.root=construct(arr, 0, arr.length-1);
		
	}

	private Node construct(int [] arr , int lo, int hi)
	{
		if(lo>hi)
		{return null;}
		
		int mid = (lo+hi)/2;
		
		
		Node nn = new Node();
		nn.data=arr[mid];
		
		
		nn.left=construct(arr, lo, mid-1);
		nn.right = construct(arr, mid+1, hi);
		
		return nn;
	}
 
	public  void display()
	{
		this.display(this.root);
	}

   private void display(Node nn)
   {
	   String str = "";
	   
	   if(nn.left!=null)
	   {
		   str+=nn.left.data+"<-";
	   }
	   
	   else
	   {str+="END<-";}
	   
	   str+=" "+nn.data+" ";
	   
	   
	   if(nn.right!=null)
	   {
		   str+="->"+nn.right.data;
		   	   
	   }
	   
	   else
	   {str+="->END";}
	   
	   System.out.println(str);
	   if(nn.left!=null)
	   {this.display(nn.left);}
    
	   if(nn.right!=null)
	   {this.display(nn.right);}
  
	   
   }
   
   
   public boolean Find(int data)
   {
	   return this.Find(this.root,data);
   }
   
   private boolean Find(Node node,int data)
   {
	   if(node == null)
	   {return false;}
	   
	   if(data<node.data)
	   {  return Find(node.left, data);         }
	   
	   else if(data>node.data)
	   {
		   return Find(node.right, data);
	   }
    
	   else
	   {return true;}
   
   }
   
   public void Add(int data)
   {
	   this.Add(this.root, data);
   }
   
   private void Add(Node node , int item)
   {
	   if(item>node.data)
	   {
		   if(node.right==null)
		   {Node nn = new Node();
		   nn.data=item;
		   node.right=nn;}
		   else
		   {
			   Add(node.right, item);
		   }
	   } 
		   else
		   {
			   if(node.left==null)
			   {Node nn = new Node();
			   nn.data=item;
			   node.left=nn;}
			   else
			   {
				   Add(node.left, item);
			   }
			   
			   
		   }
	   }
	   
   public int Max()
   {
	   return this.Max(this.root);
   }
   
   private int Max(Node nn)
   {
	   if(nn.right==null)
	   {
		   return nn.data;
	   }
	   
	   return Max(nn.right);
   }
   
   }

