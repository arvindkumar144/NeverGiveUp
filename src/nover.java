class A{
    public int a;
    public int herry(){
        return 4;
    }
    public void meth2() {
        System.out.println("i am method  2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("iam method 3 of class B");
    }
}
public class nover{
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}