class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class D_try {
    public static void main(String[] args){
        A a = new B();
        B b = (B)a;
        B bdash = (B) new A();
    }
}