package bpack;
import apack.a;
class B extends A {
    public void display() {
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
