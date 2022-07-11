package javawithmehanth;

import java.util.Scanner;

public class cbseex1 {
    public static void main (String[] args){
        Scanner marks = new Scanner(System.in);
        System.out.println("ENter marks of sunject1");
        int sub1 = marks.nextInt();
        System.out.println("Enter subject 2");
        int sub2 = marks.nextInt();
        System.out.println("ENter sub 3");
        int sub3 = marks.nextInt();
        System.out.println("enter sub 4");
        int sub4 = marks.nextInt(7);
        System.out.println("Enter sub 5");
        int sub5 = marks.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println(sum*100/500);
    }
}
