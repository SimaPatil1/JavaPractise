package Operator;

public class unaryOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a= 7;
     int b= 8;
     
     System.out.println(a++); //7 8
     //7
     System.out.println(a++ + --a);//8 9 + 8 8
     //8+8=16
     System.out.println(a-- + ++a);//8 7 + 8 8
     //8+8=16
     
     System.out.println(b++ - b--); //8 9 - 9 8
     //8-9=-1
     
     System.out.println(b++ + ++b);//8 9 + 10 10
     //8+10=18
     
     System.out.println(b++ + ++b);//10 11 12 12
     //10+12=22
     System.out.println(b);//12
     
     System.out.println(a++ + b++);//8 9 + 12 13
     //8+12=20
     
     
//     System.out.println(a++); //10, 11
//     System.out.println(a++ + ++a); //11, 12, 13,13
//     //(10, 11+13= 24)
//     System.out.println(a+ a++);  //13 +13 14
//     //13+13=26
//     System.out.println(a-- + a++);//14 13 13 14
//     //14+13=27
//     
//     System.out.println(b++ + b--); //10 11 11 10
//     //10+11=21
//     System.out.println(b++ + b--); //10 11 + 11 10
//     //10+11=21
//     System.out.println(b);//10
	}

}
