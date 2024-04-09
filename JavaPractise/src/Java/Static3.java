package Java;

public class Static3 {
    int roll;   //declaring global variable
    String name;  //declaring global variable
    String value;
    static String college="IIT Bombay";//declaring global variable
	//constructor-same class name
    Static3(int r, String n, String p){
    	roll=r;
    	name=n;
    	this.value=p;
    	
    	
    }
    public void getResult() {
    	System.out.println(roll+" " +name+" "+college+" " +value);
    }
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Static3 rj=new Static3(3,"hell0","get");
     //System.out.println(rj.roll+" " +rj.name+" "+college+ " "+ rj.value);
     
     rj.getResult();
    		 
	}

}
