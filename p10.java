public class p10 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("From Class B:");
        b.display();

        C c = new C();
        System.out.println("\nFrom Class C:");
        c.display();
    }
}
class A {
    int defaultVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30;
    public int publicVar = 40;
}

class B extends A {
    public void display() {
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

class C {
    public void display() {
        A obj = new A();
        System.out.println("Public: " + obj.publicVar);
    }
}
