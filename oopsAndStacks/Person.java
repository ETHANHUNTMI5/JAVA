package oopsAndStacks;

public class Person {

	private String name;
	private int age;

	public Person()
	{
		System.out.println("Default Constructor");
	}
	
	public Person(int age) {
		System.out.println("Constructor with one parameter");
		this.age=age;
	}
	
	public Person(String name,int age)
	{System.out.println("Constructor with two parameters");
	this.name=name;
	this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}

	
	
  
}