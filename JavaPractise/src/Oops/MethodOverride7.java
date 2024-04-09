package Oops;

public class MethodOverride7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MethodOverride5 sp=new MethodOverride6();
   //refer the name of parent class and creating the object of child class
	//only called parent class method called
   //child class method skip
   //and this method is called dynamic method dispatched
   sp.cook();
	sp.eat();
	sp.handwash();
	//sp.angry();
	
	}

}
