package oopsAndStacks.ExceptionHandling;

public class Client {

	public static void main(String[] args) throws Exception {
 
	  P obj = new P();
	  System.out.println(obj);
	  
//	  obj.age=-10;
// 
//	  System.out.println(obj.age);
	  
	  obj.setAge(10);
	  System.out.println(obj.getAge());
	  
	  // or next client using try and catch
	  
	  
	}

}
