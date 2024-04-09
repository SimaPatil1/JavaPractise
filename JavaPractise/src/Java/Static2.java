package Java;

public class Static2 {
 int roll;//declaring global variable
 String name; //declaring glob
 String college;
 //getter method has return type
     public String Name() {
    	 System.out.println("");
	return name;
      }
   //void method - return type not required
     
     public void name() {
    	 System.out.println(name);
     }
     
 public static void main(String[] args) 
 {
	Static2 s2=new Static2();
	System.out.println(s2.roll); //0
 System.out.println(s2.name);  //null
 System.out.println(s2.college); //null
 
 }
}
