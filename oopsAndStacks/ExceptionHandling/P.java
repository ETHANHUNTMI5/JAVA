package oopsAndStacks.ExceptionHandling;

public class P {

	private int age;
	
	public void setAge(int age) throws Exception
	{
		if(age<0)
		{
			throw new Exception("not a valid age");
		}
		this.age=age;
		
	}
	
	public int getAge()
	{
	 return this.age;	
	}
	
}
