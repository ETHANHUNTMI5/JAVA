package oopsAndStacks;

public class PersonClient {

	public static void main(String[] args) {
 
		Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person(20);
        Person p4 = new Person("Raj",22);

        //        System.out.println(p1.age);
//		System.out.println(p1.name);
//    
//	
//		p2.name="XYZ";
//		p2.age=20;
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//	}
	
 
//        p1.setName("Rohan");
//        p1.setAge(20);
//        p2.setName("Rahul");
//        p2.setAge(22);
//        
        
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p3.getName());
        System.out.println(p3.getAge());
        System.out.println(p4.getName());
        System.out.println(p4.getAge());
        
        
}}
