package javawithmehanth;

interface Animal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
public class defaultmethods implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    public static void main(String[] args) {
        defaultmethods obj1 = new defaultmethods();
        obj1.bark();
        obj1.say();

    }


}