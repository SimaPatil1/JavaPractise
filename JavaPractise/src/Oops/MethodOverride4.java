package Oops;

public class MethodOverride4 extends MethodOverride3 {

	public void run() {
		System.out.println("You are running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MethodOverride4 st=new MethodOverride4();
    st.run();
    MethodOverride3 sp=new MethodOverride3();
	sp.run();
	}

}
