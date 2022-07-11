package javawithmehanth;

import java.security.spec.ECField;
import java.util.Scanner;

public class specificexceptions {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks [0] = 100;
        marks [1] = 50;
        marks [2] = 25;
//        marks [3] =5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index you want");
        int i = sc.nextInt();
//        System.out.println("Enter the one you wanna divide");
//        int d = sc.nextInt();
//        try {
//            System.out.println("the index is " + marks[i]);
//            System.out.println("the divide of num u want" + marks[i] / d);}
//        catch (Exception e){
//            System.out.println("it is an ");
//            System.out.println(e);
//        }
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException is out of bounds");
//            System.out.println(e);
//        }
//        catch (ArithmeticException e ){
//            System.out.println("ArithmeticException is this");
//            System.out.println(e);
//        }
        try {
            System.out.println("Welcome to video no 82");
            try {
                System.out.println(marks[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
    }