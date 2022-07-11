package javawithmehanth;

import java.util.Scanner;

public class practiceinterview {
    public static void main(String[] args) {
        int x,y,t;
        System.out.println("Enter numbers you wanna swap");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        y=sc.nextInt();
        System.out.println(x + "" + y);
        t=x;
        x=y;
        y=t;
        System.out.println( "SWapped numbers " + x +"" +y);
    }
}
