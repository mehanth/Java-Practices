package javawithmehanth;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//class parent1{
//    String mehanth;
//    parent1(){
//        System.out.println("bruh whatsup constructor man");
//    }
//
//    public String getMehanth() {
//        return mehanth;
//    }
//
//    public void setMehanth(String mehanth) {
//        this.mehanth = mehanth;
//    }
//
//}
//class child1 extends parent1{
//    int m;
//    child1(){
//        System.out.println("inherited class man ");
//    }
//    public int getM(){
//        return m;
//    }
//    public void setM(int m){
//        this.m=m;
//    }
//}
//class grand1 extends child1{
//    grand1(){
//        System.out.println("grand one constrctor");
//    }
//}
//public class constructorsininheritance {
//    public static void main(String[] args) {
//        parent1 m = new parent1();
////        child1 c = new child1();
////        grand1 g = new grand1();
//
//    }
//} constructor overloading in inheritance in java

class parent1{
    public parent1(){
        System.out.println("parent 1 cons");
    }
    public parent1(int x) {
        System.out.println("parent 1 " + x);
    }

}
class child1 extends parent1{
   public child1(){
       System.out.println("child constructor");
   }
   public child1(int x, int y){
       super(x);
       System.out.println("child values" + y);

   }
}
class grand1 extends child1{
    public grand1(){
        System.out.println("grand cons");
    }
    public grand1(int x, int y , int z){
        super(x,y);
        System.out.println("values " +z);

    }
}
public class constructorsininheritance {
    public static void main(String[] args) {
//        parent1 p = new parent1();
//        parent1 p =new parent1(5);
//      child1 c = new child1(1,2);
//        child1 c = new child1();
        grand1 u = new grand1();
        grand1 g = new grand1(2,4,5);

    }
}

