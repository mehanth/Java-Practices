package javawithmehanth;


 abstract class parent5 {

     public parent5() {
         System.out.println("hi bruh");

     }

     public void greet() {
         System.out.println("good mrng brother");
     }

     abstract public void greet2() ;
 }
 class child4 extends parent5{
     public void greet2(){
         System.out.println("mehanth 2");

     }

        }

public class abstractclass_methods {
    public static void main(String[] args) {
        child4 p = new child4();

    }
}
