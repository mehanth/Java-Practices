package javawithmehanth;

import java.util.Scanner;

public class chapter4practice {
    public static void main(String[] args) {
//        question 2
//        float m1,m2,m3;
//        System.out.println("enter your marks in maths");
//        Scanner marks = new Scanner(System.in);
//        float m = marks.nextFloat();
//        System.out.println("Enter your marks in physics");
//        float p = marks.nextFloat();
//        System.out.println("enter your marks in chemistry");
//        float c = marks.nextFloat();
//        float avg = (m+p+c)/3.0f;
//        System.out.println("your total percentage is " + avg);
//        if (avg>=40 && m>=33 && p>=33 && c>=33){
//            System.out.println("YOu have passed mofo congratulations");
//                }
//        else{
//            System.out.println("You have failed ");}

//question 3
//        float tax =0;
//        System.out.println("enter your income  ");
//        Scanner scanner = new Scanner(System.in);
//         float income = scanner.nextFloat();
//
//         if (income< 250000){
//             tax = tax + 0;
//         }
//          else if(income>=250000 && income<=500000){
//             tax = tax + 0.05f * income;
//          }
//          else if (income>500000 && income<1000000){
//              tax = tax +0.20f * income;
//          }
//          else if (income>=1000000){
//              tax = tax +0.30f * income;
//          }
//        System.out.println("your tax is "+ tax );

//        question 4
//        System.out.println("enter the number to find the day");
//        Scanner scanner = new Scanner(System.in);
//        int week = scanner.nextInt();
//        int day = week;
//        switch (day) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("THursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//        }

//question 6
    Scanner scanner = new Scanner(System.in);

        System.out.println("enter the website u wanted to know");
        String website = scanner.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("It is an commercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println("it is an organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is an indian website");
        }
        else {
            System.out.println("it is a fake url");
        }


    }
}