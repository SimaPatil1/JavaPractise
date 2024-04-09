package Interface;

import Oops.Inheritance;

public class Interface5 extends Inheritance implements Interface4, Interface3 {

    public static void main(String[] args) {
        Interface5 i5 = new Interface5();
        i5.a();
        i5.b();
        System.out.println(i5.roll);
    }

    public void a() {
        System.out.println("a method");
    }

    public void b() {
        System.out.println("b method");
    }
}
