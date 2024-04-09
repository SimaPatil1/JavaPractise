package Oops;

public class MethodOverride6 extends MethodOverride5{
public void cook() {
	System.out.println("Sister is cooking");
}
public void angry() {
	System.out.println("Father is angry");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MethodOverride6 st=new MethodOverride6();
	st.cook();
	st.angry();
	st.eat();
	st.handwash();
	
	}

}
