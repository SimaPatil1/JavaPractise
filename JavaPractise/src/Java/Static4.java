package Java;

public class Static4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Static3 s3=new Static3(14,"tork","hgu");
    Static3 s4=new Static3(18,"Motors","hgs");
    Static3 s7=new Static3(20,"Kratos","hgu");
    
    Static2 a1=new Static2();
    System.out.println(a1.Name());
    a1.name();
    
    s3.getResult();
    s4.getResult();
    s7.getResult();
	}

}
