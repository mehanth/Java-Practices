package javawithmehanth;

class access{
    public int a=1;
    protected   int b=2;
     int c=3;
   private int d=4;
   public void meth(){
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
   }
   class man extends javawithmehanth.access {
       int e=5;
       public void meth1(){
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
           System.out.println(d);
       }
   }
}
public class accees_modifiers {
    public static void main(String[] args) {
//        access x = new access();
//x.meth();
//        System.out.println(x.a);
//        System.out.println(x.b);
//        System.out.println(x.c);
//        System.out.println(x.d); this is private we cant access


    }
}
