package javawithmehanth;

public class methodoverloading {
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good morning "+a);
    }
    static void foo(int a, int b){

        System.out.println("hey dude " + a + " " + b);
    }

    public static void main(String[] args) {
        foo();
        foo(814);
        foo(814,143);
    }
}