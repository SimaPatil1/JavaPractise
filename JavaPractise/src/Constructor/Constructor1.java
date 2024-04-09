package Constructor;

public class Constructor1 {
   
	int id;
	String name;
	String address;
	//default constructor
	Constructor1(){
		System.out.println("hello default consrctor");
	}
	//parameterized constrctor
	Constructor1(int a, String b, String c){
		this.id=a;
		this.name=b;
		address=c;
		
	}
	//non static
	public void displayInfo() {
		System.out.println(id +" "+name+" "+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default constructor
		Constructor1 c2=new Constructor1();
	     //Parameterized constructor
	 Constructor1 c3=new Constructor1(1, "John","London");
	 c3.displayInfo();
	
	 Constructor1 c4=new Constructor1(2, "Alex","London");
	 c4.displayInfo();
	}

}
