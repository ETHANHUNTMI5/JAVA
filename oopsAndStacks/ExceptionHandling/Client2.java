package oopsAndStacks.ExceptionHandling;

public class Client2 {

	public static void main(String[] args) {

         P obj = new P();
         System.out.println("hello");
         
         try
         {
        	 obj.setAge(-10);
        	 System.out.println("yo");
        	
        	 
        	 System.out.println("try block");
         }
         catch(Exception e)
         {
        	 System.out.println("catch block");
         }
		System.out.println("bye");
		System.out.println(obj.getAge());
	}

}
