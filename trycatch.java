package javawithmehanth;

import org.w3c.dom.ls.LSOutput;

public class trycatch {
    public static void main(String[] args) {
        int a=60000;
        int b=2;
        try {
            int c=a/b;
        }
        catch (Exception e){
            System.out.println("Sorry we are failed to divide reason:");
            System.out.println(e);

        }
        System.out.println("End");

    }

}
