package Java;

public class Devloping implements InterFacr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Devloping de=new Devloping();
		de.checkingbalance();
		de.paycreditcard();
		de.paycreditcard();
		de.Login();

		InterFacr dr=new Devloping();
		dr.checkingbalance();

	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub

	}
	public void Login() {
		System.out.println("Investment");
	}

}
