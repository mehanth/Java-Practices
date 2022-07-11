package javawithmehanth;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age my bouiii");
        Scanner scanner= new Scanner(System.in);
        int age  = scanner .nextInt();
        if ( age <5){
            System.out.println("You are a baby");
        }
        else if (age <10) {
            System.out.println("your a boy my boiii");
        }
        else if (age <18){
            System.out.println("you are a kid my boiii");
        }
        else {
            System.out.println("you are an adult my bouiiii");
        }
    }

}
