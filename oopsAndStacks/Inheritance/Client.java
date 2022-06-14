package oopsAndStacks.Inheritance;

public class Client {

	public static void main(String[] args) {
	
		
		 // reference objX = new instance()
		
		System.out.println("-----CASE 1-----");
		
		P obj1 = new P();           

		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		// while writing the code the entire control is with the compiler
		// compiler looks at the left side of the statement
		
		// while the program is running the entire control is with the JVM
		// JVM looks at the right side of the statement
		   System.out.println("**********************");
		
   System.out.println("-----CASE 2-----");
		
		P obj2 = new C();

		System.out.println(obj2.d);   // d would be printed based on reference (in this case P)
		System.out.println(((C)obj2).d);// printing d of C using type cast
		System.out.println(obj2.d1);
		
  //System.out.println(obj2.d2);
  // error as compiler is looking at LHS which has only d and d1
	
		System.out.println(((C)obj2).d2);
		//type cast
		
		obj2.fun();  // for function first instance is preferred (C in this case)
		obj2.fun1();
		
		((C)obj2).fun2();
		// type cast
		   System.out.println("**********************");
		   
		   System.out.println("-----CASE 3-----");
		
		  // C obj3 = new P();
		   
		   // gives runtime error as it allows us to access d2 which is now provided space as it is not in P
           // memory is given to only d and d1	
	
		   System.out.println("**********************");
		   
		   System.out.println("-----CASE 4-----");
			
		   
		   C obj4 = new C();
		   System.out.println(obj4.d);// reference C wins
		   System.out.println(((P)obj4).d);// TO print d of P using type cast
		   System.out.println(obj4.d1);
		   System.out.println(obj4.d2); // compiler will not give error
		   
		   obj4.fun();
		   ((P)obj4).fun(); // use less as functions are resolved in a different way than data variables
		   // we cannot access fun function of P (if new C is written) 
		   obj4.fun1();
		   obj4.fun2();
	}

}
