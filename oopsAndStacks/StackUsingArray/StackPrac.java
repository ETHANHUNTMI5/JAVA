package oopsAndStacks.StackUsingArray;

public class StackPrac {

	int [] data;

	int top;
	
	public StackPrac(int size) throws Exception {
	
		if(size<1)
		{
			throw new Exception("Not Possible");
		}
		
		this.top=-1;
		this.data=new int[size];
	}
	
	public int length()
	{
		return top+1;
		
	}
	
	public boolean isEmpty()
	{
		
		return this.length()==0;
				
	}
	
	
	
	public void push(int item)
	{
		if(this.length()==this.data.length)
		{
			int [] arr = new int[this.length()*2];
		
		
		for(int a=0;a<this.length();a++)
		{
			arr[a]=this.data[a];
		}
		
		this.data=arr;
		}

		this.data[this.top+1]=item;
		this.top++;
		
	}
	
	public int pop() throws Exception
	{
		if(this.length()==0)
		{
			throw new Exception("Stack is already empty");
		}
		
		int pp = this.data[top];
		this.data[this.top]=0;
		top--;
		return pp;
		
	}
	
	public int peek() throws Exception
	{
		if(this.length()==0)
		{throw new Exception("Stack is Empty");}
		
		int p = this.data[this.top];
		
		return p;
		
	}
	
	public void display()
	{
		for(int a=this.top;a>=0;a--)
		{
			System.out.print(this.data[a]+" ");
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		StackPrac stack = new StackPrac(5);
		
		for(int a=1;a<=5;a++)
		{
			stack.push(a);
			
		}
		for(int a=1;a<=5;a++)
		{
			stack.push(a);
			
		}
		
		stack.push(10);
		System.out.println(stack.length());
		System.out.println(stack.data.length);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		stack.display();
		
	}

}
