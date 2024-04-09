package Oops;

public class Encapsulation1 {

	String name; //global variable
    int b;
    final int c=2;//final variable cannt change the value
   //used to restrict the user
    //final can be method,variable,class
    //final variable-cannt change value
    //final method- cannot override
    //final class-u cannot extend
    public void a() {
    	
    }
    final void d() {
    	System.out.println("final method");
    }
    public void setName(String s) {
//    if you send a value to the setName() method, it won't change the name variable because you're explicitly setting it to "sita" within the method	
    	//name="Sita";
    	this.name=s;
    	this.b=5;
    	//System.out.println(name);
    	System.out.println(b);//5
        System.out.println(c);//5
    }
    
    public String getName() {
    	return name;
    }
    

}
