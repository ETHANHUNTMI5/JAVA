package oopsAndStacks;

public class StudentsClient {

	public static void main(String[] args) throws Exception {

		 // only array no student created yet
     Students[] studentX = new Students[1000];
     
    // Students.MaxStudents=5;
     for(int i =0;i<studentX.length;i++)
     {
    	 
    	 studentX[i]= new Students(i+"th");
    	 System.out.println(studentX[i].getName());
    	 System.out.println(Students.GeNumOfStu());
     }
		
 
      //studentX[250].RollNo=10;
  // cannot be changed due to use of final keyword
     
     System.out.println(studentX[250].RollNo);
     System.out.println(studentX[250].getName());
     
     studentX[250].setName("ABC");
     System.out.println(studentX[250].RollNo);
     System.out.println(studentX[250].getName());
     
     // static belongs to whole class and not any individual variable
      
     
     studentX[250].NonStaticFunction();
     studentX[250].StaticFunction();// this line is less used as static is mainly used for whole class
     Students.StaticFunction();
     
     
     
    studentX[350].setUni("blue");
   System.out.println(studentX[250].getuni());
     // we changed the color of roll no 350 but the uniform of 250 is also changed because "uni" is a static
    // String so it belongs to a class hence it is changed for the whole class
	}

}
