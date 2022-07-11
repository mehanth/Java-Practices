package javawithmehanth;
class phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void on(){
        System.out.println("java in class 1");
    }
}
class smartphone extends phone{
    public void on(){
        System.out.println("jave in class 2");
    }
    public void greet(){
        System.out.println("method 3 ");
    }
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        phone n = new smartphone();
        n.on();
        n.greet();



    }
}
