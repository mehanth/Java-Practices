package javawithmehanth;

class A{
    int a;
    public int mehanth(){
        return 4;
    }

    public void meth2(){
        System.out.println("1 constructor of a");

    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("2 constructor of b");
    }
    public void meth3(){
        System.out.println("3constructor of b");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();
        B b = new B();
        b.meth2();
    }
}
