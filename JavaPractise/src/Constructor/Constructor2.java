package Constructor;

public class Constructor2 {
  //Constructor overloading
	Constructor2(){
		System.out.println("no arg constructor");
	}
	Constructor2(int a){
		System.out.println("int arg constrctor");
	}
	Constructor2(String b){
		System.out.println("String are constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 s2=new Constructor2();
		Constructor2 s3=new Constructor2(3);
		Constructor2 s4=new Constructor2("hello");
	}

}
