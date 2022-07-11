package javawithmehanth;

import java.util.Scanner;

public class conditionalsta {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age==18){
            System.out.println("you can drive ");
        }
        else {
            System.out.println("You cant drive");
        }
    }
}
