class D{
    public void meth1(){
        System.out.println("i am method 2 of class A");
    }
}
class E extends D{
}
public class nover2nover {
    public static void main(String[] args) {
D d = new D();
d.meth1();
E e = new E();
e.meth1();
    }
}
