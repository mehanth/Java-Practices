package javawithmehanth;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        System.out.println("enter age and i will tell your future, hey idiot enter until 40 only 10 i am lazyokay round figure your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 20 -> System.out.println("you will became men");
            case 30 -> System.out.println("you will became husband");
            case 40 -> System.out.println("you will became father");
            default -> System.out.println("you can rule the world");
        }
    }
}
