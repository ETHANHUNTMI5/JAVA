package oopsAndStacks.StackUsingArray;

public class StackUsingArrays {

	 protected int [] data;
	 protected int top;
	 public static final int Default_Capacity=10;
	 
	
	 
	 
	 public StackUsingArrays() throws Exception
	 {
		 this(Default_Capacity);
	 }
	 
	 public StackUsingArrays(int capacity) throws Exception {
		 
		 if(capacity<1)
		 {
			 throw new Exception("Not a valid size");
		 }
		 
		this.data= new int[capacity];
		this.top=-1;
	 }
	 
	 public int size()
	 {
		 return top+1;
	 }
	
	 public boolean isEmpty()
	 {
		return this.size()==0; 
		
	 }
	 
	 public void push(int n) throws Exception
	 {
		 if(this.size()==this.data.length)
		 {
			 throw new Exception("limit reached");
		 }
		 
		 this.top++;
		 this.data[this.top]=n;
		 
	 }
	 
	 public int pop() throws Exception
	 {
		 if(this.size()==0)
		 {
			 throw new Exception("not possible");
		 }
		 
		 int num= this.data[this.top];
		 this.data[this.top]=0;
		 top--;
		 return num;
		 
		 
	 }
	 
	 public int top() throws Exception
	 {
		 if(this.size()==0)
		 {
			 throw new Exception("not possible");
		 }
		 
		 int num= this.data[this.top];
		
		 return num;
		 
		 
	 }
	 
	 public void display()
	 {
		 for(int i = this.top;i>=0;i--)
		 {
			 System.out.print(this.data[i]+" , ");
		 }
		      
		 System.out.println("END");
		  
	 }
	
	 
	 
}
