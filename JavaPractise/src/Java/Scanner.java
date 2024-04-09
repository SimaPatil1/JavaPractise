package Java;

public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextDouble();
        double s = scan.nextDouble();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

	private double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}


