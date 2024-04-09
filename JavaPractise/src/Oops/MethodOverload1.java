package Oops;
//same class, same method ,but different parameter
//happen with number of parameter and type of parameter
public class MethodOverload1 {

	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
