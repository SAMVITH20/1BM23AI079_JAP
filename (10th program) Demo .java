package Demo;
import apack.A;
import bpack.B;
import cpack.C;

public class Demo{
    public static void main(String[] args) {
        B b = new B();
        System.out.println("From Class B:");
        b.display();

        C c = new C();
        System.out.println("\nFrom Class C:");
        c.display();
    }
}





