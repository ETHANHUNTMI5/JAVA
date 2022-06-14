package oopsAndStacks;


public class Students {
  
	private String name;
	//final means value can be set once and is fixed now.Can be public.
	public final int RollNo;
	
	
	// static means that it does not belong to any instance variable but to the whole class
	//to get name
	public String getName()
	{
		return this.name;
		
	}
	
	// to set the name
	public void setName(String name) throws Exception
	{ 
		// business rules checked
		if(name=="" || name==null)
		{
			throw new Exception("Not a valid name.");
			
		}
		
		this.name=name;
		
	}
	
	private static int NumberOfStudents=0;
	public static final int  MaxStudents=1000;
	
	
	
	//Get no. of students
	
	public static int GeNumOfStu()
	{
		return Students.NumberOfStudents;
	}
	
	//Constructor
	public Students(String name) throws Exception
	{
		if(Students.NumberOfStudents == Students.MaxStudents)
		{throw new Exception("Max limit reached");
		}
		
	 
		 this.setName(name);
		 Students.NumberOfStudents++;
		 this.RollNo=Students.NumberOfStudents;
		  
		
		
		
		
	}
	
	public static void StaticFunction() {
		//can access only static data members
		System.out.println(Students.NumberOfStudents+" out of "+Students.MaxStudents);		
	}
	
	public void NonStaticFunction() {
		// can access both static and non static data members
		System.out.println(this.name +" says hi to "+ Students.MaxStudents+" students");
	}
	
	private static String  uni = "white";
	
	public static String getuni()
	{
		return Students.uni;
		
	}
	
	public static void setUni(String newUni)
	{
         Students.uni=newUni;
		
		
	}
}
